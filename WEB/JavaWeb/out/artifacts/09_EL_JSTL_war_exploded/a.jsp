<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/29
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key","值");
%>
表达式脚本输出key值是：<%=request.getAttribute("key1")%><br>
EL表达式输出key的值是：${key1}
</body>
</html>
