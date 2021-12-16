package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List�������ص㣺
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			 �ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 
 * ������
 * 		ʹ��List���κ�����洢�ַ������ߴ洢�Զ�����󲢱�����
 * 
 * ArrayList��ʹ�á�	
 * 		�洢�ַ���������
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		array.add("hello");
		array.add("world");
		array.add("java");

		//��ʽһ
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		
		System.out.println("-----------");
		//��ʽ��
		for(int i = 0;i<array.size();i++) {
			String s = (String)array.get(i);
			System.out.println(s);
		}
	}
}
