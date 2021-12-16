package UserService.impl;

import UserDao.impl.UserDaoImpl;
import UserService.UserService;
import entity.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean loginUser(String userName) {
		//调用DAO实现类中的findByNameAndPassword()方法
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User u = new User();
		u.setUserName(userName);
		return userDaoImpl.findByNameAndPassword(u.getUserName());
	}

}
