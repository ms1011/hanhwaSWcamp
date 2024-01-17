package com.ohgiraffers.practice.singleton;

public class Earth {

    private static Earth earth;

    private static boolean isDay;
    public static Earth getInsatnce() {

        if(earth == null) {
            earth = new Earth();
        }

        return earth;
    }

    public void sunUp() {
        isDay = true;
    }
    public void moonUp() {
        isDay = false;
    }
    public String isSunUp() {
        String answer = "";
        if(isDay) {
            answer = "둥근 해가 떴습니다";
        } else {
            answer = "둥근 달이 떴습니다";
        }
        return answer;
    }
}
