package com.ohgiraffers.practice;

public class SmartPhone extends Computer {
    public SmartPhone() {
        System.out.println("SmartPhone 기본생성자 호출됨...");
    }

    public void touch() {
        System.out.println("화면을 터치합니다");
    }
}
