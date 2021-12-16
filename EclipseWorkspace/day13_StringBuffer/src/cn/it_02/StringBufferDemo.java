package cn.it_02;
/*
 * 快捷注释：ctrl+shift+C或者ctrl+/
 * StringBuffer的添加功能：
 * public StringBuffer append(String str) :可以把任意类型添加到字符串缓冲区里
 * public StringBuffer insert(int offset,String str):在指定位置，把任意类型数据添加到字符串缓冲区
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//public StringBuffer append(String str)
//		StringBuffer sb2 = sb.append("hello");
//		
//		System.out.println("sb:" + sb);
//		System.out.println("sb2:" + sb2);
//		System.out.println(sb == sb2);
		
//		一步一步添加数据
//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(13.14F);
		
		//链式编程
		sb.append("hello").append(true).append(12).append(13.14);
		System.out.println("sb:" + sb);
		
		//public StringBuffer insert(int offset,String str)
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
	}
}
