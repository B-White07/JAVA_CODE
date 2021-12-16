package sut;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int flag = 0;

		System.out.println("录入学生年龄的数量:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] sco = new int[num];
		for (int i = 0; i < sco.length; i++) {
			System.out.println("请录入学生年龄:");
			sco[i] = sc.nextInt();
			if (sco[i] > 0 && sco[i] <= 14) {
				flag = 1;
			} else if (sco[i] > 14 && sco[i] <= 30) {
				flag = 2;
			} else if (sco[i] > 30 && sco[i] <= 65) {
				flag = 3;
			} else {
				flag = 0;
			}

			switch (flag) {
			case 1:
				System.out.println("这个学生是儿童！");
				break;
			case 2:
				System.out.println("这个学生是青年！");
				break;
			case 3:
				System.out.println("这个学生是中年！");
				break;
			default:
				System.out.println("这个学生是老年！");
				break;
			}
		}
	}
}
