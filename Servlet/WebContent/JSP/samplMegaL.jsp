<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表示</title>
</head>
<body>
	<h1>登録情報表示</h1>
	<hr>
	氏　　　名: <%=request.getParameter("userName") %>
	<br><br>
	郵便番号: <%=request.getParameter("postCode") %>
	<br><br>
	都道府県:<%=request.getParameter("city") %>
	<br><br>
	住　　　所:<%=request.getParameter("address") %>
	<br><br>
	電話番号:<%=request.getParameter("phone") %>
	<br><br>
	メールアドレス:<%=request.getParameter("email") %>
	<br><br>
</body>
</html>