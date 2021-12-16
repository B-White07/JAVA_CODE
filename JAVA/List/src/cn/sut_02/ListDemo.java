package cn.sut_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 存储自定义的对象并遍历
 */
public class ListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);

		// 把学生对象添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		// 通过集合对象创建迭代器对象，然后遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
}
