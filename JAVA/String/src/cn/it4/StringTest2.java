package cn.it4;

import java.util.Scanner;

/* ctrl shift f:��׼������		ctrl shift o:����
 * ����ͳ��һ���ַ����У���Сд��ĸ�Լ����ֳ��ֵĴ����������������ַ���
 * 
 * ���磺
 * 		"Hello123World"
 * 		��д�ַ�  2��
 * 		Сд�ַ�  8��
 * 		�����ַ�  3��
 * 
 * ������
 * 		��������ͳ�Ʊ�����
 * 				bigCount=0
 * 				smallCount=0
 * 				numberCount=0
 * 		�����ַ�������ȡÿһ���ַ���
 * 				char charAt()   int length()
 * 		�ж��ַ������ͣ�
 * 				bigCount++
 * 				smallCount++
 * 				numberCount++
 * 		����жϣ�
 * 			1.	ACSLL���:				2.	char ch = s.charAt(i);
 * 						0	48				if(ch >= '0' && ch <= '9')
 * 						A	65				if(ch >= 'A' && ch <= 'Z')
 * 						a	97				if(ch >= 'a' && ch <= 'z')
 */
public class StringTest2 {
	public static void main(String[] args) {
		
		//�Զ����ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ͳ�Ƶ��ַ�����");
		String s = sc.nextLine();

		//��ʼ������
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		//ͳ�Ƹ���
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numberCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			}
		}
		
		//���
		System.out.println("��д�ַ���" + bigCount + "��");
		System.out.println("Сд�ַ���" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");

	}
}
