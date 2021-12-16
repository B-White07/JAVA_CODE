<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/12/12
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="java.io.IOException" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println("a.jsp执行了");
    Object user = session.getAttribute("user");
    //  如果等于null，说明没有登陆
    if(user == null){
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return;
    }

%>
a.jsp文件
</body>
</html>
