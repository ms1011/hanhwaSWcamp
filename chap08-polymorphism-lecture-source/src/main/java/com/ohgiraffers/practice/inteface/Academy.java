package com.ohgiraffers.practice.inteface;

public class Academy implements PersonalManagement {
    // 학원 등록 구현
    @Override
    public void applyStudent(Student student) {
        System.out.println(student.name + " 학생이 학원을 등록하였습니다.");
        System.out.println("이메일 : " + student.email);
    }

    // 단체 등록 구현
    public void applyStudent(Student[] students) {
        for (Student student : students) {
            System.out.println(student.name + " 학생이 학원을 등록하였습니다.");
            System.out.println("이메일 : " + student.email);
        }
    }

    // 학원 끊기 구현
    @Override
    public void quitStudent(Student student) {
        System.out.println(student.name + " 학생이 학원을 그만두었습니다.");
        System.out.println("이메일 : " + student.email);
    }
}
