package cn.it3;
import java.util.Scanner;

/*
 *  ģ���¼�������λ��ᣬ����ʾʣ�༸�λ���
 *  
 *  ������
 *  	�����û��������룬�Ѵ��ڵ�
 *  	����¼���û���������
 *  	�Ƚ��û���������
 *  	���λ���
 *  
 */
public class StringTest {
	public static void main(String[] args) {
		//�����û���������
		String username = "admin";
		String password = "psd";
		
		//����¼���û���������
		for (int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String psd = sc.nextLine();
		
		//�Ƚ��û���������
			if (name.equals(username) && psd.equals(password)) {
				System.out.println("��½�ɹ���");
				break;
			}else {
				if ((2-i) == 0) {
					System.out.println("�����˻��Ѷ���");
				}else {
					System.out.println("�û������������������" + (2-i) + "�λ���");
				}
			}		
		}
		
	}
}
