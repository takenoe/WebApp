<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>計算結果</title>
</head>
<body>
	<%
	double height = Double.parseDouble(request.getParameter("height"));
	double bestWg = (height * height) * 20;
%>
	<h1>計算結果表示</h1>
	<hr>
	あなたの理想体重は<%= bestWg %>キロです

	<%
		session.setAttribute("wight", bestWg);
	%>
	<br>
	<jsp:forward page="forward.jsp"/>
	<br>
	<jsp:include page="date.jsp"/>

</body>
</html>