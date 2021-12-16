<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/30
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("key1","pageContext1");
        pageContext.setAttribute("key2","pageContext2");
        request.setAttribute("key1","request");
        session.setAttribute("key1","session");
        application.setAttribute("key1","application");
    %>
    ${ requestScope }
</body>
</html>
