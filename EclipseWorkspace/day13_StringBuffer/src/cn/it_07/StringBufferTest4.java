package cn.it_07;

import java.util.Scanner;

/*
 * 判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 
 * 分析：
 * 		判断一个字符串是否是对称的字符串，我只需要把
 * 			第一个和最后一个比较
 * 			第二个和倒数第二个比较
 * 			...
 * 		比较的次数是长度除以2。
 */
public class StringBufferTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String s = sc.nextLine();

		// 方式一：一个一个比较
		System.out.println("result:" + isReversal(s));
		
		// 方式二：用StringBuffer中的reverse()
		System.out.println("result:" + isReversal2(s));
	}

//	public static boolean isReversal(String str) {
//		char[] chs = str.toCharArray();
//
//		for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
//			if (chs[i] != chs[j]) {
//				return false;
//			}
//
//		}
//		return true;
//	}
	
	public static boolean isReversal(String str) {
		boolean flag = true;
		char[] chs = str.toCharArray();

		for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
			if (chs[i] != chs[j]) {
				flag = false;
				break;
			}

		}
		return flag;
	}
	
	public static boolean isReversal2(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}
}
