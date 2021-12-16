package com.icss_03;

import java.util.Scanner;

public class AreaTest {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入圆的半径：");
        System.out.println("圆的面积是：" + area.getArea(sc.nextDouble()));

        System.out.println("请输入长方形的长和宽：");
        System.out.println("长方形的面积是：" + area.getArea(sc.nextInt(), sc.nextInt()));

        System.out.println("请输入三角形的底和高：");
        System.out.println("三角形的面积是" + area.getArea(sc.nextDouble(), sc.nextDouble()));
    }
}
