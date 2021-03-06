package com.lzw.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter2前置代码");
        System.out.println("Filter2线程：" + Thread.currentThread().getName());
        System.out.println("Filter1 " + servletRequest.getParameter("username"));
        System.out.println("Filter2取Filter1中保存的数据是：" + servletRequest.getAttribute("key1"));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter2后置代码");
    }

    @Override
    public void destroy() {

    }
}
