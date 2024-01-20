package com.ohgiraffers.practice.abstractclass;

public class Laptop extends Computer {
    private boolean cover;
    public Laptop() {
        System.out.println("Laptop 기본생성자 호출됨...");
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Laptop이 켜졌습니다");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("Laptop이 꺼졌습니다");
    }

    public void open() {
        if(cover){
            System.out.println("노트북을 엽니다");
        } else {
            cover = true;
            System.out.println("노트북이 이미 열려있습니다");
        }
    }

    public void close() {
        if(cover){
            cover = false;
            System.out.println("노트북을 덮습니다");
        } else {
            System.out.println("노트북이 이미 덮혀있습니다");
        }
    }
}
