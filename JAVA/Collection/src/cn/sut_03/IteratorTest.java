package cn.sut_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
 * 注意：
 * 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);
		Student s4 = new Student("lzw4", 23);
		Student s5 = new Student("lzw5", 25);
		
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			//System.out.println(it.next());//这里为什么会调用Student的方法？？？
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
}
