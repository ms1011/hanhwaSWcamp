package com.ohgiraffers.practice.object;

public class Walk {
    private boolean walking;
    private boolean running;
    private int distance = 0;
    private static int totalDistance = 0;

    public Walk() {}

    public void go() {
        if(!walking){
            walking = true;
            running = false;
            System.out.println("걷기를 시작합니다");
            goDistance();
        } else {
            System.out.println("이미 걷고 있습니다");
        }
    }

    public void run() {
        if(!running) {
            running = true;
            walking = false;
            System.out.println("달리기를 시작합니다");
            runDistance();
        } else {
            System.out.println("이미 달리고 있습니다");
        }
    }

    public void stop() {
        if(running || walking) {
            walking = false;
            running = false;
            System.out.println("이동을 멈춥니다");
        } else {
            System.out.println("이미 정지한 상태입니다");
        }
    }

    private void goDistance() {
        distance += 10;
        totalDistance += 10;
    }

    private void runDistance() {
        distance += 20;
        totalDistance += 20;
    }

    public boolean[] getStatus() {
        boolean[] status = new boolean[2];
        status[0] = walking;
        status[1] = running;
        return status;
    }

    public int getDistance() {
        return distance;
    }

    public static int getTotalDistance() {
        return totalDistance;
    }
}
