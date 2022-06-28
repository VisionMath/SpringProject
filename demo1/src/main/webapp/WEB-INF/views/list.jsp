<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<button type="button" onclick="location.href='/list';">목록</button>
	<button type="button" onclick="location.href='/insertForm';">추가</button>
	<hr>
	<table border=1>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.bno }</td>
				<td><a href="/read/${board.bno}">${board.title}</a></td>
				<td>${board.writer}</td>
				<%-- <td><a
					href="/updateForm?bno=${board.bno}&title=${board.title}&writer=${board.writer}&content=${board.content}">수정</a></td> --%>
				<%-- <td><a
					href="/updateForm?board=${board }">수정</a></td> --%>
				<td><a href="/updateForm/${board.bno}">수정</a></td>
				<td><a href="/delete?bno=${board.bno}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<img src="../images/mountain.jpg" style='width: 600px;'>
</body>
</html>