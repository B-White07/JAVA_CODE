package sut.cn;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int age2;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("age is :" + age);
    }
}
