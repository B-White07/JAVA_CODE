<%@ page import="java.util.List" %>
<%@ page import="com.lzw.pojo.Student" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/27
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border: 1px sandybrown solid;
            width: 600px;
            border-collapse: collapse;
        }
        td,th{
            border: 1px sandybrown solid;
        }
    </style>
</head>
<body>
    <%--jsp输出一个表格，里面有10个学生信息--%>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("stuList");
    %>
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>电话</td>
            <td>操作</td>
        </tr>
        <% for (Student student : studentList) { %>
        <tr>
            <td><%=student.getId()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getAge()%></td>
            <td><%=student.getPhone()%></td>
            <td>删除/修改</td>
        </tr>
        <%  }%>
    </table>

</body>
</html>
