package cn.it_03;
/*
 * StringBuffer的删除功能
 * public StringBuffer deleteCharAt(int index):删除指定位置字符，并返回自身
 * public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的字符串，并返回自身，包左不包右
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加功能
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);
//		
//		//public StringBuffer deleteCharAt(int index)
//		//删除e
//		sb.deleteCharAt(1);
//		System.out.println("sb:" + sb);
//		
//		//删除第一个l
//		sb.deleteCharAt(1);
//		System.out.println("sb:" + sb);
//		
//		//删除world
//		sb.delete(5, 10);
//		System.out.println("sb:" + sb);
//		
		//全删
		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);
	}
}
