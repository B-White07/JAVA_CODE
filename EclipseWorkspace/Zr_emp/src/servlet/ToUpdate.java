package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmpDao;
import entity.Emp;

public class ToUpdate extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取list.jsp页面传递过来的要修改员工的id信息
		int id=Integer.parseInt(request.getParameter("id"));
		EmpDao dao=new EmpDao();
		//根据传递过来的id信息 到数据库去查询这个id对应的员工信息
		Emp emp=dao.findById(id);
		//将查询出的信息绑定 并传递给update.jsp页面 
		request.setAttribute("emp",emp);
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}

}
