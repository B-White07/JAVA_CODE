package cn.sut_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
 * 
 * ������
 * A:����ѧ����
 * B:�������϶���
 * C:����ѧ������
 * D:��ѧ����ӵ�����
 * E:�Ѽ���ת������
 * F:��������
 */
public class StudentDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("lzw",20);
		Student s2 = new Student("lzw2",21);
		Student s3 = new Student("lzw3",22);
		Student s4 = new Student("lzw4",23);
		Student s5 = new Student("lzw5",25);
		
		//��ѧ����ӵ�����
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//�Ѽ���ת������
		Object[] obj = c.toArray();
		
		//��������
		for (int i = 0; i<obj.length;i++) {
			//System.out.println(obj[i]);
			Student s = (Student)obj[i];
			System.out.println(s.getName() +"---" + s.getAge());
		}
		
	}
}
