package com.ohgiraffers.practice.list;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("장민석");
        list.add(100);
        list.add(false);
        list.add(new java.util.Date());
        list.add(3.14);
        list.add('a');

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());

        for (Object obj : list) {
            System.out.println(obj);
        }

        list.set(2, false);

        System.out.println(list);

    }
}
