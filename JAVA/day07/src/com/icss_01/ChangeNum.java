package com.icss_01;

public class ChangeNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("交换前：a = " + a);
        System.out.println("交换前：b = " + b);
        System.out.println("---------------");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后：a = " + a);
        System.out.println("交换后：b = " + b);
    }
}
