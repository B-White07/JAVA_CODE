package cn.sut_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student s1 = new Student("lzw",20);
		Student s2 = new Student("lzw2",21);
		Student s3 = new Student("lzw3",22);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//����
//		//��ʽһ��������
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Student s = (Student)it.next();
//			System.out.println(s.getName() + "---" +  s.getAge());
//		}
		
		//��ʽ������size()��get()����
		for(int i = 0;i<list.size();i++) {
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "---" +  s.getAge());
		}
	}
}
