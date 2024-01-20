package com.ohgiraffers.practice.inteface;

public class Application {
    public static void main(String[] args) {
        // 학원 생성
        Academy academy = new Academy();

        BackendProgrammer[] backendProgrammers = new BackendProgrammer[3];
        FrontendProgrammer[] frontendProgrammers = new FrontendProgrammer[3];

        backendProgrammers[0] = new BackendProgrammer("장민석", "wkdalstjr@gmail.com");
        backendProgrammers[1] = new BackendProgrammer("홍길동", "ghdrlfehd@gmail.com");
        backendProgrammers[2] = new BackendProgrammer("이순신", "dltnstls@gmail.com");

        frontendProgrammers[0] = new FrontendProgrammer("유재석", "dbwotjr@gmail.com");
        frontendProgrammers[1] = new FrontendProgrammer("강호동", "rkdghehd@gmail.com");
        frontendProgrammers[2] = new FrontendProgrammer("신동엽", "tlsehdduq@gmail.com");

        academy.applyStudent(backendProgrammers);
        academy.applyStudent(frontendProgrammers);

        for (int i = 0; i < 3; i++) {
            backendProgrammers[i].study();
        }

        for (int i = 0; i < 3; i++) {
            frontendProgrammers[i].study();
        }

        System.out.println(backendProgrammers[1]);
        System.out.println(frontendProgrammers[2]);

        academy.quitStudent(backendProgrammers[2]);
        academy.quitStudent(frontendProgrammers[1]);

    }
}
