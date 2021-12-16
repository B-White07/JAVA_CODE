package UserServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
/*
 * JSP页面提交servlet请求，将用户名传递过来，调用service业务逻辑层的方法
 * 来判断用户名是否存在
 * 将判断结果返回给JSP页面。进行显示
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserService.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		request.setCharacterEncoding("UTF-8");
		boolean rs;
		PrintWriter out = response.getWriter();

		try {
			String userName = request.getParameter("UserName");
			// 调用服务层方法进行判断
			UserServiceImpl userService = new UserServiceImpl();
			rs = userService.loginUser(userName);
			if (rs) {
				// 判断数据库里的数据与用户输入的信息是否匹配
				// 匹配则跳转到登陆成功界面
				out.print("success");
			} else {
				out.print("用户不存在");
			}
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
