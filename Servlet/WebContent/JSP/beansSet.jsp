<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取得した</title>
</head>
<body>
	<h1>登録情報</h1>
	<hr>
	<%
		request.setCharacterEncoding("Windows-31J");
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
 	%>
 	<jsp:useBean id="samplebean1" scope="session" class="S3.SampleBean1"/>

 	<jsp:setProperty name="samplebean1" property="userName" value="<%= userName %>"/>
 	<jsp:setProperty name="samplebean1" property="userPass" value="<%= userPass %>"/>

 	Beanに下記の値を格納しました。<br>
 	<table border="1" cellpadding="10">
 		<tr>
 			<th>ユーザー名</th>
 			<td><%= userName%></td>

 		</tr>
 		<tr>
 			<th>ユーザーパスワード</th>
 			<td><%= userPass%></td>
 		</tr>
 	</table>
 	<br>
 	<%=session.getAttribute("message") %>
</body>
</html>