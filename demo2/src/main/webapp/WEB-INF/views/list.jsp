<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="jangsan">
		<button type="button" onclick="location.href='/list';" class="custom-btn btn-11">목록</button>
		<button type="button" onclick="location.href='/insertForm';" class="custom-btn btn-11">추가</button>

		<hr>
		<table class="table-fill">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>내용</th>
					<th>작성자</th>
					<th colspan="2"></th>
				</tr>
			</thead>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>${board.bno }</td>
					<td><a href="/read/${board.bno}">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.content}</td>

					<td><a href="/updateForm/${board.bno}">수정</a></td>
					<td><a href="/delete?bno=${board.bno}">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- <img src="../images/mountain.jpg" style='width: 600px;'> -->
</body>
</html>