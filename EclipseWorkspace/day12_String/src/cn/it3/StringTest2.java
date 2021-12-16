package cn.it3;
import java.util.Scanner;

/*
 *  模拟登录，给三次机会，并提示剩余几次机会，
 *  登陆成功可以玩猜数字
 *  
 *  分析：
 *  	定义用户名和密码，已存在的
 *  	键盘录入用户名和密码
 *  	比较用户名和密码
 *  	三次机会
 *  
 */
public class StringTest2 {
	public static void main(String[] args) {
		//定义用户名和密码
		String username = "admin";
		String password = "psd";
		
		//键盘录入用户名和密码
		for (int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String psd = sc.nextLine();
		
		//比较用户名和密码
			if (name.equals(username) && psd.equals(password)) {
				System.out.println("登陆成功！开始游戏");
				GuessNumberGame.start();
				break;
			}else {
				if ((2-i) == 0) {
					System.out.println("您的账户已冻结");
				}else {
					System.out.println("用户名或密码错误，您还有" + (2-i) + "次机会");
				}
			}		
		}
		
	}
}
