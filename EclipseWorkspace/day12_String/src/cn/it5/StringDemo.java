package cn.it5;
/*
 * String��ת�����ܣ�
 * byte[] getBytes(): ���ַ���ת�����ֽ�����
 * char[] toCharArray(): ���ַ���ת�����ַ�����
 * static String valueOf(char[] chs): ���ַ�����ת�����ַ���
 * static String valueOf(int i): ��intת�����ַ���
 * 		ע�⣺String��valueOf()�������԰�������������ת�����ַ���
 * String toLowerCase(): ���ַ���ת����Сд
 * String toUpperCsae(): ���ַ���ת���ɴ�д
 * String conCat(): ���ַ���ƴ��
 */
public class StringDemo {
	public static void main(String[] args) {
		//�����ַ�������
		String s = "JavaSE";
		
		//byte[] getBytes(): ���ַ���ת�����ֽ�����
		byte[] bys = s.getBytes();
		for (int i = 0; i<s.length(); i++) {
			System.out.println(bys[i]);
		}
		System.out.println("--------------");
		
		//char[] toCharArray(): ���ַ���ת�����ַ�����
		char[] chs = s.toCharArray();
		for (int i = 0; i<s.length(); i++) {
			System.out.println(chs[i]);
		}
		System.out.println("--------------");
		
		//static String valueOf(char[] chs): ���ַ�����ת�����ַ���
		String s2 = String.valueOf(chs);
		System.out.println(s2);
		System.out.println("--------------");
		
		//static String valueOf(int i): ��intת�����ַ���
		int i = 100;
		String s3 = String.valueOf(i);
		System.out.println(s3);
		System.out.println("--------------");
		
		//String toLowerCase(): ���ַ���ת����Сд
		System.out.println("toLowerCase :" + s.toLowerCase());
		System.out.println("s :" + s);
		System.out.println("--------------");
		
		//String toUpperCsae(): ���ַ���ת���ɴ�д
		System.out.println("toUpperCase :" + s.toUpperCase());
		System.out.println("s :" + s);
		System.out.println("--------------");
		
		//String conCat(): ���ַ���ƴ��
		String s4 = "hello";
		String s5 = "world";
		String s6 = s4 + s5;
		String s7 = s4.concat(s5);
		System.out.println("s6 :" + s6);
		System.out.println("s7 :" + s7);
		
	}
}
