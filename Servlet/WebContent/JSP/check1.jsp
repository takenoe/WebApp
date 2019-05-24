<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Question</title>
</head>
<body>
	<h1>アンケート入力</h1>
	<hr>
	データを入力後、「送信」をクリックしてください。
	<form method="post" action="<%=request.getContextPath() %>/ControlServlet2?actionParam=questionnaire">
		氏名　:<input type="text" name="userName"><br><br>
		コース　:<select name="cos">
				<option value="HTML">HTML</option>
				<option value="SQL基礎">SQL基礎</option>
				<option value="Java基礎">Java基礎</option>
			</select>
			<br><br>
		理解度　<input type="radio" name="lv" value="3">よく理解できた
			<input type="radio" name="lv" value="2">理解できた
			<input type="radio" name="lv" value="1">理解できなかった
			<br>
			<input type="submit" value="送信">
			<input type="reset" value="取消">
	</form>
</body>
</html>