package cn.it_03;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 * 
 * 			2014年12月12日 12:12:12
 */
public class DateFormat {
	public static void main(String[] args) throws ParseException {
		//Date	 --	 String(格式化)
		Date d = new Date();
		
		//使用默认模式
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//使用给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		
		//String -- Date(解析)
		String str = "2020-03-06 09:00:00";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sdf2.parse(str);
		System.out.println(d2);
		
	}
}
