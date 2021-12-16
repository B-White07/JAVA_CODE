package cn.it2;

public class StringDemo {
	public static void main(String[] args) {
		//public String()  空构造
		String s1 = new String();
		System.out.println("s1 :" + s1); //输出类，实际上是调用toString() 方法
		System.out.println("s1.length():" + s1.length());
		System.out.println("----------");
		
		//public String(byte[] bytes):把字节数组转换成字符串
		byte[] bys = { 97,98,99,100,101 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2);
		System.out.println("S2.length():" + s2.length());
		System.out.println("----------");
		
		//public String(byte[] bytes,int index,int length)：把字节数组的一部分转换成字符串
		String s3 = new String(bys,1,3);
		System.out.println("s3:" + s3);
		System.out.println("s3.length():" + s3.length());
		System.out.println("----------");
		
		//public String(char[] value):把字符数组转换成字符串
		char[] chs = {'a','b','c','d','e','f'};
		String s4 = new String (chs);
		System.out.println("s4:" + s4);
		System.out.println("s4.length():" + s4.length());
		System.out.println("----------");
		
		//public String(char[] value,int index,int length):把字符数组的一部分转换成字符串
		String s5 = new String(chs,2,4);
		System.out.println("s5:" + s5);
		System.out.println("s5.length():" + s5.length());
		System.out.println("----------");
		
		//public String(String original):将字符串常量值转换成字符串
		String s6 = new String("a b c d e");
		System.out.println("s6:" + s6);
		System.out.println("s6.length():" + s6.length());
		System.out.println("----------");
		
		//字符串字面值"a b c"也可以看成字符串对象
		String s7 = "a b c";
		System.out.println("s7:" + s7);
		System.out.println("s7.length():" + s7.length());
		System.out.println("----------");
		
	}
}
