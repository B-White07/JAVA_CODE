package dao;

import java.sql.SQLException;
import java.util.List;

import entity.User;

public interface UserDAO {
	/*查询所有用户信息，在实现类当中*/
	public List<User> findAll()throws SQLException;
	/*添加用户信息*/
	public void addUser(User u)throws SQLException;
	/*删除用户信息*/
	public void DelUser(int id)throws SQLException;
	/*修改用户信息*/
	/*按照id号查找用户信息*/
	public User findId(int id)throws SQLException;
	/*修改用户信息*/
	public void modifyUser(User us)throws SQLException;

}
