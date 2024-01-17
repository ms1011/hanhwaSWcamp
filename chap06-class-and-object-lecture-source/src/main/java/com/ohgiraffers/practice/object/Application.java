package com.ohgiraffers.practice.object;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Person("홍길동", 187, 80, 24, 274.5, '남');
        people[1] = new Person("홍길서", 176, 81, 22, 280.1, '남');
        people[2] = new Person("홍길남", 199, 102, 34, 312.2, '남');
        people[3] = new Person("홍길북", 180, 69, 29, 269.1, '여');
        people[4] = new Person();

        people[0].setAge(34);
        System.out.println("people[0]의 나이 : " + people[0].getAge());

        people[1].setGender('여');
        System.out.println("people[1]의 성별 : " + people[1].getGender());

        people[2].setName("홍길순");
        System.out.println("people[2]의 이름 : " + people[2].getName());

        people[3].setHeight(165);
        System.out.println("people[3]의 키 : " + people[3].getHeight());

        people[4].setName("김이박");
        people[4].setGender('여');
        people[4].setAge(33);
        people[4].setHeight(156);
        people[4].setWeight(49);
        people[4].setFootsize(222.3);
        System.out.println(people[4]);


        people[1].walk.go();
        System.out.println(people[1].walk.getDistance());

        people[2].walk.go();
        System.out.println(people[2].walk.getDistance());
        people[2].walk.run();
        System.out.println(people[2].walk.getDistance());

        people[3].walk.run();
        System.out.println(people[3].walk.getDistance());

        people[4].walk.go();
        System.out.println(people[4].walk.getDistance());
        people[4].walk.stop();
        System.out.println(Arrays.toString(people[4].walk.getStatus()));
        people[4].walk.run();
        System.out.println(people[4].walk.getDistance());
        System.out.println(Arrays.toString(people[4].walk.getStatus()));

        System.out.println("모든 사람의 총 이동 거리 : " + Walk.getTotalDistance() + "m");

        /* 설명. 총 사람의 수 */
        System.out.println("총 사람의 수 : " + Person.getCount());
    }
}
