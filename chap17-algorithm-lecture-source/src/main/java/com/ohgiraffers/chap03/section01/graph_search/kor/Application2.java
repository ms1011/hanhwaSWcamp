package com.ohgiraffers.chap03.section01.graph_search.kor;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/* 수업목표. BFS와 x, y좌표를 활용한 문제를 해결할 수 있다 (배열의 인덱스와 반대 개념) */
/* 필기.
 *  너비 우선 탐색(Breadth-First Search)
 *   선입선출 구조에 queue를 활용한다
 *   시작 노드에서 출발해 시작 노드를 기준으로 가까운 노드를 먼저 방문하면서 탐색하는 알고리즘이다
* */
public class Application2 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    static Queue<Node> q = new LinkedList<>();

    /* 설명. 상하좌우 개념의 좌표 배열들 */
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};

    /* 설명. 배추밭 */
    static int 배추밭[][];

    /* 설명. 방문한 배추 좌표 배열 */
    static boolean 방문[][];

    /* 설명. 현재 위치에 대한 좌표 */
    static int 바라보는_X, 바라보는_Y;

    /* 설명. 배추밭의 크기와 심어진 배추의 갯수 */
    static int 배추밭의_세로길이, 배추밭의_가로길이, 배추의_수;

    /* 설명. 필요한 배추흰지렁이 수 */
    static int 배추흰지렁이_수;

    /* 설명. x와 y좌표를 인지하는 static 내부 클래스 */
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        배추밭의_가로길이 = Integer.valueOf(st.nextToken());
        배추밭의_세로길이 = Integer.valueOf(st.nextToken());
        배추의_수 = Integer.valueOf(st.nextToken());

        배추밭 = new int[배추밭의_세로길이][배추밭의_가로길이];
        방문 = new boolean[배추밭의_세로길이][배추밭의_가로길이];

        /* 설명. 배추밭에 배추 심기 */
        for (int i = 0; i < 배추의_수; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());

            /* 설명. 입력 받은 x, y 좌표와 배열을 만들 때의 순서(행, 열)는 반대의 개념이다 */
            배추밭[y][x] = 1;
        }
        
        배추흰지렁이_수 = 0;
        for (int i = 0; i < 배추밭의_세로길이; i++) {
            for (int j = 0; j < 배추밭의_가로길이; j++) {
                
                /* 설명. 방문 안한 위치에 배추가 심어져 있다면 */
                if(방문[i][j] == false && 배추밭[i][j] == 1) {
                    배추흰지렁이_수++;
                    bfs(j, i);          // bfs의 인자는 x좌표, y좌표 순으로 받을 것이므로 i와 j를 확인하고 넘겨준다
                }
                
            }
            
        }

        return 배추흰지렁이_수;
    }

    /* 설명. 상하좌우에 배추가 심어져 있으면 한번씩 동작(기본적으로는 이렇고 방문 배열에 대해서는 다른 의미) */
    static void bfs(int x, int y) {
        q.offer(new Node(x, y));
        방문[y][x] = true;

        /* 설명. 연속적으로 상하좌우에 배추가 심어져 있다면 반복한다 */
        while (!q.isEmpty()) {
            Node node = q.poll();

            /* 설명. 상하좌우 살펴보기 */
            for (int i = 0; i < 4; i++) {
                바라보는_X = node.x + dirX[i];
                바라보는_Y = node.y + dirY[i];

                /* 설명. 지금 보는 방향이 좌표로써 존재하면서 방문한 적이 없고 배추가 심어져 있다면 */
                if(range_check() && 방문[바라보는_Y][바라보는_X] == false && 배추밭[바라보는_Y][바라보는_X] == 1) {
                    q.offer(new Node(바라보는_X, 바라보는_Y));
                    방문[바라보는_Y][바라보는_X] = true;
                }
            }
        }
    }

    private static boolean range_check() {
        return 바라보는_X >= 0 && 바라보는_X < 배추밭의_가로길이 && 바라보는_Y >= 0 && 바라보는_Y < 배추밭의_세로길이;
    }
}
