package cn.it_01;

import java.util.Random;

/*
 * Random:�������������
 * 
 * ���췽����
 * 		public Random():û�����ӣ�ʹ��Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *		public Random(long seed):����ָ������
 *		�������Ӻ�ÿ�β��������������ͬ��
 * ��Ա������
 * 		public int nextInt():�������int��Χ�ڵ���
 * 		public int nextInt(int n):�������[0,n)��Χ�ڵ���
 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		// ��������
		//Random r = new Random();//Ĭ�����ӣ�ÿ�β������������ͬ 
		Random r = new Random(111);//�������ӣ�ÿ�β������������ͬ

		for (int i = 0; i < 10; i++){
			//int num = r.nextInt();
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}
}
