package cn.it5;
/*
 * String的转化功能：
 * byte[] getBytes(): 把字符串转换成字节数组
 * char[] toCharArray(): 把字符串转换成字符数组
 * static String valueOf(char[] chs): 把字符数组转换成字符串
 * static String valueOf(int i): 把int转换成字符串
 * 		注意：String的valueOf()方法可以把任意数据类型转换成字符串
 * String toLowerCase(): 把字符串转换成小写
 * String toUpperCsae(): 把字符串转换成大写
 * String conCat(): 把字符串拼接
 */
public class StringDemo {
	public static void main(String[] args) {
		//定义字符串对象
		String s = "JavaSE";
		
		//byte[] getBytes(): 把字符串转换成字节数组
		byte[] bys = s.getBytes();
		for (int i = 0; i<s.length(); i++) {
			System.out.println(bys[i]);
		}
		System.out.println("--------------");
		
		//char[] toCharArray(): 把字符串转换成字符数组
		char[] chs = s.toCharArray();
		for (int i = 0; i<s.length(); i++) {
			System.out.println(chs[i]);
		}
		System.out.println("--------------");
		
		//static String valueOf(char[] chs): 把字符数组转换成字符串
		String s2 = String.valueOf(chs);
		System.out.println(s2);
		System.out.println("--------------");
		
		//static String valueOf(int i): 把int转换成字符串
		int i = 100;
		String s3 = String.valueOf(i);
		System.out.println(s3);
		System.out.println("--------------");
		
		//String toLowerCase(): 把字符串转换成小写
		System.out.println("toLowerCase :" + s.toLowerCase());
		System.out.println("s :" + s);
		System.out.println("--------------");
		
		//String toUpperCsae(): 把字符串转换成大写
		System.out.println("toUpperCase :" + s.toUpperCase());
		System.out.println("s :" + s);
		System.out.println("--------------");
		
		//String conCat(): 把字符串拼接
		String s4 = "hello";
		String s5 = "world";
		String s6 = s4 + s5;
		String s7 = s4.concat(s5);
		System.out.println("s6 :" + s6);
		System.out.println("s7 :" + s7);
		
	}
}
