<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/30
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        // 1.值为null的时候为空
        request.setAttribute("emptyNull",null);
        // 1.值为空串的时候为空
        request.setAttribute("emptyStr","");
        // 1.值为Object类型数组，长度为零的时候为空
        request.setAttribute("emptyArr",new String[]{});
        // 1.List集合，元素个数为零的时候为空
        List<String> list = new ArrayList<String>();
        //list.add("sd");
        request.setAttribute("emptyList",list);
        // 1.Map集合，元素个数为零的时候为空
        Map<String,Object> map = new HashMap<String, Object>();
        //map.put("key1","value1");
        request.setAttribute("emptyMap",map);
    %>
    ${ empty emptyNull } <br>
    ${ empty emptyStr } <br>
    ${ empty emptyArr } <br>
    ${ empty emptyList } <br>
    ${ empty emptyMap } <br>

    <hr>
    ${ 1 == 2 ? true : false}
</body>
</html>
