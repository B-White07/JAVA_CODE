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

public class UpdateServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int id=Integer.parseInt(request.getParameter("id"));
			String userName = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			double sal = Double.parseDouble(request.getParameter("salary"));
			//调用 EmpDao中的方法  修改数据库中的数据
			Emp emp=new Emp();
			emp.setUserName(userName);
			emp.setAge(age);
			emp.setSalary(sal);
			emp.setId(id);
			EmpDao dao=new EmpDao();
			dao.update(emp);
			List<Emp>emps=dao.findAll();
			//将数据绑定到request的对象上
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);

	}

}
