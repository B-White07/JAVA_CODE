package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

import entity.Emp;

public class EmpDao {
	//����һ����ѯ�û���������ķ���
	public Emp findByUserName(String userName,String pwd){
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
		String sql="select * from emp where username=? and pwd=?";
		//����PreparedStatement����
		Emp emp=null;
		try {
			PreparedStatement prep=con.prepareStatement(sql);
			//����?�е�����
			prep.setString(1,userName);
			prep.setString(2,pwd);
			//��preparedStatment������sql�������ݿ� ����ȡ���ݿ�ķ��ؽ������
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
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
		String sql="select * from emp";
		//����PreparedStatement����
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
	//ɾ��Ա����Ϣ����
	public void delete(int id){
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
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
	//���Ա����Ϣ����
	public void add(Emp emp){
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
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
	//����id��ѯԱ����Ϣ
	public Emp findById(int id){
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
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
	//�޸�Ա����Ϣ
	public void update(Emp emp){
		//��ȡ���ݿ������
		Connection con=DBUtil.getConnection();
		//��������û����������ѯԱ����Ϣ��sql���
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
