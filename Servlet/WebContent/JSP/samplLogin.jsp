<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
	<h1>ログイン情報確認</h1>
	<hr>

	ユーザー名:<%= request.getParameter("userName") %>
	<br><br>
	パスワード:<%= request.getParameter("userPass") %>
</body>
</html>