package com.lzw;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         /* 不能同时用
        response.getWriter();
        response.getOutputStream();
        */
        //System.out.println(response.getCharacterEncoding());    //ISO-8859-1默认

 /*       //  设置服务器字符集为UTF-8
        response.setCharacterEncoding("utf-8");
        //  通过响应头，设置浏览器也是用UTF-8字符集
        response.setHeader("Content-Type","text/html;charset=UTF-8");*/

        //  他会同时设置服务器和客户端都是用utf-8字符集，还设置了响应头
        //  此方法一定要在获取流对象调用之前才有效
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(response.getCharacterEncoding());



        //  要求：往客户端回传   字符串 数据
        PrintWriter writer = response.getWriter();
        writer.write("response's content! 你好");
    }
}
