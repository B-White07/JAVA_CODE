package cn.sut_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
 * 
 * Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		//�������϶���
		Collection c = new ArrayList();
		
		//���Ԫ��
		c.add("hello"); // ʵ����������һ������ת�͵Ĺ��̣�Object obj = "hello"
		c.add("world");
		c.add("java");
		
		//����
		//Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
		Object[] obj = c.toArray();
		for(int i = 0;i<obj.length;i++) {
			//System.out.println(obj[i]);
			//�ڻ�ȡԪ�ص�ͬʱ�����ȡ���ĳ���
			//System.out.println(obj[i] + "---" + obj[i].length());
			//����ķ����Ǵ���ģ�ԭ����Object��û��length()����
			//��Ҫʹ���ַ����ķ��������뻹ԭ���ַ�������ʱ��Ҫ����ת�ͳ�ΪString������length()����
			String s =(String)obj[i];
			System.out.println(s + "---" + s.length());
			
		}
	}
}
