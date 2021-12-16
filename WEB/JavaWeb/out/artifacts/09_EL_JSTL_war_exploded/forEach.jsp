<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.lzw.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/12/1
  Time: 20:03
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
<%--    1.遍历1-10 ，输出
                begin属性设置开始的索引
                end属性设置结束的索引
                var属性表示循环的变量(也是当前正在遍历到的数据)
                for(int i =1;i < 10;i++)
--%>
    <table border="1">
        <c:forEach begin="1" end="10" var="i">
            <tr>
                <td>第${ i }行</td>
            </tr>
        </c:forEach>
    </table>
<hr>
<%--    2.遍历Object数组
            for(Object item : arr)
            items   表示便利的数据源（遍历的集合）
            var     表示当前遍历到的数据
--%>
    <%
        request.setAttribute("arr",new String[]{"123","1234","12345"});
    %>
    <c:forEach items="${ requestScope.arr }" var="item">
        ${ item }
    </c:forEach>
<hr>
    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
//        for (Map.Entry<String,Object> entry : map.entrySet()){
//        }
        request.setAttribute("map",map);
    %>
    <c:forEach items="${requestScope.map}"  var="entry">
        <h1>${entry.key}=${entry.value}</h1>
    </c:forEach>

<%--    4.List集合，list中存放Student类，有属性：编号，用户名，密码，年龄，电话信息--%>
    <%
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student(i,"username"+i,"psd"+i,18+i,"1234"+i));
        }
        request.setAttribute("stus",studentList);
    %>
    <table>
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
<%--
        items表示遍历的集合
        var表示遍历的数据
        begin表示遍历的开始索引值
        end表示结束的索引值
        step表示遍历的步长值
        varStatus表示当前遍历到的数据的状态
--%>
    <c:forEach begin="2" end="6" step="2" varStatus="status" items="${requestScope.stus}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.username}</td>
            <td>${student.password}</td>
            <td>${student.age}</td>
            <td>${student.phone}</td>
            <td>    ${status}    </td>
            <td>        </td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
