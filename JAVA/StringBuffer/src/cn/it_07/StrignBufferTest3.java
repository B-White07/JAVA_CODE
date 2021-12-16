package cn.it_07;

import java.util.Scanner;

/*
 * 把字符串反转
 */
public class StrignBufferTest3 {
	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine();

		// 方式一：用String做拼接
		System.out.println("result is :" + myReverse(s));
		// 方式二：用StringBuffer的reverse()方法
		System.out.println("result is :" + myReverse2(s));
	}

	public static String myReverse(String str) {
		String s = "";

		char[] chs = str.toCharArray();
		for (int i = chs.length - 1; i >= 0; i--) {
			s += chs[i];
		}
		return s;
	}

	public static String myReverse2(String str) {
//		方式一
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);

		// 方式二
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();

		//最终
		return new StringBuffer(str).reverse().toString();
	}
}
