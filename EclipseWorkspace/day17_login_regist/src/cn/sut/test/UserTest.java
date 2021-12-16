package cn.sut.test;

import java.util.Scanner;

import cn.sut.dao.UserDao;
import cn.sut.dao.impl.UserDaoImpl;
import cn.sut.pojo.User;
import cn.sut_game.GuessNum;

/**
 * �û�������
 * 
 * @author B_White
 * @version V1.0
 * 
 *          ����������С���⣺ 1:���������һ����Ա�������þ�̬static
 *          2:��ѭ���г���switch,switch�е�break��������switch��������ѭ��
 */
public class UserTest {
	public static void main(String[] args) {
		// Ϊ�˶��ʹ�ã�����ѭ��
		while (true) {
			// ��ӭ���棬����ѡ����
			System.out.println("------��ӭ����------");
			System.out.println("1  ��¼");
			System.out.println("2  ע��");
			System.out.println("3  �˳�");
			System.out.println("���������ѡ�� ");

			// ����¼��
			Scanner sc = new Scanner(System.in);
			// Ϊ�˷��㣬�����������ǲ����ַ�����
			String choice = sc.nextLine();

			// switch���Ķ���ط�Ҫʹ�ã����Զ��嵽����
			UserDao ud = new UserDaoImpl();

			// �򵥷�����ѡ��switch case���
			switch (choice) {
			case "1":
				System.out.println("------��¼------");
				System.out.println("�������û���:");
				String username = sc.nextLine();
				System.out.println("����������:");
				String password = sc.nextLine();

				// ���õ�¼����
				// UserDao ud =new UserDaoImpl();
				boolean flag = ud.islogin(username, password);
				if (flag) {
					System.out.println("��½�ɹ���");
					System.out.println("��Ҫ����Ϸ��");
					//String s = sc.nextLine();
					// ����Ϸ
					while (true) {
						String s = sc.nextLine();
						if(s.equalsIgnoreCase("y")) {
							GuessNum.start();
							System.out.println("���������Ϸ��Y/N");
						}else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);// ���ǽ�������
					// break;//switch�е�break����������switch,��Ҫ����������exit();
				} else {
					System.out.println("�û�����������󣬵�½ʧ�ܣ�");
				}

				break;
			case "2":
				System.out.println("------ע��------");
				System.out.println("�������û���:");
				String newUsername = sc.nextLine();
				System.out.println("����������:");
				String newPassword = sc.nextLine();

				// ���û����������װ��һ��������
				User newUser = new User();
				newUser.setUsername(newUsername);
				newUser.setPassword(newPassword);

				// ����ע�Ṧ��
				// ��̬
				// UserDao ud = new UserDaoImpl();
				// ������ʹ��
				// UserDaoImpl udi = new UserDaoImpl();

				ud.regist(newUser);
				System.out.println("ע��ɹ���");
				break;
			case "3":
			default:
				System.out.println("�����˳�");
				System.exit(0);
				break;
			}
		}
	}
}
