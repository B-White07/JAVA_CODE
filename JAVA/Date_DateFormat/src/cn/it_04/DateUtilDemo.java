package cn.it_04;

import java.text.ParseException;
import java.util.Date;

/*
 * ����DateUtil��
 */
public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		//dateToString()����
		Date d = new Date();
		
		String s = DateUtil.dateToString(d, "yyyy��MM��dd��  HH:mm:ss");
		System.out.println(s);
		
		String s2 = DateUtil.dateToString(d, "yyyy��MM��dd��");
		System.out.println(s2);
		
		String s3 = DateUtil.dateToString(d, "HH:mm:ss");
		System.out.println(s3);
		
		//stringToDate()����
		String s4 = "1999-07-25 01:00:06";
		Date s5 = DateUtil.stringToDate(s4, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s5);
	}
}
