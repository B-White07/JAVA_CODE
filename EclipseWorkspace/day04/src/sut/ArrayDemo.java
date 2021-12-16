package sut;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		System.out.println("How many nums do you want to save?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] arr = new int[num];
		System.out.println("Please input the nums:");

		// 循环录入
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		// 遍历数组
		System.out.print("[ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
}
