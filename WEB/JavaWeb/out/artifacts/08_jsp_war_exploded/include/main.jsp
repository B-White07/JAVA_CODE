<%--
  Created by IntelliJ IDEA.
  User: B_White
  Date: 2020/11/26
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    头部信息<br>
    主题信息<br>
<%--
        <%@include file=""%>        就是静态包含
        <%@include file="/include/footer.jsp"%>
        file    属性指定你要包含的jsp页面的路径
        地址中第一个斜杠 / 表示为http://ip:port/工程路径/      映射到代码的web目录

        静态包含的特点：
            1.静态包含不会翻译被包含的jsp页面
            2.静态包含其实是把被包含的jsp页面的代码拷贝到被包含的位置执行输出
--%>

<%--
     <jsp:include page=""></jsp:include>   这是动态包含
     page属性是指定你要包含的jsp页面的路径
     动态包含也可以像静态包含一样，把被包含的内容执行输出到包含位置

    动态包含的特点：
            1.动态包含会把被包含的jsp页面也翻译成Java代码
            2.动态包含底层代码使用如下：使用此代码去调用jsp页面执行输出。
                    JspRuntimeLibrary.include(req,resp,"/include/footer.jsp",out,false);
            3.动态包含能传递参数
--%>
    <jsp:include page="footer.jsp">
        <jsp:param name="username" value="admin"/>
        <jsp:param name="password" value="admin1"/>
    </jsp:include>

</body>
</html>
