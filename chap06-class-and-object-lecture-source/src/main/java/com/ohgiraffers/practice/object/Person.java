package com.ohgiraffers.practice.object;

public class Person {
    private String name;
    private int height;
    private int weight;
    private int age;
    private double footsize;
    private char gender;
    private static int count = 0;

    Walk walk = new Walk();

    public Person() { count++; }
    public Person(String name, int height, int weight, int age, double footSize, char gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.footsize = footSize;
        this.gender = gender;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFootsize() {
        return footsize;
    }

    public void setFootsize(double footsize) {
        this.footsize = footsize;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", footsize=" + footsize +
                ", gender=" + gender +
                '}';
    }
}
