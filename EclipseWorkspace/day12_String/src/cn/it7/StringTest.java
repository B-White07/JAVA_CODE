package cn.it7;

/*
 * ���󣬰������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 * 
 * ���磺
 * 		int arr[] = {1,2,3};
 * �����
 * 		[1, 2, 3]
 * ������
 * 		A:����һ�����ַ�������
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:�жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ�ƴ��Ԫ�غ�"]"
 * 			���ǣ�ƴ��Ԫ���Լ����źͿո�
 * 		E:���ƴ�Ӻ���ַ���
 */
public class StringTest {
	public static void main(String[] args) {
		// ��������
		int arr[] = { 1, 2, 3 };
		// ������ַ�����ƴ��������
		String s = "";
		s += "[";

		// ����������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			//���ж��Ƿ�Ϊ���һ��
			if (i == (arr.length - 1)) {
				s += arr[i];
				s += "]";
				//return;
			} else {
				s += arr[i];
				s += ", ";
			}
			// return ;
		}

		System.out.println("����ǣ�" + s);
	}
}
