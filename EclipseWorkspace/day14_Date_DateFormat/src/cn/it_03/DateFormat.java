package cn.it_03;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * Date	 --	 String(��ʽ��)
 * 		public final String format(Date date)
 * 
 * String -- Date(����)
 * 		public Date parse(String source)
 * 
 * DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
 * 
 * SimpleDateFormat�Ĺ��췽����
 * 		SimpleDateFormat():Ĭ��ģʽ
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			���ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 			�� y
 * 			�� M	
 * 			�� d
 * 			ʱ H
 * 			�� m
 * 			�� s
 * 
 * 			2014��12��12�� 12:12:12
 */
public class DateFormat {
	public static void main(String[] args) throws ParseException {
		//Date	 --	 String(��ʽ��)
		Date d = new Date();
		
		//ʹ��Ĭ��ģʽ
		//SimpleDateFormat sdf = new SimpleDateFormat();
		//ʹ�ø���ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		
		//String -- Date(����)
		String str = "2020-03-06 09:00:00";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sdf2.parse(str);
		System.out.println(d2);
		
	}
}
