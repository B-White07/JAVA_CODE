package cn.it_01;

import java.util.Scanner;

/*
 * У��QQ�ţ�
 * 		A:����5-15λ������
 * 		B:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��QQ��
 * 		B:д����ʵ��У��
 * 		C:���÷�����������
 */
public class RegexDemo {
	public static void main(String[] args) {
		// ����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������QQ�ţ�");
		String qq = sc.nextLine();

		// ���÷���
		System.out.println("checkQQ��" + checkQQ(qq));
	}

	// ���巽��
	/*
	 * ��ȷ�� 1.����ֵ���ͣ�boolean 2.�����б�String str
	 */
	public static boolean checkQQ(String str) {
		boolean flag = true;

		// �ж�λ��
		if (str.length() >= 5 && str.length() <= 15) {
			// ����0��ͷ
			// char[] chs = str.toCharArray();
			if (!str.startsWith("0")) {
				// ����������
				char[] chs = str.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					char ch = chs[i];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		
		return flag;
	}
}
