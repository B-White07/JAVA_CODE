package cn.sut_04;

/*
 * 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 * 
 * 我们按照和字符串一样的操作，发现出问题了。
 * 为什么呢?
 * 		我们必须思考哪里会出问题?
 * 		通过简单的分析，我们知道问题出现在了判断上。
 * 		而这个判断功能是集合自己提供的，所以我们如果想很清楚的知道它是如何判断的，就应该去看源码。
 * contains()方法的底层依赖的是equals()方法。
 * 而我们的学生类中没有equals()方法，这个时候，默认使用的是它父亲Object的equals()方法
 * Object()的equals()默认比较的是地址值，所以，它们进去了。因为new的东西，地址值都不同。
 * 按照我们自己的需求，比较成员变量的值，重写equals()即可。
 * 自动生成即可。
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);
		Student s4 = new Student("lzw4", 23);
		Student s5 = new Student("lzw", 22);
		Student s6 = new Student("lzw", 20);
		Student s7 = new Student("lzw5", 20);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		ArrayList newArray = new ArrayList();
		for (int i = 0; i < array.size(); i++) {
			if (!newArray.contains(array.get(i))) {
				newArray.add(array.get(i));
			}
		}
		
		Iterator it = newArray.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName()+ "---" + s.getAge());
		}
	}
}
