<%@ page language="java" import="java.util.*,entity.*"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>emplist</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p>
						<span id="cg"></span>
						<script>
							setInterval(
									"cg.innerHTML=new Date().toLocaleString()",
									1000);
						</script>
					 <br />
					</p>
				</div>
				<div id="topheader">
					<h1 id="title">
						<a href="#">main</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>Welcome!</h1>
				<table class="table">
					<tr class="table_header">
						<td>ID</td>
						<td>Name</td>
						<td>Salary</td>
						<td>Age</td>
						<td>Operation</td>
					</tr>
					<%
						//去request中绑定好的数据取出
					List<Emp> emps = (List<Emp>) request.getAttribute("emps");
					//将取出的数据全部显示再 主页

					for (Emp emp : emps) {
					%>

					<tr class="row1">
						<td>
							<%
								out.println(emp.getId());
							%>
						</td>
						<td><%=emp.getUserName()%></td>
						<td><%=emp.getSalary()%></td>
						<td><%=emp.getAge()%></td>
						<td><a href="del?id=<%=emp.getId()%>">删除</a>&nbsp;<a
							href="toUpdate?id=<%=emp.getId()%>">修改</a></td>
					</tr>
					<%
						}
					%>
				</table>
				<p>
					<input type="button" class="button" value="添加员工信息"
						onclick="location='add.jsp'" />
				</p>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>
