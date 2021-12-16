package cn.sut_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector�����й��ܣ�
 * 1����ӹ���
 * 		public void addElement(Object obj)		--	add()
 * 2����ȡ����
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 * 
 * JDK������ԭ��
 * 		A:��ȫ
 * 		B:Ч��
 * 		C:����д
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");

		// ����
		// ��ʽһ
		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}

		System.out.println("-------");
		// ��ʽ��
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
