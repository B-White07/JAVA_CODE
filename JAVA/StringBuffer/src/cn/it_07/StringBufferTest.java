package cn.it_07;

/*
 * ��֮���ת����
 * A -- B
 * ��Aת����B��������B�еķ���
 * B -- A
 * ��Bת��A,����Ϊ��Ҫ�Ľ����A����
 * 
 * StringBuffer��String���໥ת��
 */
public class StringBufferTest {
	public static void main(String[] aegs) {
		// String -- StringBuffer
		String s = "hello";
		//����ֱ�Ӱ��ַ�����ֵ��StringBuffer
//		StringBuffer sb = "hello";
//		StringBuffer sb = s;
		
		//����һ��ͨ�����췽��
		StringBuffer sb = new StringBuffer("hello");
		//��������ͨ��append()����
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("----------");
		
		//StringBuffer -- String
		StringBuffer buffer = new StringBuffer("java");
		//String(StringBuffer buffer)
		//��ʽһ:ͨ�����췽��
		String str = new String(buffer);
		//��ʽ����ͨ��toString()����
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
		System.out.println("----------");
		
	}
}
