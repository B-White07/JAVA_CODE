package com.lzw.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //  删除Session中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        String code = req.getParameter("code");
        //  获取用户名
        String username = req.getParameter("username");

        if(code != null && code.equalsIgnoreCase(token)){
            System.out.println("保存到数据库：" + username);
        }else {
            System.out.println("请不要重复提交表单");
        }

        //req.getRequestDispatcher("/ok.jsp").forward(req,resp);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        resp.sendRedirect(req.getContextPath() + "/ok.jsp");
    }
}
