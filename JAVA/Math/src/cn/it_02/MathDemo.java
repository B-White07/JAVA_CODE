package cn.it_02;

import java.util.Scanner;

/*
 * ���һ������������ȡ���ⷶΧ�ڵ�����
 * 
 * ������
 * 		1.����¼����������
 * 				int start;
 * 				int end;
 * 		2.��ȡstart��end֮�������
 * 				�÷���ʵ��
 * 		3.��������
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������start:");
		int start = sc.nextInt();
		System.out.println("������end:");
		int end = sc.nextInt();

		for (int i = 0; i < 100; i++) {
			System.out.println("����ǣ�" + getRandom(start, end));
		}
	}

	/*
	 * ������ 1.����ֵ���ͣ�int 2.�����б�int start,int end
	 */
	public static int getRandom(int start, int end) {
		// int random = (int)(Math.random()*100) + 1;
		// int random = (int) (Math.random() * end) + start; //�����⣬���ֳ�����Χ�����
		int random = (int) (Math.random() * (end - start + 1)) + start;

		return random;
	}
}
