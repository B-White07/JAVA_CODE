package cn.sut.dao.impl;

import java.util.ArrayList;

import cn.sut.dao.UserDao;
import cn.sut.pojo.User;

/**
 * �����û������ľ���ʵ���ࣨ���ϰ棩
 * 
 * @author B_White
 * @version V1.0
 */
public class UserDaoImpl implements UserDao {
	// Ϊ���ö�������ܷ���ͬһ�����ϣ��Ѽ��϶���Ϊ��Ա����
	// Ϊ�˲�����翴������private����
	//Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean islogin(String username, String password) {
		// �������ϣ���ȡÿһ���û������жϸ��û����û����������Ƿ��봫�ݹ�����һ��
		boolean flag = false;

		for (User user : array) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		// ���û���Ϣ���뼯��
		// ArrayList<User> array = new ArrayList<User>();
		array.add(user);

	}

}
