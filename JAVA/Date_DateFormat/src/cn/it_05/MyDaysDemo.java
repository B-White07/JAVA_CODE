package cn.it_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * ��һ��������������������
 * 
 * ������
 * 		A:����¼����ĳ�����������
 * 		B:�Ѹ��ַ���ת��Ϊһ������
 * 		C:ͨ�������ڵõ�һ������ֵ
 * 		D:��ȡ��ǰʱ��ĺ���ֵ
 * 		E:��D-C�õ�һ������ֵ
 * 		F:��E�ĺ���ֵת��Ϊ��
 * 			/1000/60/60/24
 */
public class MyDaysDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ�������,��-����:");
		String s = sc.nextLine();

		// �Ѹ��ַ���ת��������
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(s);
		// ͨ�������ڵõ�һ������ֵ
		long t1 = d1.getTime();
		// ��ȡ��ǰʱ��ĺ���ֵ
		long t2 = System.currentTimeMillis();

		long now = t2 - t1;
		long day = now / 1000 / 60 / 60 / 24;

		System.out.println("��������������Ѿ�" + day + "����");

	}
}
