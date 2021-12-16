package cn.sut_02;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历。
 * 
 * A:创建学生类
 * B:创建集合对象
 * C:创建元素对象
 * D:把元素添加到集合
 * E:遍历集合
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		//JDK7的新特性：泛型推断
		//ArrayList<Student> array = new ArrayList<>();
		ArrayList<Student> array = new ArrayList<Student>();

		array.add(new Student("lzw1", 20));
		array.add(new Student("lzw2", 21));
		array.add(new Student("lzw3", 22));
		array.add(new Student("lzw4", 23));

		//遍历方式一：迭代器
		Iterator<Student> it = array.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		System.out.println("----------");
		//遍历方式二：size()和get()
		for(int i = 0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
