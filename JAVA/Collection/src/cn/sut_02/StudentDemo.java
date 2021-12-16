package cn.sut_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 * 
 * 分析：
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合
 * E:把集合转成数组
 * F:遍历数组
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("lzw",20);
		Student s2 = new Student("lzw2",21);
		Student s3 = new Student("lzw3",22);
		Student s4 = new Student("lzw4",23);
		Student s5 = new Student("lzw5",25);
		
		//把学生添加到集合
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//把集合转成数组
		Object[] obj = c.toArray();
		
		//遍历数组
		for (int i = 0; i<obj.length;i++) {
			//System.out.println(obj[i]);
			Student s = (Student)obj[i];
			System.out.println(s.getName() +"---" + s.getAge());
		}
		
	}
}
