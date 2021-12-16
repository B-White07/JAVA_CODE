package cn.sut_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 		C:创建学生对象
 * 		D:把学生对象添加到集合对象中
 * 		E:遍历集合
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
	c.add(new Student("lzw6",24)); //匿名对象
	
	Iterator it = c.iterator();
	while(it.hasNext()) {
		Student s = (Student)it.next();
		System.out.println(s.getName() + "---" + s.getAge());
	}

}
}
