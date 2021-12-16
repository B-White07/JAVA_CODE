package cn.it_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 算一下你来到这个世界多少天
 * 
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class MyDaysDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生日期,用-隔开:");
		String s = sc.nextLine();

		// 把该字符串转换成日期
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(s);
		// 通过该日期得到一个毫秒值
		long t1 = d1.getTime();
		// 获取当前时间的毫秒值
		long t2 = System.currentTimeMillis();

		long now = t2 - t1;
		long day = now / 1000 / 60 / 60 / 24;

		System.out.println("你来到这个世界已经" + day + "天了");

	}
}
