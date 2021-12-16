<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/12/3
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()      //协议
            + "://"
            + request.getServerName()               //地址
            + ":"
            + request.getServerPort()                  //端口号
            + request.getContextPath()                //工程路径
            + "/";
    pageContext.setAttribute("basePath",basePath);
%>

<base href="<%=basePath%>">
<!--	写base标签，永远固定相对路径跳转的结果-->

<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
