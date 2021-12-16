package com.ListEnty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.Enty.User;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.utils.getConnection;

@WebServlet(name = "firstServletList", urlPatterns = { "/firstServletList" })
public class EntyList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charSet=UTF-8");

		// 获取前台JSP页面传递过来的内容
		String name = request.getParameter("UserName");
		// 将传递过来的内容。封装到对象中。在保存到集合中。然后回传给JSP页面并显示

		// 1.创建一个集合接收获取到的数据
		MongoCollection<Document> mongoCollection;
		// 2.创建一个迭代器来查询出数据
		FindIterable<Document> findIterable;
		// 3.创建游标。遍历集合中的数据
		MongoCursor<Document> mongoCursor;
		// 4.获取连接
		MongoDatabase con = getConnection.getConMongodb();
		// 5.指定要查询的表传入的是表名
		mongoCollection = con.getCollection("Student");
		// 6.调用FIND方法进行查找
		findIterable = mongoCollection.find();
		// 7.通过游标依次迭代输出到控控制台
		mongoCursor = findIterable.iterator();
		List<User> listuser = new ArrayList<User>();
		// 8.循环输出
		User u = new User(name);
		while (mongoCursor.hasNext()) {
			Document docum = (Document) mongoCursor.next();
			User u1 = new User();
			u1.setUserName(docum.getString("UserName"));
			listuser.add(u1);
		}

		// 保存到集合中

		listuser.add(u);

		// 将集合保存到request作用域中进行传递"listuser" 可以任意写。
		request.setAttribute("listuser", listuser);

		// 跳转展示页面
		request.getRequestDispatcher("searlistUser.jsp").forward(request, response);

	}

}
