package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

public class EmpServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//实现登录功能
			//接收浏览器传递过来的信息
		System.out.println(111);
		EmpDao dao=new EmpDao();
		String user=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();//获取从服务器到浏览器的输出流
		Emp emp=dao.findByUserName(user, pwd);
		
		if(emp!=null){
			//跳转到主页面
			//利用转发跳转
			//在跳转之前去数据库把所有人的信息查询出来 并封装 然后再跳转
			List<Emp>emps=dao.findAll();
			//将数据绑定到request的对象上
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
		}else{
			//继续停留在登录页面 并提示用户  他输入的用户名或密码错误
		}
		
		
	}
}