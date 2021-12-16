<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>login</title>
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
				<h1>login</h1>
				<form action="login.do" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">username:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="userName" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">password:</td>
							<td valign="middle" align="left"><input type="password"
								class="inputgri" name="pwd" /></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="登录 &raquo;" /> <input
							type="button" class="button" value="注册"
							onclick="location='logon.jsp'" />
					</p>

				</form>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>

