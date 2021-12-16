package sut;

import java.util.Scanner;

public class HuiWen {
	public static void main(String[] args) {
		System.out.println("请输入你要判断的数字:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isHuiWen(num)) {
			System.out.println(num + "是回文");
		} else {
			System.out.println(num + "不是回文");
		}
	}

	public static boolean isHuiWen(int num) {
		boolean flag = false;
		String str = "";
		str += num;

		StringBuffer buf = new StringBuffer();
		buf = buf.append(str);

		if (str.equals(buf.reverse().toString())) {
			flag = true;
		}

		return flag;
	}
}
