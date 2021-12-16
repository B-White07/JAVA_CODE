package cn.it2;

/*
 * 区别：
 * String s = new String0("Hello")
 * String s = "Hello" 
 * 通过构造方法创建对象，会在堆内存和方法区各创建一个对象，共创建两个对象（方法区的常量池如果有，那么只创建一个）
 * 直接复制只会在方法区的字符串常量池中创建一个对象（或不创建）
 */

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
