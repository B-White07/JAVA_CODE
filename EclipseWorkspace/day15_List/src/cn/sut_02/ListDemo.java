package cn.sut_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * �洢�Զ���Ķ��󲢱���
 */
public class ListDemo {
	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);

		// ��ѧ��������ӵ�������
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// ����
		// ͨ�����϶��󴴽�����������Ȼ�����
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
}
