package com.lzw.web;

import com.google.gson.Gson;
import com.lzw.pojo.User;
import com.lzw.service.UserService;
import com.lzw.service.impl.UserServiceImpl;
import com.lzw.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

    protected void ajaxExistsUsername(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取请求参数username
        String username = req.getParameter("username");
        //  调用userService.existsUsername();
        boolean existsUsername = userService.existsUsername(username);
        //  把返回的结果封装成map对象
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("existsUsername",existsUsername);

        Gson gson = new Gson();
        String json = gson.toJson(resultMap);

        resp.getWriter().write(json);
    }
    /**
     * 注销
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1.销毁Session中用户登录的信息（或者销毁Session）
        req.getSession().invalidate();
        //  2.重定向到首页（或登陆页面）
        resp.sendRedirect(req.getContextPath());
    }
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1.获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = WebUtils.copyParamToBean(req.getParameterMap(),new User());
        //  2.调用userService.login()处理登陆业务
        User loginUser = userService.login(user);

        //  null说明登陆失败
        if(loginUser == null){
            //  把错误信息，和回显的表单项信息，保存到Request域中
            req.setAttribute("msg","用户名或密码错误!");
            req.setAttribute("username",username);
            //  登陆失败，返回登陆页面
            System.out.println("用户名或密码错误");
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req,resp);
        }else {
            // 登陆成功
            //  保存用户登陆之后的信息到session域中
            req.getSession().setAttribute("user",loginUser);
            //  登陆成功，跳转到login_success.html
            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req,resp);
        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  获取Session中的验证码
        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //  删除Session中的验证码
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);

        //  1.获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //  封装对象
        User user = WebUtils.copyParamToBean(req.getParameterMap(),new User());

        //  2.检查验证码是否正确
        if(token != null && token.equalsIgnoreCase(code)){
            //  正确
            //  3.检查用户名是否可用
            if(userService.existsUsername(username)){
                //              不可用
                System.out.println("用户名]" + username +"]已存在");
                //  回显信息，保存到Requsest域中
                req.setAttribute("msg","用户名已存在！");
                req.setAttribute("username",username);
                req.setAttribute("email",email);
                //              跳回注册页面
                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
            }else {

                //              可用
                //                      调用Service保存到数据库
                userService.registUser(user);
                //              跳到注册成功页面    regist_sucess.html
                req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req,resp);
            }
        }else{
            //  回显信息，保存到Requsest域中
            req.setAttribute("msg","验证码错误！");
            req.setAttribute("username",username);
            req.setAttribute("email",email);
            //      不正确
            //              跳回注册页面
            System.out.println("验证码[" + code + "]错误");
            req.getRequestDispatcher("/pages/user/regist.jsp").forward(req,resp);
        }
    }



}
