package cn.sut_01;

/*
 * ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *		 ѧ����Student
 *		 ��Ա������name,age
 *		 ���췽�����޲�,����
 *		 ��Ա������getXxx()/setXxx()
 *		 �洢ѧ��������?�Լ�����Ӧ����ʲô���ӵ�?
 * ������
 * 		A:����ѧ���ࡣ
 * 		B:����ѧ������(��������)��
 * 		C:����5��ѧ�����󣬲���ֵ��
 * 		D:��C�����Ԫ�أ��ŵ������С�
 * 		E:����ѧ�����顣
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		Student s1 = new Student("lzw",20);
		Student s2 = new Student("wlf",21);
		Student s3 = new Student("lxt",22);
		Student s4 = new Student("hhh",23);
		Student s5 = new Student("xxx",24);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
//		//��ѭ���Ľ�
//		for (int i = 0;i<students.length;i++) {
//			students[i] = s(i+1);
//		}
		//������������������
		
		for(int i =0;i<students.length;i++) {
			//System.out.println(students[i]);
			
			//�±ߵ������������Ի�ȡ�Լ���Ҫ��ֵ������ȫ�����
			Student s = students[i];
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
}
