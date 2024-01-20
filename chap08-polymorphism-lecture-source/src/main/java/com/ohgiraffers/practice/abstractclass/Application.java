package com.ohgiraffers.practice.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* 설명. 추상클래스인 device는 생성 불가 */
//        Device device = new Device();

        /* 설명. 자동형변환(auto up-casting), 다형성 O, 묵시적형변환 */
        System.out.println("[Computer]");
        Computer computer1 = new Desktop();

        System.out.println();
        System.out.println("[Laptop]");
        Laptop laptop = new Laptop();
        laptop.on();
        laptop.open();
        laptop.off();
        laptop.close();

        System.out.println();
        System.out.println("[Desktop]");
        Desktop desktop = (Desktop)computer1;
        desktop.on();
        desktop.type();
        desktop.scroll();
        desktop.off();

        System.out.println();
        System.out.println("[SmartPhone]");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.on();
        smartPhone.touch();
        smartPhone.off();

        System.out.println();
        System.out.println("[Tablet]");
        Tablet tablet = new Tablet();
        tablet.on();
        tablet.touch();
        tablet.draw();
        tablet.off();

        System.out.println();
        System.out.println("[Computer 배열]");
        Computer[] computers = new Computer[6];
        computers[0] = new Computer();
        computers[1] = new Desktop();
        computers[2] = new SmartPhone();
        computers[3] = new Tablet();
        computers[4] = new SmartPhone();
        computers[5] = new Laptop();

        System.out.println();
        for(Computer computer : computers) {
//            if(computer instanceof Desktop) {
//                System.out.println("[Desktop입니다]");
//                ((Desktop)computer).scroll();
//                System.out.println();
//            } else if(computer instanceof SmartPhone) {
//                System.out.println("[SmartPhone입니다]");
//                ((SmartPhone)computer).touch();
//                System.out.println();
//            } else if(computer instanceof Tablet) {
//                System.out.println("[Tablet입니다]");
//                ((Tablet)computer).draw();
//                System.out.println();
//            } else if(computer instanceof Laptop) {
//                System.out.println("[Laptop입니다]");
//                ((Laptop)computer).open();
//                System.out.println();
//            } else {
//                System.out.println("[Computer입니다]");
//                computer.on();
//                System.out.println();
//            }
            /* 필기.
             *  instanceof 연산자는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자이다
             *
             * 필기.
             *  computers[3] = new Tablet(); 로 선언된 경우
             *  if(computer instanceof Tablet) 조건에 걸려야 할 것 같지만
             *  Tablet 클래스는 SmartPhone 클래스를 상속 받았기 때문에 코드상 상위에 있는
             *  if(computer instanceof SmartPhone) 조건에 걸려 SmartPhone으로 출력이 된다
             *
             * 필기.
             *  instanceof 연산자 주의사항
             *   상속받은 클래스여도 true를 return하여 Object Instanceof Object는 항상 true를 return한다
             *   if 조건문 순서에 주의하자
            * */
            if(computer instanceof Desktop) {
                System.out.println("[Desktop입니다]");
                ((Desktop)computer).scroll();
                System.out.println();
            } else if(computer instanceof Tablet) {
                System.out.println("[Tablet입니다]");
                ((Tablet)computer).draw();
                System.out.println();
            } else if(computer instanceof SmartPhone) {
                System.out.println("[SmartPhone입니다]");
                ((SmartPhone)computer).touch();
                System.out.println();
            } else if(computer instanceof Laptop) {
                System.out.println("[Laptop입니다]");
                ((Laptop)computer).open();
                System.out.println();
            } else {
                System.out.println("[Computer입니다]");
                computer.on();
                System.out.println();
            }
        }

    }
}
