package cn.it7;

import java.util.Scanner;

/*
 * �ַ�����ת
 * 
 * ������  ����¼��"abc"
 * 		������"cba"
 * 
 * ������
 * 		A:����¼���ַ���
 * 		B:�������ַ���
 * 		C:��������ַ������õ�ÿһ���ַ�
 * 			1.length() �� charAt()���
 * 			2.���ַ���ת�����ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
 */
public class StringTest3 {
	public static void main(String[] args0) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫת�����ַ�����");
		String line = sc.nextLine();

		/*
		// ����մ�
		String result = "";

		// ���ַ���ת�����ַ�����
		char[] arr = line.toCharArray();

		// �������
		for (int i = (arr.length - 1); i >= 0; i--) {
			result += arr[i];
		}

		// ���
		System.out.println("�����Ľ���ǣ�" + result);
		*/
		
		//���÷���
		System.out.println("���÷����Ľ���� " + daoXu(line));
	}

	/*
	 * ��װ�ɷ��� ������ȷ��1.����ֵ����: String 2.�����б�:String s
	 */
	public static String daoXu(String s) {
		// ����մ�
		String result = "";

		// ���ַ���ת�����ַ�����
		char[] arr = s.toCharArray();

		// �������
		for (int i = (arr.length - 1); i >= 0; i--) {
			result += arr[i];
		}

		// ���
		return result;
	}
}
