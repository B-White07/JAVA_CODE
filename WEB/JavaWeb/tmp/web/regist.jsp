<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/12/7
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="registServlet">
        用户名：<input type="text" name="username"> <br>
        验证码：<input type="text" style="width: 50px" name="code">
        <img src="http://localhost:8080/tmp/kaptcha.jpg" alt="" style="width: 100px;height: 28px"><br>
        <input type="submit" value="登陆"> <br>
    </form>
  </body>
</html>
