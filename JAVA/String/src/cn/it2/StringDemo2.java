package cn.it2;

/*
 * ����
 * String s = new String0("Hello")
 * String s = "Hello" 
 * ͨ�����췽���������󣬻��ڶ��ڴ�ͷ�����������һ�����󣬹������������󣨷������ĳ���������У���ôֻ����һ����
 * ֱ�Ӹ���ֻ���ڷ��������ַ����������д���һ�����󣨻򲻴�����
 */

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
