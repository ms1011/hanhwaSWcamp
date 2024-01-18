package com.ohgiraffers.practice;

public abstract class Device {
    private boolean power;

    public Device() {
        System.out.println("Device 기본생성자 호출됨...");
    }
    public void on() {
        if(power){
            System.out.println("전원이 이미 켜졌있습니다");
        } else {
            power = true;
            System.out.println("전원이 켜졌습니다");
        }
    }
    public void off() {
        if(power){
            power = false;
            System.out.println("전원을 종료하였습니다");
        } else {
            System.out.println("전원이 이미 꺼져있습니다");
        }
    }

    public boolean isPower() {
        return power;
    }
}
