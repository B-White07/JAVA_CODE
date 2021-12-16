package sut;

import java.util.Scanner;

public class ShuiXian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the range(2 nums):");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		if (a1 > a2) {
			int temp = 0;
			temp = a1;
			a1 = a2;
			a2 = temp;
		}
		
		System.out.println("The results are:");
		for (int i = a1; i < a2; i++) {
			if (isShuiXian(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isShuiXian(int num) {
		boolean flag = false;

		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num / 100;

		if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
			flag = true;
		}

		return flag;
	}
}
