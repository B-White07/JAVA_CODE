package cn.sut_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 * 
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//添加元素
		c.add("hello"); // 实际上这里有一个向上转型的过程：Object obj = "hello"
		c.add("world");
		c.add("java");
		
		//遍历
		//Object[] toArray():把集合转成数组，可以实现集合的遍历
		Object[] obj = c.toArray();
		for(int i = 0;i<obj.length;i++) {
			//System.out.println(obj[i]);
			//在获取元素的同时还想获取它的长度
			//System.out.println(obj[i] + "---" + obj[i].length());
			//上面的方法是错误的，原因是Object中没有length()方法
			//想要使用字符串的方法，必须还原成字符串，此时需要向下转型成为String，调用length()方法
			String s =(String)obj[i];
			System.out.println(s + "---" + s.length());
			
		}
	}
}
