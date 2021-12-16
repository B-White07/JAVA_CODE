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

public class AddServlet extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//��ȡǰ�����Ա��ҳ�洫�ݹ����ı���Ϣ
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
			//Ա����Ϣ�Ѿ��ɹ���ӵ����ݿ���
			List<Emp>emps=dao.findAll();
			//�����ݰ󶨵�request�Ķ�����
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
	
	}

}
