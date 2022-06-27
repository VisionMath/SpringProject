<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${msg }</h2>
	<form action="/update" method="post">
		bno:<input type="text" name="bno" id="bno" value="${bno}"/><br>
		title:<input type="text" name="title" id="title" size="20" value="${board.title }"/><br>	
		writer:<input type="text" name="writer" id="writer" size="20" /><br>	
		content:<input type="text" name="content" id="content" size="20" /><br>
		<input type="submit" value="update"/>	
		<input type="reset" value="reset"/>	
	</form>
</body>
</html>