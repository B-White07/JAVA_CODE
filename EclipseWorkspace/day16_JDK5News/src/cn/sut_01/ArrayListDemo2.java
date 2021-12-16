package cn.sut_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList存储自定义对象并遍历。要求加入泛型，并用增强for遍历。
 * A:迭代器
 * B:普通for
 * C:增强for
 * 
 * LinkedList,Vector,Colleciton,List等存储我还讲吗?不讲解了，但是要求你们练习。
 * 
 * 增强for是用来替迭代器。
 */
public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList<Student> array = new ArrayList<Student>();
	array.add(new Student("lzw",20));
	array.add(new Student("lzw2",22));
	array.add(new Student("lzw3",21));
	
	//迭代器
	Iterator<Student> it = array.iterator();
	while(it.hasNext()) {
		Student s = it.next();
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
	
	//普通for
	for(int i =0;i<array.size();i++) {
		Student s = array.get(i);
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
	
	//增强for
	for(Student s :array) {
		System.out.println(s.getName() + "--" + s.getAge());
	}
	System.out.println("---------------------------------");
}
}
