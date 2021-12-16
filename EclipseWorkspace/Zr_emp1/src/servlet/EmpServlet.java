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


public class EmpServlet  extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//瀹炵幇鐧诲綍鍔熻兘
			//鎺ユ敹娴忚鍣ㄤ紶閫掕繃鏉ョ殑淇℃伅
		System.out.println(111);
		EmpDao dao=new EmpDao();
		String user=request.getParameter("userName");
		String pwd=request.getParameter("pwd");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();//鑾峰彇浠庢湇鍔″櫒鍒版祻瑙堝櫒鐨勮緭鍑烘祦
		Emp emp=dao.findByUserName(user,pwd);
		
		if(emp!=null){
			//璺宠浆鍒颁富椤甸潰
			//鍒╃敤杞彂璺宠浆
			//鍦ㄨ烦杞箣鍓嶅幓鏁版嵁搴撴妸鎵�鏈変汉鐨勪俊鎭煡璇㈠嚭鏉� 骞跺皝瑁� 鐒跺悗鍐嶈烦杞�
			List<Emp>emps=dao.findAll();
			//灏嗘暟鎹粦瀹氬埌request
			request.setAttribute("emps", emps);
			request.getRequestDispatcher("list.jsp").forward(request,response);
		}else{
			System.out.println("登陆失败");
			//缁х画鍋滅暀鍦ㄧ櫥褰曢〉闈� 骞舵彁绀虹敤鎴� 浠栬緭鍏ョ殑鐢ㄦ埛鍚嶆垨瀵嗙爜閿欒
		}
	}
}

