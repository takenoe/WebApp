<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表示</title>
</head>
<body>
	<h1>登録情報</h1>
	<hr>
	<jsp:useBean id="samplebean1" scope="session" class="S3.SampleBean1"/>
	Beanから下記の値を取得
	<br>
	<table border="1" cellpadding="10">
 		<tr>
 			<th>ユーザー名</th>
 			<td><jsp:getProperty name="samplebean1" property="userName"/></td>

 		</tr>
 		<tr>
 			<th>ユーザーパスワード</th>
 			<td><jsp:getProperty name="samplebean1" property="userPass"/></td>

 		</tr>
 	</table>
</body>
</html>