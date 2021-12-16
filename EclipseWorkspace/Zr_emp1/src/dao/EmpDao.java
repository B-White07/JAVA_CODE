package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Emp;
import util.DBUtil;

public class EmpDao {
	//定义一个查询用户名和密码的方法
	public Emp findByUserName(String userName,String pwd){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="select * from emp where username=? and pwd=?";
		//定义PreparedStatement对象
		Emp emp=null;
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			//设置?中的内容
			prep.setString(1,userName);
			prep.setString(2,pwd);
			//让preparedStatment对象发送sql语句给数据库 并获取数据库的返回结果对象
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				emp=new Emp();
				emp.setId(rs.getInt("id"));
				emp.setUserName(rs.getString("username"));
				emp.setPwd(rs.getString("pwd"));
				emp.setAge(rs.getInt("age"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setGendar(rs.getString("gendar"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public List<Emp> findAll(){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="select * from emp";
		//定义PreparedStatement对象
		List<Emp>emps=new ArrayList<Emp>();
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			ResultSet rs=prep.executeQuery();
			while(rs.next()){
				Emp emp=new Emp();
				emp.setId(rs.getInt("id"));
				emp.setUserName(rs.getString("username"));
				emp.setPwd(rs.getString("pwd"));
				emp.setAge(rs.getInt("age"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setGendar(rs.getString("gendar"));
				emps.add(emp);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}
	//删除员工信息方法
	public void delete(int id){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="delete from emp where id=?";
		
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1,id);
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//添加员工信息方法
	public void add(Emp emp){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="insert into emp(username,pwd,age,salary,gendar)values(?,?,?,?,?)";
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,emp.getUserName());
			prep.setString(2, emp.getPwd());
			prep.setInt(3, emp.getAge());
			prep.setDouble(4, emp.getSalary());
			prep.setString(5, emp.getGendar());
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//根据id查询员工信息
	public Emp findById(int id){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="select * from emp where id=?";
		Emp emp=null;
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setInt(1, id);
			ResultSet rs=prep.executeQuery();
			if(rs.next()){
				emp=new Emp();
				emp.setId(rs.getInt("id"));
				emp.setUserName(rs.getString("username"));
				emp.setPwd(rs.getString("pwd"));
				emp.setAge(rs.getInt("age"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setGendar(rs.getString("gendar"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	//修改员工信息
	public void update(Emp emp){
		//获取数据库的链接
		Connection con=DBUtil.getConnection();
		//定义根据用户名和密码查询员工信息的sql语句
		String sql="update emp set username=?,age=?,salary=? where id=?";
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			prep.setString(1,emp.getUserName());
			prep.setInt(2, emp.getAge());
			prep.setDouble(3,emp.getSalary());
			prep.setInt(4, emp.getId());
			prep.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		List<Emp> emps=dao.findAll();
		System.out.println(emps);
	}
}

