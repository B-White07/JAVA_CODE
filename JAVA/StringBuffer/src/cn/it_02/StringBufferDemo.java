package cn.it_02;
/*
 * ���ע�ͣ�ctrl+shift+C����ctrl+/
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(String str) :���԰�����������ӵ��ַ�����������
 * public StringBuffer insert(int offset,String str):��ָ��λ�ã�����������������ӵ��ַ���������
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//��������������
		StringBuffer sb = new StringBuffer();
		
		//public StringBuffer append(String str)
//		StringBuffer sb2 = sb.append("hello");
//		
//		System.out.println("sb:" + sb);
//		System.out.println("sb2:" + sb2);
//		System.out.println(sb == sb2);
		
//		һ��һ���������
//		sb.append("hello");
//		sb.append(true);
//		sb.append(12);
//		sb.append(13.14F);
		
		//��ʽ���
		sb.append("hello").append(true).append(12).append(13.14);
		System.out.println("sb:" + sb);
		
		//public StringBuffer insert(int offset,String str)
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
	}
}
