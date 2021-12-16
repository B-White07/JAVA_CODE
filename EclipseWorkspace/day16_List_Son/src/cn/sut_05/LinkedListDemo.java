package cn.sut_05;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *请用LinkedList模拟栈数据结构的集合，并测试
 *题目的意思是：
 *		你自己的定义一个集合类，在这个集合类内部可以使用LinkedList模拟。
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		//栈的特点，先进后出，使用LinkedList的特有方法addFirst方法
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");
		
		Iterator it = link.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
