<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr><td>번호</td><td>${board.bno }</td></tr>
		
	<tr><td>제목</td><td>${board.title}</td></tr>
	<tr><td>작성자</td><td>${board.writer }</td></tr>
	<tr>	<td>내용</td><td>${board.content }</td></tr>
	<tr>	<td colspan="2"><a href="/list">목록보기</a></td></tr>
	
</table>
</body>
</html>