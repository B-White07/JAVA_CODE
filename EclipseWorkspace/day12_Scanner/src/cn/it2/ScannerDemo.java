package cn.it2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x is: " + x);
		}else {
			System.out.println("您输入的数据有误!");
		}
	}
}
