package com.ohgiraffers.practice.inteface;

public class BackendProgrammer extends Student {

    public BackendProgrammer() {}

    public BackendProgrammer(String name, String email) {
        super(name, email);
    }

    @Override
    public void study() {
        System.out.println(name + "학생은 Backend 공부를 합니다");
    }
}
