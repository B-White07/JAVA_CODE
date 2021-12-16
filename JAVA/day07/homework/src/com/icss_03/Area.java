package com.icss_03;

public class Area {
    final private double PI = 3.14;
    private double area; //面积

    public double getArea(double r) {
        return area = 2 * PI * r * r;
    }

    public double getArea(int length, int wide) {
        return area = length * wide;
    }

    public double getArea(double line, double height) {
        return area = line * height / 2;
    }
}
