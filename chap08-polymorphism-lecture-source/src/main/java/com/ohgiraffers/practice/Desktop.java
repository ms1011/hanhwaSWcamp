package com.ohgiraffers.practice;

public class Desktop extends Computer {
    public Desktop() {
        System.out.println("Desktop 기본생성자 호출됨...");
    }

    public void scroll() {
        System.out.println("마우스 스크롤 합니다");
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Desktop이 켜졌습니다");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Desktop이 꺼졌습니다");
    }
}
