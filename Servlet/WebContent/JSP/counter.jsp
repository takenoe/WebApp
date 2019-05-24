<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Counter</title>
</head>
<body>
	<h1>表示回数</h1>
	<hr>
	<%	Integer i = 0;
		if(session.isNew()){
			i = 0;
		}else if(session.getAttribute("sessionCounter") == null){
			i = 0;
		}else{
			i = (Integer)session.getAttribute("sessionCounter");
		}
		i++;
		session.setAttribute("sessionCounter", i);

	%>
	<h5>貴方がこのページを訪れた回数は、<%=i %>回です</h5>
	<a href="http://localhost:8080/Servlet/JSP/counter.jsp">カウントアップ</a>
</body>
</html>