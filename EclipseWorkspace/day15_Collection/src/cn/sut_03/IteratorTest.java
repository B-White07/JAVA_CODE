package cn.sut_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
 * 
 * ע�⣺
 * 		A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ��
 * 		B:���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ������������׳��ֲ����������⡣
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);
		Student s4 = new Student("lzw4", 23);
		Student s5 = new Student("lzw5", 25);
		
		//��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			//System.out.println(it.next());//����Ϊʲô�����Student�ķ���������
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
}
