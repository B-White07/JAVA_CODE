package cn.sut.test;

import java.util.Scanner;

import cn.sut.dao.UserDao;
import cn.sut.dao.impl.UserDaoImpl;
import cn.sut.pojo.User;
import cn.sut_game.GuessNum;

/**
 * 用户测试类
 * 
 * @author B_White
 * @version V1.0
 * 
 *          新增的两个小问题： 1:多个对象共享一个成员变量，用静态static
 *          2:当循环中出现switch,switch中的break结束的是switch语句而不是循环
 */
public class UserTest {
	public static void main(String[] args) {
		// 为了多次使用，加入循环
		while (true) {
			// 欢迎界面，给出选择项
			System.out.println("------欢迎光临------");
			System.out.println("1  登录");
			System.out.println("2  注册");
			System.out.println("3  退出");
			System.out.println("请输入你的选择： ");

			// 键盘录入
			Scanner sc = new Scanner(System.in);
			// 为了方便，所有数据区那不用字符接收
			String choice = sc.nextLine();

			// switch语句的多个地方要使用，所以定义到外面
			UserDao ud = new UserDaoImpl();

			// 简单分析，选择switch case语句
			switch (choice) {
			case "1":
				System.out.println("------登录------");
				System.out.println("请输入用户名:");
				String username = sc.nextLine();
				System.out.println("请输入密码:");
				String password = sc.nextLine();

				// 调用登录功能
				// UserDao ud =new UserDaoImpl();
				boolean flag = ud.islogin(username, password);
				if (flag) {
					System.out.println("登陆成功！");
					System.out.println("你要玩游戏吗？");
					//String s = sc.nextLine();
					// 玩游戏
					while (true) {
						String s = sc.nextLine();
						if(s.equalsIgnoreCase("y")) {
							GuessNum.start();
							System.out.println("你想继续游戏吗？Y/N");
						}else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);// 这是结束程序
					// break;//switch中的break仅仅是跳出switch,想要结束程序用exit();
				} else {
					System.out.println("用户名或密码错误，登陆失败！");
				}

				break;
			case "2":
				System.out.println("------注册------");
				System.out.println("请输入用户名:");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码:");
				String newPassword = sc.nextLine();

				// 把用户名和密码封装到一个对象中
				User newUser = new User();
				newUser.setUsername(newUsername);
				newUser.setPassword(newPassword);

				// 调用注册功能
				// 多态
				// UserDao ud = new UserDaoImpl();
				// 具体类使用
				// UserDaoImpl udi = new UserDaoImpl();

				ud.regist(newUser);
				System.out.println("注册成功！");
				break;
			case "3":
			default:
				System.out.println("您已退出");
				System.exit(0);
				break;
			}
		}
	}
}
