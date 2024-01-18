package com.ohgiraffers.practice;

public class Computer extends Device {

    private boolean screen;

    public Computer() {
        System.out.println("Computer 기본생성자 호출됨...");
    }

    @Override
    public void on() {
        super.on();
        if (isPower()) {         // 전원이 켜져있다면
            screen = true;      // 화면 켜기
            System.out.println("화면이 켜졌습니다");
        }
    }

    @Override
    public void off() {
        super.off();
        if (!isPower()) {         // 전원이 꺼져있다면
            screen = false;      // 화면 켜기
            System.out.println("화면이 꺼졌습니다");
        }
    }

    public void type() {
        System.out.println("타이핑을 시작합니다");
    }
}
