package cn.sut_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�ַ�����������
 * 
 * ������
 * 		A:�������϶���
 * 		B:�����ַ�������
 * 		C:���ַ���������ӵ�������
 * 		D:��������
 */
public class CollectionTest {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}

	}
}
