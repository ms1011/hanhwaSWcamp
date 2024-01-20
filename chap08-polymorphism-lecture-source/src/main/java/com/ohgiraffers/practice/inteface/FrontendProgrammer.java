package com.ohgiraffers.practice.inteface;

public class FrontendProgrammer extends Student {
    public FrontendProgrammer() {}

    public FrontendProgrammer(String name, String email) {
        super(name, email);
    }

    @Override
    public void study() {
        System.out.println(name + "학생은 Frontend 공부를 합니다");
    }
}
