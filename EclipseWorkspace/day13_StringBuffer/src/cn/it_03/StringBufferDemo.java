package cn.it_03;
/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ���ַ�������������
 * public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý������ַ������������������󲻰���
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		//�����ַ�������������
		StringBuffer sb = new StringBuffer();
		
		//��ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);
//		
//		//public StringBuffer deleteCharAt(int index)
//		//ɾ��e
//		sb.deleteCharAt(1);
//		System.out.println("sb:" + sb);
//		
//		//ɾ����һ��l
//		sb.deleteCharAt(1);
//		System.out.println("sb:" + sb);
//		
//		//ɾ��world
//		sb.delete(5, 10);
//		System.out.println("sb:" + sb);
//		
		//ȫɾ
		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);
	}
}
