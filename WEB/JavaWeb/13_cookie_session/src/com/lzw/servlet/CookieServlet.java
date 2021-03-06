package com.lzw.servlet;

import com.lzw.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{

    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1","path1");
        //  getContextPath()  ===>   得到工程路径
        cookie.setPath(req.getContextPath() + "/abc");  //      ===>>> 得到工程路径/abc
        resp.addCookie(cookie);
        resp.getWriter().write("创建了一个带有工程路径的Cookie");
    }
    protected void life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("life3600","life3600");
        cookie.setMaxAge(60*60);   // 设置存活时间
        resp.addCookie(cookie);
        resp.getWriter().write("已经创建了一个存活一小时的Cookie");
    }
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  先找到你要删除的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key1", req.getCookies());
        if(cookie != null){
            //  调用setMaxAge( 0 )
            cookie.setMaxAge(0);   // 0表示马上删除，不需要等待浏览器关闭
            //  调用response.addCookie( cookie )；
            resp.addCookie(cookie);

            resp.getWriter().write("key1的Cookie已经被删除");
        }

    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife","defaultLife");
        cookie.setMaxAge(-1);   // 设置存活时间
        resp.addCookie(cookie);
    }


        protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        方案一：
//        1.先创建一个要修改的同名的Cookie对象
//        2.在构造器，同时赋予新的Cookie值
//        Cookie cookie = new Cookie("key1","newValue1");
//        3.调用response.addCookie(Cookie); 通知客户端保存修改
//        resp.addCookie(cookie);

//        方案二：
//        1.先查找到需要修改的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key2", req.getCookies());
        if(cookie != null){
            //        2.调用setValue()方法赋予新的Cookie值
            cookie.setValue("newValue2");
            //        3.调用response.addCookie()通知客户端保存修改
            resp.addCookie(cookie);
        }

        resp.getWriter().write("key1的Cookie已经修改好");
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            //  getName()方法返回Cookie的key（名）
            //  getValue()方法返回Cookie的value（值）
            resp.getWriter().write("Cookie[" + cookie.getName() + "=" + cookie.getValue() + "]<br/>");

        }

        Cookie iWantCookie = CookieUtils.findCookie("key1",cookies);

//        for (Cookie cookie : cookies) {
//            if("key1".equals(cookie.getName())){
//                iWantCookie = cookie;
//                break;
//            }
//        }
        //  如果不等于null，说明赋值过，也就是找到了需要的cookie
        if(iWantCookie != null){
            resp.getWriter().write("找到了需要的Cooklie");
        }
    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1创建Cookie对象
        Cookie cookie = new Cookie("key1","value1");
        //  2通知客户端保存Cookie
        resp.addCookie(cookie);
        //  1创建Cookie对象
        Cookie cookie2 = new Cookie("key2","value2");
        //  2通知客户端保存Cookie
        resp.addCookie(cookie);
        //  1创建Cookie对象
        Cookie cookie3 = new Cookie("key3","value3");
        //  2通知客户端保存Cookie
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);

        resp.getWriter().write("创建cookie成功！");
    }
}
