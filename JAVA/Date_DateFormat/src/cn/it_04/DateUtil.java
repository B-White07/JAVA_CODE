package cn.it_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ں��ַ����໥ת���Ĺ�����
 * 
 * @author B_White
 *
 */
public class DateUtil {
	private DateUtil() {

	}

	/**
	 * ���ǰ�����ת�����ַ����ķ���
	 * 
	 * @param d      ��ת�������ڶ���
	 * @param format Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ������ַ���
	 */
	public static String dateToString(Date d, String format) {
		return new SimpleDateFormat(format).format(d);
	}

	/**
	 * ���ǰ��ַ���ת���������ڵķ���
	 * 
	 * @param str    Ҫ���������ַ���
	 * @param format Ҫ��ת���ĸ�ʽ
	 * @return ����������ڶ���
	 * @throws ParseException
	 */
	public static Date stringToDate(String str, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(str);
	}
}
