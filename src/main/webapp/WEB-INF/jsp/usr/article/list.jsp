<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE LIST</title>
</head>
<body>
	<h1>LIST</h1>
	<hr />
	<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">
		<thead>
			<tr>
				<th style="text-align: center;">ID</th>
				<th style="text-align: center;">Registration Date</th>
				<th style="text-align: center;">Title</th>
				<th style="text-align: center;">Member Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="article" items="${articles}">
				<tr>
					<td style="text-align: center;">${article.id}</td>
					<td style="text-align: center;">${article.regDate.substring(0,10)}</td>
					<td style="text-align: center;">
						<a href="detail?id=${article.id}">${article.title}</a>
					</td>
					<td style="text-align: center;">${article.memberName}</td>
					<td>
						<a class="login" href="modify?id=${article.id}">수정</a>
					</td>
					<td>
						<a class="login" href="delete?id=${article.id}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>