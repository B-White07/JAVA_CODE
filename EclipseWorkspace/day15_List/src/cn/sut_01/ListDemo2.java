package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϵ��ص㣺
 * 		����(�洢��ȡ����Ԫ��һ��)�����ظ��ġ�
 */
public class ListDemo2 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("hello");
	list.add("world");
	list.add("java");
	list.add("javaee");
	list.add("ios");
	list.add("javaee");
	list.add("ios");
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		String s =(String)it.next();
		System.out.println(s);
	}
	
}
}