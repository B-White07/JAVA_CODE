<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/26
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>scope.jsp</h1>
    <%
        //  往四个域中都分别保存了数据
        pageContext.setAttribute("key","pageContext");
        request.setAttribute("key","request");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
    %>
    pageContext域是否有值<%=pageContext.getAttribute("key")%><br>
    request域是否有值<%=request.getAttribute("key")%><br>
    session域是否有值<%=session.getAttribute("key")%><br>
    application域是否有值<%=application.getAttribute("key")%><br>
<%--    <%--%>
<%--        request.getRequestDispatcher("/scope2.jsp").forward(request,response);--%>
<%--    %>--%>
<%--
        <jsp:forward page="scope2.jsp"></jsp:forward>       请求转发标签，功能就是请求转发
        page属性设置请求转发的路径
--%>
    <jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
