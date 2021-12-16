package cn.it_08;

/*
 * �����⣺
 * 1.String��StringBuffer��StringBuilder������
 * A:String�����ݲ��ɱ�ģ�StringBuffer��StringBuilder�������ǿɱ��
 * B:StringBuffer��ͬ���ģ����ݰ�ȫ��Ч�ʵͣ�StringBuilder�ǲ�ͬ���ģ����ݲ���ȫ��Ч�ʸ�
 * 		ע�⣺���ݰ�ȫ�����ָ�ڶ��̵߳�����£����̲߳������������
 * 
 * 2.StringBuffer�����������
 * ���߶����Կ���������װ��������
 * ���ǣ�StringBuffer������������һ���ַ�������
 * ��������Է��ö������ݣ���������ͬһ���������͵�
 * 
 * 3.��ʽ��������
 * String��Ϊ��������
 * StringBuffer��Ϊ��������
 * 
 * ��ʽ������
 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 * 
 * ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ����
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);
		change(s1, s2);
		System.out.println(s1 + "---" + s2);
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);
	}

	private static void change(StringBuffer sb1, StringBuffer sb2) {
		// TODO Auto-generated method stub
		sb1 = sb2;
		sb2 = sb1.append(sb2);
	}

	public static void change(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s2;
		s2 = s1 + s2;
	}
}
