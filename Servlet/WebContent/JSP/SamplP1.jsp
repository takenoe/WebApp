<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>セッション</title>
</head>
<body>
	<h1>セッションを呼び出した</h1>

	理想体重は<%=session.getAttribute("wight") %>です。
</body>
</html>