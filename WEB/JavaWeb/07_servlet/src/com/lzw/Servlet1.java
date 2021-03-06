package com.lzw;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  获取请求的参数（办事的材料）查看
        String username = request.getParameter("username");
        System.out.println("在servle1（柜台1）中查看参数（材料）：" + username);

        //  给材料盖章，并传递到servlet2（柜台2）
        request.setAttribute("key1","柜台1的章");

        //  问路：Servlet2（柜台2）怎么走
        /*
        请求转发必须要以斜杠打头，/  表示地址为：http://ip:port/工程名/   ,映射到IDEA代码的web目录
         */
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");
        //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/form.html");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("www.baidu.com");

        //  走向servlet2（柜台2）
        requestDispatcher.forward(request,response);
    }
}
