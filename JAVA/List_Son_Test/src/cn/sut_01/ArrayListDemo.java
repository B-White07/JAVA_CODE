package cn.sut_01;

import java.util.ArrayList;

/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
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
