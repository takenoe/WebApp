<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>結果</title>
</head>
<body>
	ユーザー名：<%=request.getParameter("userId") %>
	<br>
	パスワード：<%=request.getParameter("userPass") %>
	<br>
	<%=session.getAttribute("message") %>件のデータが登録された。
</body>
</html>