package cn.it_03;

/*
 * ���ַ����е��ַ���������
 * 		������"dacgebf"
 * 		�����"abcdefg"
 * 
 * ������
 * 		A:����һ���ַ���
 * 		B:���ַ���ת��Ϊ�ַ�����
 * 		C:���ַ������������
 * 		D:���������ַ�����ת���ַ���
 * 		E:��������ַ���
 */
public class ArrayTest {
	public static void main(String[] args) {
		String s = "dacgebf";
		char[] chs = s.toCharArray();
		bubbleSort(chs);
		String result = String.valueOf(chs);
		System.out.println("����ǣ�" + result);
	}

	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int i = 0; i < chs.length - 1 - x; i++) {
				if (chs[i] > chs[i + 1]) {
					char temp = chs[i + 1];
					chs[i + 1] = chs[i];
					chs[i] = temp;
				}
			}
		}
	}
}
