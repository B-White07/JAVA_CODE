<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <table>

        <c:forEach items="${test}" var="p">
            <tr>
                <td>${p.id }</td>
                <td>${p.email }</td>
                <td>${p.username }</td>
                <td>${p.phoneNum }</td>
                <td>${p.status }</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
