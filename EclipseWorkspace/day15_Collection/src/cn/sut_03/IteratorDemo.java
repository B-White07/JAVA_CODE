package cn.sut_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():�����������ϵ�ר�ñ�����ʽ
 * 		Object next():��ȡԪ��,���ƶ�����һ��λ�á�
 * 			NoSuchElementException��û��������Ԫ�أ���Ϊ���Ѿ��ҵ�����ˡ�
 * 		boolean hasNext():�������Ԫ�ؿ��Ե������򷵻� true����
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		Iterator it = c.iterator();// ʵ�ʷ���������������Ƕ�̬

//		Object obj  = it.next();
//		System.out.println(obj);

//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//NoSuchElementException

		while (it.hasNext()) {
			// System.out.println(it.next());
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
