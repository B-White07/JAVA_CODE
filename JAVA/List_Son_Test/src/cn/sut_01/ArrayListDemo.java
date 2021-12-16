package cn.sut_01;

import java.util.ArrayList;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<ArrayList<Student>> bigArray = new ArrayList<ArrayList<Student>>();
	
	ArrayList<Student> array = new ArrayList<Student>();
	array.add(new Student("lzw",20));
	array.add(new Student("lzw1",21));
	array.add(new Student("lzw2",22));
	
	ArrayList<Student> array2 = new ArrayList<Student>();
	array.add(new Student("lzw",20));
	array.add(new Student("lzw1",21));
	array.add(new Student("lzw2",22));
	array.add(new Student("lzw3",23));
	
	ArrayList<Student> array3 = new ArrayList<Student>();
	array.add(new Student("lzw",20));
	array.add(new Student("lzw1",21));
	array.add(new Student("lzw2",22));
	array.add(new Student("lzw3",23));
	array.add(new Student("lzw4",24));
	
	bigArray.add(array);
	bigArray.add(array2);
	bigArray.add(array3);
	
	for(ArrayList<Student> arrayList:bigArray) {
		for(Student s:arrayList) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
	
}
}
