package cn.sut_02;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		// �������϶���
		HashSet<Student> hs = new HashSet<Student>();

		// ��������Ӷ���
		hs.add(new Student("lzw", 20));
		hs.add(new Student("lzw1", 22));
		hs.add(new Student("lzw", 20));
		hs.add(new Student("lzw3", 20));
		hs.add(new Student("lzw4", 27));
		hs.add(new Student("lzw5", 28));

		// ����
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
}
