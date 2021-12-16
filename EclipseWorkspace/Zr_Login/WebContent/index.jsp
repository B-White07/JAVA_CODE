<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 提交AJAX  -->
<script type="text/javascript">
	var xmlHttp;
	var userName;
	var usernameConnection;
	function loadCheck() {
		usernameContent = document.getElementById("userName");

		if (usernameContent.value.length == 0) {
			document.getElementById("show").innerHTML = "请输入用户名";
		} else {
			userName = usernameContent.value;
			xmlHttp = creatXmlHttpRequest();
			xmlHttp.onreadystatechange = getResult;
			xmlHttp.open("POST", "LoginServlet", true);
			xmlHttp.setRequestHeader("Content-type",
					"application/x-www-form-urlencoded");
			var data = "userName" + userName;
			xmlHttp.send(data);
		}
	}

	function creatXmlHttpRequest() {
		//XMLHTTPrequest
		if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		} else {
			return new ActiveXOBject("Microsoft.XMLHTTP");
		}
	}

	function getResult() {
		show = document.getElementById("show");
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status == 200) {
				var result = xmlHttp.responseText;
				if (result == "success") {
					show.innerHTML = "登陆成功";
				} else {
					show.innerHTML = "登陆失败";
				}
			}
		}
	}
</script>
</head>
<body>




	<!-- 编写HTML 界面样式  -->
	姓名：
	<input type="text" id="userName" name="userName">
	<input type="button" value="登录" name="button" onclick="loadCheck()">
	<div id="show"></div>
</body>
</html>