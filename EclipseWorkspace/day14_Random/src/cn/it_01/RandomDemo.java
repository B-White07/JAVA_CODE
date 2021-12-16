package cn.it_01;

import java.util.Random;

/*
 * Random:产生随机数的类
 * 
 * 构造方法：
 * 		public Random():没有种子，使用默认种子，是当前时间的毫秒值
 *		public Random(long seed):给出指定种子
 *		给定种子后，每次产生的随机数是相同的
 * 成员方法：
 * 		public int nextInt():随机返回int范围内的数
 * 		public int nextInt(int n):随机返回[0,n)范围内的数
 * 
 */
public class RandomDemo {
	public static void main(String[] args) {
		// 创建对象
		//Random r = new Random();//默认种子，每次产生的随机数不同 
		Random r = new Random(111);//给定种子，每次产生的随机数相同

		for (int i = 0; i < 10; i++){
			//int num = r.nextInt();
			int num = r.nextInt(100);
			System.out.println(num);
		}
	}
}
