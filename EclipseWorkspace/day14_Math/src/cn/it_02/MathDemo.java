package cn.it_02;

import java.util.Scanner;

/*
 * 设计一个方法，可以取任意范围内的整数
 * 
 * 分析：
 * 		1.键盘录入两个整数
 * 				int start;
 * 				int end;
 * 		2.获取start与end之间的整数
 * 				用方法实现
 * 		3.输出随机数
 */
public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入start:");
		int start = sc.nextInt();
		System.out.println("请输入end:");
		int end = sc.nextInt();

		for (int i = 0; i < 100; i++) {
			System.out.println("结果是：" + getRandom(start, end));
		}
	}

	/*
	 * 方法： 1.返回值类型：int 2.参数列表：int start,int end
	 */
	public static int getRandom(int start, int end) {
		// int random = (int)(Math.random()*100) + 1;
		// int random = (int) (Math.random() * end) + start; //有问题，出现超出范围的情况
		int random = (int) (Math.random() * (end - start + 1)) + start;

		return random;
	}
}
