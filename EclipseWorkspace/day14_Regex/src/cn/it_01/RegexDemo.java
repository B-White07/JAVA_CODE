package cn.it_01;

import java.util.Scanner;

/*
 * 校验QQ号：
 * 		A:长度5-15位的数字
 * 		B:0不能开头
 * 
 * 分析：
 * 		A:键盘录入QQ号
 * 		B:写方法实现校验
 * 		C:调用方法，输出结果
 */
public class RegexDemo {
	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的QQ号：");
		String qq = sc.nextLine();

		// 调用方法
		System.out.println("checkQQ：" + checkQQ(qq));
	}

	// 定义方法
	/*
	 * 明确： 1.返回值类型：boolean 2.参数列表：String str
	 */
	public static boolean checkQQ(String str) {
		boolean flag = true;

		// 判断位数
		if (str.length() >= 5 && str.length() <= 15) {
			// 不能0开头
			// char[] chs = str.toCharArray();
			if (!str.startsWith("0")) {
				// 必须是数字
				char[] chs = str.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					char ch = chs[i];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		
		return flag;
	}
}
