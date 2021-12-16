package cn.sut.dao.impl;

import java.util.ArrayList;

import cn.sut.dao.UserDao;
import cn.sut.pojo.User;

/**
 * 这是用户操作的具体实现类（集合版）
 * 
 * @author B_White
 * @version V1.0
 */
public class UserDaoImpl implements UserDao {
	// 为了让多个方法能访问同一个集合，把集合定义为成员变量
	// 为了不让外界看到，用private修饰
	//为了让多个对象共享同一个成员变量，用static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean islogin(String username, String password) {
		// 遍历集合，获取每一个用户，并判断该用户的用户名和密码是否与传递过来的一致
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
		// 把用户信息存入集合
		// ArrayList<User> array = new ArrayList<User>();
		array.add(user);

	}

}
