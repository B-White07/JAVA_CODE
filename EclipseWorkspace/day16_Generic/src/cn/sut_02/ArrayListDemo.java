package cn.sut_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��������Щ�ط�ʹ����?
 * 		��API������࣬�ӿڣ���������������<E>��˵Ҫʹ�÷��͡�һ����˵�����ڼ�����ʹ�á�
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// ʹ�÷���
		ArrayList<String> array = new ArrayList<String>();

		array.add("hello");
		array.add("world");
		array.add("java");

		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("----------------");
		
		for (int i = 0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}
