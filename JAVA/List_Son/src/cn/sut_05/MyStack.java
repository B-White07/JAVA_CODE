package cn.sut_05;

import java.util.LinkedList;

/**
 * �Զ����ջ����
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
		//return link.getFirst();//������Զֻ�᷵��ͬһ��Ԫ��
		return link.removeFirst();
	}
	
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
