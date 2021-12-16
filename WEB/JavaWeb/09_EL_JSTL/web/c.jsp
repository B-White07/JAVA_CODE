<%@ page import="com.lzw.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/30
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Person person = new Person();
        person.setName("李增伟");
        person.setPhones(new String[]{"1111","2222","3333"});

        List<String> cities = new ArrayList<String>();
        cities.add("上海");
        cities.add("杭州");
        cities.add("大连");
        person.setCities(cities);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        person.setMap(map);

        pageContext.setAttribute("person",person);
    %>

    输出Person:${ person }<br>
    输出Person的name属性：${person.name}<br>
    输出Person的phones属性值：${person.phones[0]}<br>
    输出Person的cities集合中的元素值：${person.cities}<br>
    输出Person的cities集合中个别的元素值：${person.cities[0]}<br>
    输出Person的map集合中的元素值：${person.map}<br>
    输出Person的map集合中的元素值：${person.map.key1}<br>

</body>
</html>
