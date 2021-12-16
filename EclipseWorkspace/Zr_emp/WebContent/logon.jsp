<%@ page language="java" import="java.util.*,entity.*"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>add Emp</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<script type="text/javascript">
	function refreshCode() {

		var vcode_img = document.getElementById("vcode_img");
		vcode_img.onclick = function() {

			var time = new Date().getTime();
			vcode_img.src = "${pageContext.request.contextPath}/VerificationCodeServlet?time="
					+ time;
		}
	}
</script>


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
						<a href="#">Main</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>add Emp info:</h1>
				<form action="add" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">用户名:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="name" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">工资:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="salary" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">年龄:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="age" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">密码:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="pwd" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">性别:</td>
							<td valign="middle" align="left">男:<input type="radio"
								name="gendar" value="M" checked="checked"> 女:<input
								type="radio" name="gendar" vlalue="F">
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">验证码:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="pwd" /> <a
								href="javascript:refreshCode();"><img
									src="${pageContext.request.contextPath}/VerificationCodeServlet"
									title="看不清点击刷新" id="vcode_img" /></a></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="提交" />
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
