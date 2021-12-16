package cn.it_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转化的工具类
 * 
 * @author B_White
 *
 */
public class DateUtil {
	private DateUtil() {

	}

	/**
	 * 这是把日期转换成字符串的方法
	 * 
	 * @param d      被转换的日期对象
	 * @param format 要被转换的格式
	 * @return 格式化后的字符串
	 */
	public static String dateToString(Date d, String format) {
		return new SimpleDateFormat(format).format(d);
	}

	/**
	 * 这是把字符串转解析成日期的方法
	 * 
	 * @param str    要被解析的字符串
	 * @param format 要被转换的格式
	 * @return 解析后的日期对象
	 * @throws ParseException
	 */
	public static Date stringToDate(String str, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(str);
	}
}
