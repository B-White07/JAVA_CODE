package com.icss_05;

import java.util.Scanner;

public class NumTest {
    public static void main(String[] args) {
        Number num = new Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要计算的两个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "+" + b + "=" + num.addition(a, b));
        System.out.println(a + "-" + b + "=" + num.subtration(a, b));
        System.out.println(a + "*" + b + "=" + num.multiplication(a, b));
        System.out.println(a + "/" + b + "=" + num.division(a, b));
    }
}
