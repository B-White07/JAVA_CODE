package cn.it_07;

import java.util.Scanner;

/*
 * ���ַ�����ת
 */
public class StrignBufferTest3 {
	public static void main(String[] args) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String s = sc.nextLine();

		// ��ʽһ����String��ƴ��
		System.out.println("result is :" + myReverse(s));
		// ��ʽ������StringBuffer��reverse()����
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
//		��ʽһ
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);

		// ��ʽ��
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();

		//����
		return new StringBuffer(str).reverse().toString();
	}
}
