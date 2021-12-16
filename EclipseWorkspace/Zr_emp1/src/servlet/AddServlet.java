package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//获取前端添加员工页面传递过来的表单信息
			String userName=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age"));
			double sal=Double.parseDouble(request.getParameter("salary"));
			String pwd=request.getParameter("pwd");
			String gendar=request.getParameter("gendar");
			Emp emp=new Emp();
			emp.setUserName(userName);
			emp.setGendar(gendar);
			emp.setAge(age);
			emp.setPwd(pwd);
			emp.setSalary(sal);
			EmpDao dao=new EmpDao();
			dao.add(emp);
			//员工信息已经成功添加到数据库中
			List<Emp>emps=dao.findAll();
			//将数据绑定到request的对象上
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
	
	}

}
