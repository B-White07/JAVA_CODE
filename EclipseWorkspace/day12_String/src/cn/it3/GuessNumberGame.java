package cn.it3;
import java.util.Scanner;
/*
 *  猜数字游戏
 */
public class GuessNumberGame {
	//将构造方法私有化，不能通过构造方法初始化
	private GuessNumberGame() {
		
	}
	
	public static void start() {
		//产生随机数
		int number = (int) (Math.random()*100) + 1; 
		
		//键盘录入数据
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你猜的数据（1-100）:");
			int guessNumber = sc.nextInt();
		
			//判断
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			}else if(guessNumber < number){
				System.out.println("你猜的数据" + guessNumber + "小了");
			}else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
		
	}
}
