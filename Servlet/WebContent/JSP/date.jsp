<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
	private String dateFormat(Calendar date){
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1;
		int day =date.get(Calendar.DATE);
		return(year + "/" + month + "/" + day);
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Date JSP</title>
</head>
<body>
	<h1>���t�\��</h1>
	<hr>
	<%
		Calendar today = Calendar.getInstance();
	%>
	�{���̓��t:<%= dateFormat(today) %>
	<br><br>
	<%
		//30����̓��t���v�Z
		today.add(Calendar.DATE,30);
	%>
	30����̓��t:<%= dateFormat(today) %>
	<hr>
</body>
</html>