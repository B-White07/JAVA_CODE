package cn.it7;

/*
 * ͳ�ƴ��У�С�����ֵĴ���
 * ������
 * 		"woaijavawozhendeaijavawozhendehenaijava"
 * �����
 * 		java������3��
 * 
 * ������
 * 		A:�ȶ���ͳ�Ʊ�������ʼֵΪ0
 * 		B:��ȡָ���ַ����ڴ����״γ��ֵ�λ��
 * 			������-1��˵�������ڣ�����ͳ�Ʊ���
 * 			��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�����ص�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ�󴮣��õ�һ�����ַ������������ַ�����ֵ����
 * 		D:�ص�B
 */
public class StringTest4 {
	public static void main(String[] args) {

		String bigString = "woaijavawozhendeaijavawozhendehenaijava";
		String smallString = "java";

		// ����ʵ��
		System.out.println(smallString + " ������" + getCount(bigString,smallString) + "��");
	}

	/*
	 * ������ȷ�� 1.����ֵ���ͣ�int 2.�����б�String str1,String str2
	 */
	public static int getCount(String bigString, String smallString) {
		int count = 0;

		// �ҵ��״γ��ֵ�λ��
		int index = bigString.indexOf(smallString);

		//��������-1��˵�����ڣ�����ѭ����
		while (index != -1) {
			
			count++;
			//��ȡ��ȡλ�ã�����ȡ�µ��ַ���
			int startIndex = index + smallString.length();
			bigString = bigString.substring(startIndex);
			//��������
			index = bigString.indexOf(smallString);
			
		}
		
		return count;
	}
}
