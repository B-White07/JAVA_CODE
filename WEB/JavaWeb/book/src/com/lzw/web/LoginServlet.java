package com.lzw.web;

import com.lzw.pojo.User;
import com.lzw.service.UserService;
import com.lzw.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //  2.调用userService.login()处理登陆业务
        User loginUser = userService.login(new User(null, username, password, null));

        //  null说明登陆失败
        if(loginUser == null){
            //  把错误信息，和回显的表单项信息，保存到Request域中
            req.setAttribute("msg","用户名或密码错误!");
            req.setAttribute("username",username);
            //  登陆失败，返回登陆页面
            System.out.println("用户名或密码错误");
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }else {
            //  登陆成功，跳转到login_success.html
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);
        }
    }
}
