package cn.it_02;

import java.util.Scanner;

/*
 * �жϹ���
 *		String���public boolean matches(String regex)
 *
 * ����
 * 		�ж��ֻ������Ƿ�����Ҫ��?
 * 
 * ������
 * 		A:����¼���ֻ�����
 * 		B:�����ֻ�����Ĺ���
 * 			13436975980
 * 			13688886868
 * 			13866668888
 * 			13456789012
 * 			13123456789
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
public class RegexDemo {
	public static void main(String[] args) {
		//����¼���ֻ���
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ��ţ�");
		String phone = sc.nextLine();
		
		//�����ֻ�����Ĺ���
		String regex = "1[38][0-9]{9}";
		
		//���ù��ܣ��жϼ���
		boolean flag = phone.matches(regex);
		
		System.out.println("flag:" + flag);
	}
}
