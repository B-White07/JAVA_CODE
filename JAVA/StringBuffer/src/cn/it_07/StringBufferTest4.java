package cn.it_07;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 * ������
 * 		�ж�һ���ַ����Ƿ��ǶԳƵ��ַ�������ֻ��Ҫ��
 * 			��һ�������һ���Ƚ�
 * 			�ڶ����͵����ڶ����Ƚ�
 * 			...
 * 		�ȽϵĴ����ǳ��ȳ���2��
 */
public class StringBufferTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String s = sc.nextLine();

		// ��ʽһ��һ��һ���Ƚ�
		System.out.println("result:" + isReversal(s));
		
		// ��ʽ������StringBuffer�е�reverse()
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
