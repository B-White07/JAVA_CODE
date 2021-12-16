package cn.it3;
/*
 *  ==   
 *  	�������ͣ��Ƚ�ֵ
 *  	�������ͣ��Ƚϵ�ֵַ
 *  
 *  equals����
 *  	�������ͣ�Ĭ�ϱȽϵ�ֵַ���������Ը�����Ҫ��д�÷����������Զ����ɣ�һ��Ƚ϶���ĳ�Ա������ֵ�Ƿ���ͬ
 * 
 */
public class StudentDemo {
		public static void main(String[] args) throws CloneNotSupportedException {
			//����ѧ������
			Student s = new Student();
			s.setName("�ڰ�");
			s.setAge(20);
			
			//��¡ѧ������
			Object obj = s.clone();
			Student s2 = (Student)obj;
			System.out.println("------");
			
			System.out.println(s.getName()+"---"+s.getAge());
			System.out.println(s2.getName()+"---"+s2.getAge());
			
			//��ǰ������
			Student s3 = s;
			System.out.println(s3.getName()+"---"+s3.getAge());
			System.out.println("------");
			
			//����
			s3.setAge(22);
			s3.setName("����ΰ");
			System.out.println(s.getName()+"---"+s.getAge());
			System.out.println(s2.getName()+"---"+s2.getAge());
			System.out.println(s3.getName()+"---"+s3.getAge());
			
			
		}
}
