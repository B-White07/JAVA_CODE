package cn.it6;
/*
 * String�����������
 * 
 * �滻���ܣ�
 * String replace(char old,char new)
 * String replace(String old,String new)
 * 
 * ȥ���ַ������˿ո�
 * String trim()
 * 
 * ���ֵ�˳��Ƚ��ַ�����
 * int compareTo(String str)
 * int compareToIgnoreCase(String str)
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		
		//�滻���ܣ�
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'i');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		System.out.println("s3 :" + s3);
		System.out.println("---------------");
		
		//ȥ���ַ������˿ո�
		String s4 = "  hello world  ";
		String s5 = s4.trim();
		System.out.println("s4 :" + s4 + "�пո�");
		System.out.println("s5 :" + s5 + "�޿ո�");
		System.out.println("------------------");
		
		//���ֵ�˳��Ƚ��ַ�����
		String s6 = "helloworld";
		String s7 = "helloWorld";
		String s8 = "abc";
		String s9 = "xyz";
		String s10 = "Hello World";
		String s11 = "  ";
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s10));
		System.out.println(s6.compareTo(s8));
		System.out.println(s6.compareTo(s9));
		System.out.println(s6.compareTo(s11));
		
	}
}
