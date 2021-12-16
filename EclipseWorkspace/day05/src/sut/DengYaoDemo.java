package sut;

import java.util.Scanner;

public class DengYaoDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入想要打印的等腰三角形的行数：");
		int line = sc.nextInt();
		DengYaoDemo sy = new DengYaoDemo();
		sy.dengYao(line);
	}

	public void dengYao(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
