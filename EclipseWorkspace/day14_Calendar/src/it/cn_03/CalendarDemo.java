package it.cn_03;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ��ȡ����һ��Ķ����ж�����
 * 
 * ������
 * 		A:����¼����������
 * 		B:�������������������
 * 			�����A���������
 * 			����2
 * 			����1
 * 		C:��ʱ����ǰ��һ�죬����2�µ����һ��
 * 		D:��ȡ��һ���������
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�������ݣ�");
		int year = sc.nextInt();

		// �������������������
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(year + "��2����" + c.get(Calendar.DATE) + "��");
	}
}
