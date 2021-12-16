package cn.sut_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5的新特性：自动拆装箱,泛型,增强for,静态导入,可变参数,枚举
 * 
 * 增强for:是for循环的一种。
 * 
 * 格式：
 * 		for(元素数据类型 变量 : 数组或者Collection集合) {
 *			使用变量即可，该变量就是元素
 *   	}
 *   
 * 好处：简化了数组和集合的遍历。
 * 
 * 弊端： 增强for的目标不能为null。
 * 如何解决呢?对增强for的目标先进行不为null的判断，然后在使用。
 */
public class ForDemo {
	public static void main(String[] args) {
		// 定义一个int数组
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------");
		// 增强for
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("-----------");

		// 定义一个字符串数组
		String[] str = { "lzw", "lzw2", "lzw3" };
		// 增强for
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("-----------");

		// 定义一个集合
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("-----------");

		List<String> list = null;
		//NullPointerException
		//这个s就是从list中获取的，在获取前，一定还要做一个判断
		//其实这就是迭代器的功能
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		//增强就是用来替代迭代器的
		//ConcurrentModificationException:并发修改异常，发生在用集合修改集合，解决方法：迭代器修改集合
		for (String s : array) {
			if("world".equals(s)) {
				array.add("javaee");
			}
			System.out.println("array:" + array);
		}
	}
}
