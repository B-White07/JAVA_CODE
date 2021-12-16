<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/30
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key.1","value1");
        map.put("key+2","value2");
        map.put("key-3","value3");

        request.setAttribute("map",map);
    %>

    ${ map["key.1"] }<br>
    ${ map["key+2"] }<br>
    ${ map['key-3'] }<br>

</body>
</html>
