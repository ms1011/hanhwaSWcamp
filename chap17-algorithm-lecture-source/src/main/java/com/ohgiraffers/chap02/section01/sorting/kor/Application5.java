package com.ohgiraffers.chap02.section01.sorting.kor;


/* 수업목표. 병합 정렬을 이해할 수 있다 */
/* 필기.
 *  병합 정렬(Merge Sort)
 *   데이터를 분할하고 분할한 집합을 정렬해서 합치는 방식(분할 정복 방식)으로 정렬한다
 *   시간 복잡도는 O(logn)이다
* */
public class Application5 {
    public static void solution(int low위치, int high위치, int[] arr) {

        int[] 임시배열 = new int[high위치 + 1];

        if(high위치 - low위치 == 0) return;

        int 중간위치 = low위치 + (high위치 - low위치) / 2;

        System.out.println("low위치 = " + low위치 + " high위치 = " + high위치);

        /* 설명. 좌측 절반 정렬 */                                  /* 설명. 우측 절반 정렬 */
        solution(low위치, 중간위치, arr);                 solution(중간위치 + 1, high위치, arr);

        /* 설명. 정렬 전 temp에 배열 복사 */
        임시배열 = arr.clone();

        /* 설명. 분할 정복 방식으로 작은 값부터 값을 쌓음 */
        int 실제배열인덱스 = low위치;
        int 좌측배열_위치 = low위치;
        int 우측배열_위치 = 중간위치 + 1;

        /* 설명. 두 인덱스가 가리키는 값들을 비교하고 하나라도 분할 구역의 끝을 만나면 멈추는 반복문 실행 */
        while (좌측배열_위치 <= 중간위치 && 우측배열_위치 <= high위치) {
//            if(temp[index1] > temp[index2]) {     // 오름차순
            if(임시배열[좌측배열_위치] < 임시배열[우측배열_위치]) {       // 내림차순
                arr[실제배열인덱스] = 임시배열[우측배열_위치];
                실제배열인덱스++;
                우측배열_위치++;
            } else {
                arr[실제배열인덱스] = 임시배열[좌측배열_위치];
                실제배열인덱스++;
                좌측배열_위치++;
            }
        }

        /* 설명. 좌측 인덱스 마저 옮기기 */
        while (좌측배열_위치 <= 중간위치) {
            arr[실제배열인덱스] = 임시배열[좌측배열_위치];
            실제배열인덱스++;
            좌측배열_위치++;
        }

        /* 설명. 우측 인덱스 마저 옮기기 */
        while (우측배열_위치 <= high위치) {
            arr[실제배열인덱스] = 임시배열[우측배열_위치];
            실제배열인덱스++;
            우측배열_위치++;
        }
    }

}
