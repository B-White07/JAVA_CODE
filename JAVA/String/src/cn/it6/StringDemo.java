package cn.it6;
/*
 * String类的其他功能
 * 
 * 替换功能：
 * String replace(char old,char new)
 * String replace(String old,String new)
 * 
 * 去除字符串两端空格：
 * String trim()
 * 
 * 按字典顺序比较字符串：
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		
		//替换功能：
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'i');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		System.out.println("s3 :" + s3);
		System.out.println("---------------");
		
		//去除字符串两端空格：
		String s4 = "  hello world  ";
		String s5 = s4.trim();
		System.out.println("s4 :" + s4 + "有空格");
		System.out.println("s5 :" + s5 + "无空格");
		System.out.println("------------------");
		
		//按字典顺序比较字符串：
		String s6 = "helloworld";
		String s7 = "helloWorld";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "Hello World";
		String s11 = "  ";
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s10));
		System.out.println(s6.compareTo(s8));
		System.out.println(s6.compareTo(s9));
		System.out.println(s6.compareTo(s11));
		
	}
}
