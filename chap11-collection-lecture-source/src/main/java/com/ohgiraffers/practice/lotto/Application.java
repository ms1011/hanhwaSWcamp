package com.ohgiraffers.practice.lotto;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 설명. 과제. 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기(TreeSet 사용하지 않고) */
        int[] lotto = new int[6];
        boolean flag = false;
        for (int i = 0; i < 6; i++) {
            flag = false;
            int num = (int)((Math.random() * 45) + 1);
            for (int j = 0; j < lotto.length; j++) {
                if(lotto[j] == num) {
                    flag = true;
                }
            }
            if(!flag) {
                lotto[i] = num;
            } else {
                i--;
            }
        }

        Arrays.sort(lotto);
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

    }
}
