package cn.it_01;

import java.util.Scanner;

/*
 * 正则表达式：符合一定规则的字符串
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// 键盘录入
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入你的QQ号：");
				String qq = sc.nextLine();

				// 调用方法
				System.out.println("checkQQ：" + checkQQ(qq));
	}
	
	public static boolean checkQQ(String str) {
//		String regex = "[1-9][0-9] {4,14}";
//		// public boolean matches(String regex):告知此字符串是否符合给定的正则表达式
//		boolean flag = str.matches(regex);
//		return flag;

		return str.matches("[1-9][0-9]{1,14}");
		
		
	}
}
