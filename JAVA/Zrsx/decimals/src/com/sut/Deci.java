package com.sut;

import java.util.Arrays;
import java.util.Scanner;

public class Deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the num:");
        double num = sc.nextDouble();
        System.out.println("please input bit u want to save:");
        int bit = sc.nextInt();
        System.out.println(roundNum(num, bit));

    }

    public static String roundNum(double num, int n) {
        int[] bit = new int[10];
        int inte = (int)num;
        double temp = num;
        String stringTemp = "";
        stringTemp += inte;
        stringTemp += ".";
        for (int i = 0; i <= n; i++) {
            bit[i] = (int) (temp * 10 % 10);
            temp *= 10;
            if (bit[n] >= 5) {
                bit[n - 1] += 1;
            }
        }

//        for(int i:bit){
//            System.out.println(i);
//        }
        String str = "";
        str += num;
        String[] string = str.split("\\.");
        int[] replace = new int[string[1].length()];
        for (int i = 0; i < string[1].length(); i++) {
            replace[i] = Integer.parseInt(String.valueOf(string[1].charAt(i)));
        }

        /*for (String str1 : string) {
            System.out.println(str1);
        }*/

        for (int i = 0; i < n; i++) {
            replace[i] = bit[i];
            stringTemp += replace[i];
        }

        return stringTemp;
    }
}


