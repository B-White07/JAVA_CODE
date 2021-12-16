package sut;

import java.util.Arrays;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		System.out.println("Please input the string you want to encrypt:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("The result is :" + encrypt(str));
	}

	
	//封装加密方法
	public static String encrypt(String str) {
		// 将接收到的字符串转换成int类型的数组
		// 先定义一个接受数组
		int[] receive = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			receive[i] = Integer.parseInt(str.substring(i, i + 1));
			receive[i] = receive[i] * 2 + 1;
		}

		str = "";
		for (int i = 0; i < receive.length; i++) {
			str += receive[i];
		}

//		for (int i : receive) {
//			System.out.println(i);
//		}

		// 将数组转换成字符串
//		str = Arrays.toString(receive);
		return str;
	}
}
