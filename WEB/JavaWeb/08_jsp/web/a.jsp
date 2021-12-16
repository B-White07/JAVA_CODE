<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/26
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--1.声明类属性--%>
    <%!
        private Integer id;
        private String name;
        private static Map<String,Object> map;
    %>

<%--2.声明static静态代码块--%>
    <%!
        static {
            map = new HashMap<String, Object>();
            map.put("key1","value1");
            map.put("key2","value2");
            map.put("key3","value3");
        }
    %>

<%--3.声明类方法--%>
    <%!
        public int abc(){
            return 12;
        }
    %>

<%--4.声明内部类--%>
    <%!
        public static class A{
            private Integer id = 12;
            private String abc = "abc";
        }
    %>

<%--
1.输出整型
2.输出浮点型
3.输出字符串
4.输出对象
--%>
    <%=12 %><br>
    <%=12.23%><br>
    <%="String"%><br>
    <%=map%><br>
    <%=request.getParameter("username")%>

<%--代码脚本--%>
<%--1.if--%>
    <%
        int i = 12;
        if(i == 12){
            System.out.println("Lzw");
        }else {
            System.out.println("Lzw123");
        }
    %>
<%--2.for--%>
    <%
        for(int j = 0;j < 5;j++){
            System.out.println(j);
        }
    %>
<%--3.翻译后Java文件中_jspService方法内的代码都可以写--%>
    <%
        String username = request.getParameter("username");
        System.out.println("用户名的请求参数是：" + username);
    %>
</body>
</html>
