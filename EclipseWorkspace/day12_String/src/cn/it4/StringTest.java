package cn.it4;

/*
 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 * 
 * ������
 * 	����õ�ÿһ���ַ���
 * 		char charAt(int index);
 * 	��ô֪���ж��ٸ��ַ�
 * 		int length();
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "hello world";
		
		// forѭ��
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}
}
