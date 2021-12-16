package cn.it3;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		//获取两个int
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("a :" + a + ",b :" + b);
//		
//		//获取两个String
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		System.out.println("str1 :" + str1 + ",str2 :" + str2);
//		
//		//获取一个String，一个int
//		String str3 = sc.nextLine();
//		int c = sc.nextInt();
//		System.out.println("str3 :" + str3 + ", c :" + c);
//		
//		//获取一个int，一个String  （出现问题，String无法录入）
//		//换行符号的问题，回车被当成空字符赋值给了str4
//		int d = sc.nextInt();
//		String str4 = sc.nextLine();
//		System.out.println("d :" + d +", str4 :" + str4);
//		
		//解决方案A：创建一个新的扫描器
		int e = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String str5 = sc2.nextLine();
		System.out.println("e :" + e + ",str5 :" + str5);
		
		//解决方案B：先按照字符串录入，然后再转换成需要的类型
	}
}
