package cn.it_04;

/*
 * StringBuffer ���滻����
 * public StringBuffer replace(int start,int end,String str)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// �������
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		// public StringBuffer replace(int start,int end,String str)
		// ��world�滻�ɡ���á�
		sb.replace(5, 10, "���");
		System.out.println("sb:" + sb);
	}
}
