package cn.it_03;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����У���д�ַ���Сд�ַ��������ַ����ֵĴ���
 * 
 * ������
 * 		A:����ͳ�Ʊ���
 * 			int bigCount;
 * 			int smallCount;
 * 			int numberCount;
 * 		B:����¼���ַ���
 * 		C:���ַ���ת�����ַ�����
 * 		D:�������ַ������ȡÿһ���ַ�
 * 		E:������ַ���
 * 			��д�ַ�	bigCount++
 * 			Сд�ַ�	smallCount++
 * 			�����ַ�	numberCount++
 * 		G:���ͳ�Ʊ���
 */
public class CharaterDemo {
	public static void main(String[] args) {
		//����ͳ�Ʊ���
		int bigCount = 0;
		int samllCount = 0;
		int numberCount = 0;
		
		//����¼���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String s = sc.nextLine();
		
		//���ַ���ת�����ַ�����
		char[] chs = s.toCharArray();
		
		//�������ַ������ȡÿһ���ַ�
		for(int i = 0;i<chs.length;i++) {
			char ch = chs[i];
			
			//�жϸ��ַ�
			if(Character.isUpperCase(ch)) {
				bigCount++;
			}else if(Character.isLowerCase(ch)) {
				samllCount++;
			}else if(Character.isDigit(ch)){
				numberCount++;
			}
		}
		
		//���ͳ�Ʊ���
		System.out.println("��д�ַ���" + bigCount + "��");
		System.out.println("Сд�ַ���" + samllCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
		
	}
}
