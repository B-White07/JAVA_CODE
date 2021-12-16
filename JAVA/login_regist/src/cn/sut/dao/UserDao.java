package cn.sut.dao;

import cn.sut.pojo.User;

/**
 * 这是针对用户进行操作的接口
 * 
 * @author B_White
 * @version V1.0
 */
public interface UserDao {
	/**
	 * 这是用户登录功能
	 * 
	 * @param username 这是用户名
	 * @param password 这是密码
	 * @return 返回是否成功
	 */
	public abstract boolean islogin(String username, String password);

	/**
	 * 这是用户注册功能，参数过多的时候，直接传递对象
	 * 
	 * @param user 要注册的用户信息
	 */
	public abstract void regist(User user);
}
