package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList�洢�Զ�����󲢱���
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);
		Student s4 = new Student("lzw4", 23);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);

		// ��ʽһ
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

		System.out.println("----------------------------------");
		// ��ʽ��
		for (int i = 0; i < array.size(); i++) {
			//ClassCastException ����ת�����󣬸�������ͣ����ﷵ�ص���Student��ȴ��String���գ����Դ���
//			String s = (String) array.get(i);
//			System.out.println(s);
			Student s =(Student)array.get(i);
			System.out.println(s.getName() + "---" + s.getAge()); 
		}
	}
}
