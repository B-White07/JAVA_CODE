package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import entity.User;
import utils.DBUtils;

public class UserDAOImpl implements UserDAO {

	/*查询所有用户信息*/
	@Override
	public List<User> findAll() throws SQLException {
		List<User> users=new ArrayList<User>();
		Connection conn=DBUtils.getConn();
		String sql="select * from user";
		Statement stat=conn.createStatement();
		ResultSet rs=stat.executeQuery(sql);
		
		while(rs.next())
			{
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setPwd(rs.getString("pwd"));
			u.setEmail(rs.getString("email"));
			users.add(u);
			}
		DBUtils.close(conn);
		return users;
	}
	/*添加用户信息*/
	@Override
	public void addUser(User u) throws SQLException {
		Connection conn = DBUtils.getConn();
		String sql = "insert into user(username,pwd,email) values(?,?,?)";
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, u.getUsername());
		stat.setString(2, u.getPwd());
		stat.setString(3, u.getEmail());
		stat.executeUpdate();
		DBUtils.close(conn);
	}
	/*删除用户信息*/
	@Override
	public void DelUser(int id) throws SQLException {
		Connection conn=DBUtils.getConn();
		String sql="delete from user where id="+id;
		Statement stat=conn.createStatement();
		stat.executeUpdate(sql);
		DBUtils.close(conn);
		
	}
	
	
	
	/*修改用户信息*/
	/*根据id号查找要进行修改的用户信息*/
	@Override
	public User findId(int id) throws SQLException {
		Connection conn=DBUtils.getConn();
		String sql="select * from user where id=?";
		PreparedStatement stat=conn.prepareStatement(sql);
		stat.setInt(1, id);
		ResultSet rs=stat.executeQuery();
		User u=null;
		while(rs.next())
		{
			String username=rs.getString("username");
			String pwd=rs.getString("pwd");
			String email=rs.getString("email");
			//最后将结果封装在一个对象当中
			u=new User(id,username,pwd,email);
		}
		DBUtils.close(conn);
		return u;
	}
	/*修改用户的信息*/
	@Override
	public void modifyUser(User us) throws SQLException {
		System.out.println(us.getUsername());
		System.out.println(us.getPwd());
		System.out.println(us.getEmail());
		System.out.println(us.getId());
		Connection conn=DBUtils.getConn();
		String sql="update user set username=?,pwd=?,email=? where id=?";
		PreparedStatement stat=conn.prepareStatement(sql);
		stat.setString(1, us.getUsername());
		stat.setString(2, us.getPwd());
		stat.setString(3, us.getEmail());
		stat.setInt(4, us.getId());
		int rs=stat.executeUpdate();
		System.out.println(rs);
		DBUtils.close(conn);
		
		
		
		
	}
	

}

