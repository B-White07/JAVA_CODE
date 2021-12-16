package cn.it_03;

import java.util.Scanner;

/*
 * 分割功能
 *		String类的public String[] split(String regex)
 *		根据给定正则表达式的匹配拆分此字符串。 
 *
 * 举例：
 * 		百合网，世纪佳缘,珍爱网,QQ
 * 		搜索好友
 * 			性别：女
 * 			范围："18-24"
 * 
 * 		age>=18 && age<=24
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 定义一个年龄范围
		String ages = "18-24";

		// 定义分割规则
		String regex = "-";

		// 调用方法
		String[] strArray = ages.split(regex);

		// 遍历
//		for (int i =0;i<strArray.length;i++) {
//			System.out.println(strArray[i]);
//		}

		// 获得int数据
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);

		// 键盘录入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();

		if (age > startAge && age < endAge) {
			System.out.println("符合要求");
		}else {
			System.out.println("你不是我想要的");
		}

	}
}
