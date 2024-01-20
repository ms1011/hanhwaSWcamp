package com.ohgiraffers.practice.inteface;

public abstract class Student {
    String name;
    String email;

    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }


    // study 추상메소드
    public abstract void study();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
