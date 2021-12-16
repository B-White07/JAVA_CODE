package cn.sut_game;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 * 
 * @author B_White
 * @version V1.0
 */
public class GuessNum {
	private GuessNum() {
	}

	public static void start() {
		// 产生一个随机数
		int num = (int) (Math.random() * 100 + 1);

		//定义一个统计变量
		int count = 0;
		// 键盘录入数据
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个1-100的数据：");
			int guessnum = sc.nextInt();
			count++;

			// 判断
			if (guessnum > num) {
				System.out.println("你输入的数据大了");
			} else if (guessnum > num) {
				System.out.println("你输入的数据小了");
			} else {
				System.out.println("恭喜你，猜了" + count + "就猜中了！");
				break;
			}
		}

	}
}
