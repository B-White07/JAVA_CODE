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
			//ʵ�ֵ�¼����
			//������������ݹ�������Ϣ
		System.out.println(111);
		EmpDao dao=new EmpDao();
		String user=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();//��ȡ�ӷ�������������������
		Emp emp=dao.findByUserName(user, pwd);
		
		if(emp!=null){
			//��ת����ҳ��
			//����ת����ת
			//����ת֮ǰȥ���ݿ�������˵���Ϣ��ѯ���� ����װ Ȼ������ת
			List<Emp>emps=dao.findAll();
			//�����ݰ󶨵�request�Ķ�����
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request, response);
			
		}else{
			//����ͣ���ڵ�¼ҳ�� ����ʾ�û�  ��������û������������
		}
		
		
	}
}