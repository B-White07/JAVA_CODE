package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List的子类特点：
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			 底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 * 
 * 案例：
 * 		使用List的任何子类存储字符串或者存储自定义对象并遍历。
 * 
 * ArrayList的使用。	
 * 		存储字符串并遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");

		//方式一
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		System.out.println("-----------");
		//方式二
		for(int i = 0;i<array.size();i++) {
			String s = (String)array.get(i);
			System.out.println(s);
		}
	}
}
