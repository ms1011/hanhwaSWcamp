package com.ohgiraffers.practice.singleton;

public class Application {
    public static void main(String[] args) {
        Earth earth = Earth.getInsatnce();
        System.out.println(earth.isSunUp());
        earth.sunUp();
        System.out.println(earth.isSunUp());
    }
}
