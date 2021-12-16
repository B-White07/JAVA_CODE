package com.login.check;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.hotel.dao.Connect;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@WebServlet(name="Register",urlPatterns= {"/Register"})
public class Register extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 设定字符编码
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//获取JSP页面传递过来的注册信息。包括，用户名，密码，电话等等
		String Name = req.getParameter("Name");//参数对应jsp中的name
		String password = req.getParameter("Password");
		String Telephone = req.getParameter("Telephone");
		System.out.println(Name + "---" +password + "---" + Telephone);
		// 连接数据库设定好要访问的表
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		MongoCollection<Document> mongoCollection;
		Document document;
		MongoDatabase con = Connect.getComMongodb();
		mongoCollection = con.getCollection("Student");
		// 执行插入工作     参数是List<? extends Document>
		//new Document("Name",Name)  "Name"对应表中的字段名Name获取变量名
		document = new Document("Name",Name).append("Password", password).append("Telephone", Telephone);
		List<Document> documents = new ArrayList<Document>();
		documents.add(document);
		mongoCollection.insertMany(documents);
		// 跳转到登录页面
		resp.sendRedirect("/HotelManagement/");
		 
	}

}
