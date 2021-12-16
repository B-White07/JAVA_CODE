package cn.sut_05;

import java.util.LinkedList;

/**
 * 自定义的栈集合
 * 
 * @author B_White
 * @version V1.0
 */
public class MyStack {
	private LinkedList link;
	
	public MyStack() {
		link = new LinkedList();
	}
	
	public void add(Object obj) {
		link.addFirst(obj);
	}
	
	public Object get() {
		//return link.getFirst();//这样永远只会返回同一个元素
		return link.removeFirst();
	}
	
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
