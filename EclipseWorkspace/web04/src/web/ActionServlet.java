package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAO;
import dao.UserDAOImpl;
import entity.User;

public class ActionServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws Exception, IOException {
		request.setCharacterEncoding("utf-8");
		//获取分析后的请求资源路径
		String uri=request.getRequestURI();
		//从当前位置到最后
		CharSequence action=uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
		//含头不含尾
		//依据请求,调用不同的分支来处理请求
		if(action.equals("/list"))
		{
			try{
			System.out.println("list.do被调用");
			//向DAO要数据
			UserDAO dao=new UserDAOImpl();
			//使用dao获取所有员工的信息
			List<User> users=dao.findAll();
			//调用JSP(使用转发技能)
			//1.绑定数据(set,获取数据--get)
			request..setAttribute("users", users);
			//2.获取转发器(当前数据转发到哪个页面)
			RequestDispatcher rd=request.getRequestDispatcher("listUsers.jsp");
			//3.转发
			rd.forward(request, response);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常！！！");
			}
		}
		else if(action.equals("/add"))
		{
			request.setCharacterEncoding("utf-8");
			
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			String email = request.getParameter("email");
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			try{
				System.out.println("add.do被调用");
				User u=new User(username,pwd,email);
				UserDAO dao=new UserDAOImpl();
				dao.addUser(u);
				response.sendRedirect("list.do");
				
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常！！！");
			}
		}
		//删除
		else if(action.equals("/del")){
			int id=Integer.parseInt(request.getParameter("id"));
			response.setContentType("text/html;charset=utf-8");
			try{
				System.out.println("del.do被调用");
				UserDAO dao=new UserDAOImpl();
				dao.DelUser(id);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常!");
			}
		}
		else if(action.equals("/load")){
			int id=Integer.parseInt(request.getParameter("id"));
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			try{
				System.out.println("load.do被调用");
				UserDAO dao=new UserDAOImpl();
				User u=dao.findId(id);
				request.setAttribute("users", u);
				RequestDispatcher rd=request.getRequestDispatcher("updateUser.jsp");
				rd.forward(request, response);}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常!");
			}
		}
		
		
		
		else if(action.equals("/update")){
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			try{
				int id=Integer.parseInt(request.getParameter("id"));
				String username = request.getParameter("username");
				String pwd = request.getParameter("pwd");
				String email = request.getParameter("email");
				System.out.println(username);
				System.out.println(pwd);
				System.out.println(email);
					User us=new User(id,username,pwd,email);
					UserDAO d=new UserDAOImpl();
					d.modifyUser(us);
					response.sendRedirect("list.do");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常!");
			}
		}
		
		
		
	}
}








