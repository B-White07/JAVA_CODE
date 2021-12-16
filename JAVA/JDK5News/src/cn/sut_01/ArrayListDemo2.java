package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayList�洢�Զ�����󲢱�����Ҫ����뷺�ͣ�������ǿfor������
 * A:������
 * B:��ͨfor
 * C:��ǿfor
 * 
 * LinkedList,Vector,Colleciton,List�ȴ洢�һ�����?�������ˣ�����Ҫ��������ϰ��
 * 
 * ��ǿfor���������������
 */
public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList<Student> array = new ArrayList<Student>();
	array.add(new Student("lzw",20));
	array.add(new Student("lzw2",22));
	array.add(new Student("lzw3",21));
	
	//������
	Iterator<Student> it = array.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
	
	//��ͨfor
	for(int i =0;i<array.size();i++) {
		Student s = array.get(i);
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
	
	//��ǿfor
	for(Student s :array) {
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
}
}
