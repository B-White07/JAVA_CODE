package com.lzw.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  获取ServletContext对象
        ServletContext context = getServletContext();
        System.out.println(context);
        System.out.println("保存之前：context1中获取与数据key1的值是：" + context.getAttribute("key1"));

        context.setAttribute("key1","value");

        System.out.println("context1中获取与数据key1的值是：" + context.getAttribute("key1"));
        System.out.println("context1中获取与数据key1的值是：" + context.getAttribute("key1"));
        System.out.println("context1中获取与数据key1的值是：" + context.getAttribute("key1"));
    }
}
