package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList存储字符串并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		// 迭代器
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("----------------");
		
		// 普通for
		for (int i = 0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
		System.out.println("----------------");
		
		// 增强for
		for(String s:array) {
			System.out.println(s);
		}
		

	}
}
