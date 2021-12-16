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
		//��ȡlist.jspҳ�洫�ݹ�����Ҫ�޸�Ա����id��Ϣ
		int id=Integer.parseInt(request.getParameter("id"));
		EmpDao dao=new EmpDao();
		//���ݴ��ݹ�����id��Ϣ �����ݿ�ȥ��ѯ���id��Ӧ��Ա����Ϣ
		Emp emp=dao.findById(id);
		//����ѯ������Ϣ�� �����ݸ�update.jspҳ�� 
		request.setAttribute("emp",emp);
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}

}
