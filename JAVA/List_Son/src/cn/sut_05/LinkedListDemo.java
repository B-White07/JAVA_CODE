package cn.sut_05;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
 *��Ŀ����˼�ǣ�
 *		���Լ��Ķ���һ�������࣬������������ڲ�����ʹ��LinkedListģ�⡣
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		//ջ���ص㣬�Ƚ������ʹ��LinkedList�����з���addFirst����
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
