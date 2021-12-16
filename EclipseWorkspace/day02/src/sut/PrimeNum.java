package sut;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a int num:");
		int a = sc.nextInt();
		
		if (isPrime(a)) {
			System.out.println(a+"是质数");
		} else {
			System.out.println(a+"不是质数");
		}
	}

	//将判断是否为质数封装成方法
	public static boolean isPrime(int num) {
		boolean flag = true;
		int temp = (int) Math.sqrt(num);

		for (int i = 2; i <= temp; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
