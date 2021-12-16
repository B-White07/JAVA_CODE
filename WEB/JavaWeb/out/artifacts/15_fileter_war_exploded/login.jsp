<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/12/12
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    登陆页面<br>
    <form action="http://localhost:8080/15_fileter/loginServlet" method="get">
        username: <input type="text" name="username" /><br>
        password: <input type="password" name="password" /><br>
        <input type="submit" value="submit" />
    </form>
</body>
</html>
