package cn.sut_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱�����
 * 
 * A:����ѧ����
 * B:�������϶���
 * C:����Ԫ�ض���
 * D:��Ԫ����ӵ�����
 * E:��������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//JDK7�������ԣ������ƶ�
		//ArrayList<Student> array = new ArrayList<>();
		ArrayList<Student> array = new ArrayList<Student>();

		array.add(new Student("lzw1", 20));
		array.add(new Student("lzw2", 21));
		array.add(new Student("lzw3", 22));
		array.add(new Student("lzw4", 23));

		//������ʽһ��������
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		System.out.println("----------");
		//������ʽ����size()��get()
		for(int i = 0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
