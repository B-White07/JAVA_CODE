package cn.it2;
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
		public static void main(String[] args) {
				Student s1 = new Student("lzw",20);
				Student s2 = new Student("lzw",20);
				System.out.println(s1 == s2);
				Student s3 = s1;
				System.out.println(s1 == s3);
				System.out.println("------------");
				
				System.out.println(s1.equals(s2));
				System.out.println(s1.equals(s1));
				System.out.println(s1.equals(s3));
				
				Student s4 = new Student("lll",21);
				System.out.println(s1.equals(s4));
				
				Demo d = new Demo();
				System.out.println(s1.equals(d));
		}
}
