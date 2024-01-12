package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다 */

        /* 목차. 1. non-static 메소드 호출 */
        com.ohgiraffers.section01.method.Calculator cal1 = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal1.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합: " + plusResult);

        /* 목차. 2. static 메소드 호출 */
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumberOf(100, 20);
        System.out.println("두 수중 큰 값 : " + maxResult);


    }
}
