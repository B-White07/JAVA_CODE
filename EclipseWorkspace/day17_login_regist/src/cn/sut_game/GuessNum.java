package cn.sut_game;

import java.util.Scanner;

/**
 * ���ǲ�����С��Ϸ
 * 
 * @author B_White
 * @version V1.0
 */
public class GuessNum {
	private GuessNum() {
	}

	public static void start() {
		// ����һ�������
		int num = (int) (Math.random() * 100 + 1);

		//����һ��ͳ�Ʊ���
		int count = 0;
		// ����¼������
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ��1-100�����ݣ�");
			int guessnum = sc.nextInt();
			count++;

			// �ж�
			if (guessnum > num) {
				System.out.println("����������ݴ���");
			} else if (guessnum > num) {
				System.out.println("�����������С��");
			} else {
				System.out.println("��ϲ�㣬����" + count + "�Ͳ����ˣ�");
				break;
			}
		}

	}
}
