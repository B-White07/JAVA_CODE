package sut;

import java.util.Scanner;

public class IsShuiXian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个100-1000的数字:");
		int num = sc.nextInt();
		if(isShuiXian(num)) {
			System.out.println(num + "是水仙花数");
		}else {
			System.out.println(num + "不是水仙花数");
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
