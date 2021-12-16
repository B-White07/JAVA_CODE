package cn.it3;
/*
 * 判断：
 * boolean equals(Object obj):比较字符串内容是否相同，区分大小写
 * boolean equalsIgnoreCase(String str):比较字符串内容是否相同，不区分大小写
 * boolean contains(String str):判断大字符串中是否包含小字符串
 * boolean startsWith(String str):判断是否以某字符串开头
 * boolean endsWith(String str):判断是否以某字符串结尾
 * boolean isEmpty()：判断字符串是否为空
 * 
 * 注意：
 * 		字符串内容为空和字符串对象为空不一样
 * 		String s = "";
 * 		String s = null;
 */
public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";
		
		//boolean equals(Object obj):比较字符串内容是否相同，区分大小写
		System.out.println("equals: " + s1.equals(s2));
		System.out.println("equals: " + s2.equals(s3));
		System.out.println("------------------------");
		
		//boolean equalsIgnoreCase(String str):比较字符串内容是否相同，不区分大小写
		System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));
		System.out.println("equalsIgnoreCase: " + s2.equalsIgnoreCase(s3));
		System.out.println("------------------------");
		
		//boolean contains(String str):判断大字符串中是否包含小字符串
		System.out.println("contains: " + s1.contains("hello"));
		System.out.println("contains: " + s2.contains("hw"));
		System.out.println("contains: " + s2.contains(s2));
		System.out.println("------------------------");
		
		//boolean startsWith(String str):判断是否以某字符串开头
		System.out.println("startsWith: " + s1.startsWith("hello"));
		System.out.println("startsWith: " + s2.startsWith("world"));
		System.out.println("startsWith: " + s2.startsWith("helloworld"));
		System.out.println("------------------------");
		
		//boolean endsWith(String str):判断是否以某字符串结尾
		System.out.println("endsWith: " + s1.endsWith("hello"));
		System.out.println("endsWith: " + s2.endsWith("world"));
		System.out.println("endsWith: " + s2.endsWith("helloworld"));
		System.out.println("------------------------");
		
		//boolean isEmpty()：判断字符串是否为空
		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty: " + s4.isEmpty());
		//System.out.println("isEmpty: " + s5.isEmpty());//NullPointerException,报错，空指针异常，s5不存在
	}
}
