package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        // 한 줄 주석
        /* 범위 주석 */

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다.*/
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');            // 문자는 single quotation(')을 적용한다.
        System.out.println('1');
        System.out.println('\u0000');       // 설명. 문자는 아무것도 안넣으면 에러가 발생하지만 안 넣고 싶으면 \u0000

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");    // 문자열은 double quotation(")을 적용한다.
        System.out.println("a");
        System.out.println("");             // 문자열은 아무것도 넣지 않아도 된다

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);          // true 또는 false 두 값만 논리값이다.

    }
}
