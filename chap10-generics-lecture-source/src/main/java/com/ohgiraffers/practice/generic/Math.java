package com.ohgiraffers.practice.generic;

public class Math extends Book{
    public Math() {
        System.out.println("hi");
    }

    @Override
    public void bookName() {
        System.out.println("수학책입니다");
    }
}
