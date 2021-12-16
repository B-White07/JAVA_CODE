<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
								<input class="form-control" placeholder="Name" name="Name"
									type="text" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password"
									name="password" type="password" value="">
							</div>
							<div class="checkbox">
								<br>
							</div>
							<div class="form-group">
								<input class="form-control btn btn-primary" type="submit"
									value="Sign in" style="width: 50%; margin-left: 25%;">
							</div>

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
