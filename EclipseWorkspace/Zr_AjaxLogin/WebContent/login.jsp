<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>健身房信息管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="./bootstrap/css/bootstrap.min.css">

<script type="text/javascript">
	var xmlHttp;
	var userName;
	var password;
	var usernameContent;
	var passwordContent;

	function loadCheck() {
		usernameContent = document.getElementById("userName");
		//passwordContent = document.getElementById("password");

		if (usernameContent.value.length == 0) {
			document.getElementById("show").innerHTML = "请输入用户名或密码！";
		} else {
			userName = usernameContent.value;
			//password = passwordContent.value;

			xmlHttp = createXmlHttpRequest();
			xmlHttp.onreadystatechange = getResult;
			xmlHttp.open("POST", "LoginServlet", true);
			xmlHttp.setRequestHeader("Content-type",
					"application/x-www-form-urlencoded");
			var data = "userName=" + userName;
			//var data2 = "password" + password;
			xmlHttp.send(data);
			//xmlHttp.send(data2);
		}
	}
	function createXmlHttpRequest() {
		if (window.XMLHttpRequest) { //返回值为true时说明是新版本IE或其他浏览器
			return new XMLHttpRequest();
		} else { //返回值为false时说明是老版本IE浏览器（IE5和IE6）
			return new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	function getResult() {
		show = document.getElementById("show");
		//alert(xmlHttp.readyState);
		if (xmlHttp.readyState === 4) {
			if (xmlHttp.status === 200) {
				var result = xmlHttp.responseText;
				if (result == "success") {
					show.innerHTML = "登录成功！";
				} else {
					show.innerHTML = "用户名或密码错误！";
				}
			}

		}
	}
</script>


</head>

<body style="background-image: url('./image/健身房.jpg');">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default"
				style="margin-top: 200px;">
				<div class="panel-heading">健身房信息管理系统</div>
				<div class="panel-body">
					<form role="form" method="post" action="LoginCheck">
						<fieldset>
							<div class="form-group">

								<input class="form-control" placeholder="Name" type="text"
									id="userName" name="userName" style="border: 1px solid black"
									onmouseover="this.style.borderColor='black';this.style.backgroundColor='plum'" 
									onmouseout="this.style.borderColor='black';this.style.backgroundColor='#ffffff'" style="border-width:1px;border-color=black"
									autofocus="">
									
							</div>
							<div class="form-group">

								<input class="form-control" placeholder="Password"
									name="password" type="password" style="border: 1px solid black"
									onmouseover="this.style.borderColor='black';this.style.backgroundColor='plum'" 
									onmouseout="this.style.borderColor='black';this.style.backgroundColor='#ffffff'" style="border-width:1px;border-color=black"
									value="">
							</div>
							<div class="checkbox">
								<!--  
								<label>
									<input name="remember" type="checkbox" value="Remember Me">Remember Me
								</label>
							-->
								<br>
							</div>
							<div class="form-group">
								<input class="form-control btn btn-primary" type="button"
									name="button" value="登录" onclick="loadCheck()"
									style="width: 50%; margin-left: 25%;">
							</div>
							<div id="show" style="width: 50%; margin-left: 28%;"></div>


							<!-- <div>
								<button type="button" class="btn btn-primary"
									style="margin-left:140px;margin-right:70px;"
									onclick="window.location.href='./login.jsp'">Sign up</button>
								<button type="submit" class="btn btn-primary">Sign in</button>
							</div> -->

						</fieldset>
					</form>
				</div>
				<div>
					<a href="Register.jsp"><font color="black">没有账户先注册？</font></a>
				</div>
			</div>

		</div>
	</div>


</body>
</html>
