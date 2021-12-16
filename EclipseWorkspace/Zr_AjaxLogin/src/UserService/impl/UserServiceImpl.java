package UserService.impl;

import UserDao.impl.UserDaoImpl;
import UserService.UserService;
import entity.User;

public class UserServiceImpl implements UserService {
	@Override
	public boolean loginUser(String userName) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User u = new User();
		u.setUserName(userName);
		//u.setPassword(password);

		return userDaoImpl.findByNameAndPassword(u.getUserName());
	}
}
