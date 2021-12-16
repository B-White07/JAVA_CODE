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

public class DelServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			EmpDao dao=new EmpDao();
			int id=Integer.parseInt(request.getParameter("id"));
			dao.delete(id);
			List<Emp>emps=dao.findAll();
			//将数据绑定到request的对象上
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
	}

}
