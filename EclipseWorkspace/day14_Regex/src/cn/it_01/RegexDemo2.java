package cn.it_01;

import java.util.Scanner;

/*
 * ������ʽ������һ��������ַ���
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		// ����¼��
				Scanner sc = new Scanner(System.in);
				System.out.println("���������QQ�ţ�");
				String qq = sc.nextLine();

				// ���÷���
				System.out.println("checkQQ��" + checkQQ(qq));
	}
	
	public static boolean checkQQ(String str) {
//		String regex = "[1-9][0-9] {4,14}";
//		// public boolean matches(String regex):��֪���ַ����Ƿ���ϸ�����������ʽ
//		boolean flag = str.matches(regex);
//		return flag;

		return str.matches("[1-9][0-9]{1,14}");
		
		
	}
}
