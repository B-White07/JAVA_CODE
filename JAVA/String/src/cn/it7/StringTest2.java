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
 * 
 * �ù���ʵ��
 */
public class StringTest2 {
	public static void main(String[] args) {
		//��������
		int[] arr = {1,2,3};
		
		//�ù���ʵ��
		String s = arrayToString(arr);
		System.out.println("����ǣ�" + s);
	}
	
	//������ȷ��1.����ֵ���ͣ�String		2.�����б�int[] arr
	public static String arrayToString(int[] arr) {
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

			//System.out.println("����ǣ�" + s);
			return s;
	}
}


