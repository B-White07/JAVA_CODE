<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.text.*,entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" charset="utf-8">
	<title>修改用户信息界面</title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	
	</head>
	<body>
		
		
		
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								系统时间:<%
									SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
									out.println(sdf.format(new Date()));
									%>
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						修改用户信息:
					</h1>
					<%  
						User u = (User)request.getAttribute("users");
						%>
					<form action="update.do?id=<%=u.getId()%>" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
						
							<tr>
								<td valign="middle" align="right">
									用户名
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" value="<%=u.getUsername()%>"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="pwd" value="<%=u.getPwd()%>"/>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									邮箱
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="email" value="<%=u.getEmail()%>"/>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="提交" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>