package cn.sut_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * ����?
 * 		����һ�����ϣ����£����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 * 
 * ConcurrentModificationException:��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
 * ������ԭ��
 * 		�������������ڼ��϶����ڵģ����жϳɹ��󣬼��ϵ����������Ԫ�أ���������ȴ��֪�������Ծͱ����ˣ������в����޸��쳣��
 * 		��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
 * ��ν����?
 * 		A:����������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
 * 		B:���ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
 * 			Ԫ���������ӵġ�
 */

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//�������϶���
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//ͨ�����϶��󴴽����������󣬲���������
//		ListIterator lit = list.listIterator();
//		while(lit.hasNext()) {
//			String s = (String)lit.next();
//			if("world".equals(s)) {
//				list.add("javaee");
//			}
//			System.out.println(s);
//		}
		
		//��ʽһ������������Ԫ�أ��������޸�Ԫ��
		//��Iteratorû��add����������ʹ�����ӽӿ�ListIterator
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String s = (String)lit.next();
			if("world".equals(s)) {
				lit.add("javaee");
			}
		}
		
		//��ʽ�������ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
//		for(int i = 0;i<list.size();i++) {
//			String s = (String)list.get(i);
//			if("world".equals(s)) {
//				list.add("javaee");
//			}
//		}
		
		System.out.println("list:" + list);
	}
}
