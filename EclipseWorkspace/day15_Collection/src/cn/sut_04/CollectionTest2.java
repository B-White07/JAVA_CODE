package cn.sut_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���󣺴洢�Զ�����󲢱���Student(name,age)
 *
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:����ѧ������
 * 		D:��ѧ��������ӵ����϶�����
 * 		E:��������
 */
public class CollectionTest2 {
public static void main(String[] args) {
	Collection c = new ArrayList();
	
	Student s1 = new Student("lzw1",20);
	Student s2 = new Student("lzw2",21);
	Student s3 = new Student("lzw3",22);
	Student s4 = new Student();
	s4.setName("lzw5");
	s4.setAge(23);
	
	c.add(s1);
	c.add(s2);
	c.add(s3);
	c.add(s4);
	c.add(new Student("lzw6",24)); //��������
	
	Iterator it = c.iterator();
	while(it.hasNext()) {
		Student s = (Student)it.next();
		System.out.println(s.getName() + "---" + s.getAge());
	}

}
}
