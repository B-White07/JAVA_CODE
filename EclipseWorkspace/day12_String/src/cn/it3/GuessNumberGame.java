package cn.it3;
import java.util.Scanner;
/*
 *  ��������Ϸ
 */
public class GuessNumberGame {
	//�����췽��˽�л�������ͨ�����췽����ʼ��
	private GuessNumberGame() {
		
	}
	
	public static void start() {
		//���������
		int number = (int) (Math.random()*100) + 1; 
		
		//����¼������
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��������µ����ݣ�1-100��:");
			int guessNumber = sc.nextInt();
		
			//�ж�
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			}else if(guessNumber < number){
				System.out.println("��µ�����" + guessNumber + "С��");
			}else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
		
	}
}
