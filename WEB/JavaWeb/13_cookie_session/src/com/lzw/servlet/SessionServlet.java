package com.lzw.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet{

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.getWriter().write("Session已经设置超时（无效）");
    }

    protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setMaxInactiveInterval(3);

        resp.getWriter().write("当前session已经设置三秒后超时");
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取了session的默认时长
        int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().write("Session的默认时长为：" + maxInactiveInterval+ "秒");
    }
    /**
     * 在session域中保存数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("key1","value1");
        resp.getWriter().write("已经往session域中保存数据");
    }

    /**
     * 获取session域中的数据
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attribute = req.getSession().getAttribute("key1");
        resp.getWriter().write("从session中获取的key1的数据是：" + attribute);
    }

    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取和创建Session会话对象
        HttpSession session = req.getSession();
        //  判断当前Session会话是否是新创建出来的
        boolean isNew = session.isNew();
        //  获取session会话的唯一标识
        String id = session.getId();

        resp.getWriter().write("得到的session，他的id是：" + id + "<br/>");
        resp.getWriter().write("这个session是否是新创建的：" + isNew + "<br/>");

    }
}
