package sut;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		int flag = 0;

		System.out.println("录入学生成绩的数量:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("请录入学生成绩(0-100):");
		int[] sco = new int[num];
		for (int i = 0; i < sco.length; i++) {
			sco[i] = sc.nextInt();

			if (sco[i] >= 90) {
				flag = 1;
			} else if (sco[i] >= 80 && sco[i] < 90) {
				flag = 2;
			} else if (sco[i] >= 60 && sco[i] < 80) {
				flag = 3;
			} else {
				flag = 0;
			}

			switch (flag) {
			case 1:
				System.out.println("你的成绩优秀！");
				break;
			case 2:
				System.out.println("你的成绩良好！");
				break;
			case 3:
				System.out.println("你的成绩及格！");
				break;
			default:
				System.out.println("你的成绩不及格！");
				break;
			}
		}
	}
}
