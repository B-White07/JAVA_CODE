package sut;

import java.util.Scanner;

public class JieChen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想计算的阶乘（1-20）：");
		int num = sc.nextInt();
		JieChen jc = new JieChen();
		System.out.println(num + "的阶乘是:" + jc.jieChen(num));
	}

	public int jieChen(int n) {
		int result = n;

		while (n > 1) {
			result *= (n - 1);
			n--;
		}

		return result;
	}
}
