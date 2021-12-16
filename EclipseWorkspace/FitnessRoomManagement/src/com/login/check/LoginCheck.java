package com.login.check;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.hotel.bean.User;
import com.hotel.dao.Connect;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

@WebServlet(name = "LoginCheck", urlPatterns = { "/LoginCheck" })
public class LoginCheck extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		/*
		 * 1.连接数据库 2.获取login.jsp传递过来的用户名和密码3.查询数据库是否包含用户确定是否可以登录
		 */
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		MongoCollection<Document> mongoCollection;
		FindIterable<Document> findIterable;
		MongoCursor<Document> mongoCursor;

		// 获取页面传递过来的值username、password
		String username = req.getParameter("Name");
		String password = req.getParameter("password");

		// 获取数据库连接
		MongoDatabase con = Connect.getComMongodb();
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 访问的表
		mongoCollection = con.getCollection("Student");
		// 调用FIND()方法进行查询manager表中的全部数据，获取迭代器
		findIterable = mongoCollection.find();
		// 将迭代出来的内容放入游标挨个遍历
		mongoCursor = findIterable.iterator();

		//
		List<User> list = new ArrayList<User>();

		// 是否登录成功的标识
		boolean falg = false;
		// 接下来开始循环数据。对比是否在表中有待登录的用户名

		while (mongoCursor.hasNext()) {
			User customer = new User();
			Document documentaa = (Document) mongoCursor.next();
			// 将查询出的所有结果。保存到POJO对象中。并存于LIST集合。然后挨个对比是否可登录
			customer.setUsername(documentaa.getString("Name"));
			customer.setPassword(documentaa.getString("Password"));
			list.add(customer);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUsername().equals(username) && list.get(i).getPassword().equals(password)) {
				falg = true;
				break;
			}
		}
		if(falg){
			req.getRequestDispatcher("/Manage.html").forward(req, resp);
		} else {
			System.out.println("*****");
			resp.sendRedirect("/HotelManagement/");
		}

	}

}
