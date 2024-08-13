<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE DETAIL</title>
</head>
<body>
	<h1>DETAIL</h1>
	<hr />
	<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">
		<thead>
			<tr>
				<th style="text-align: center;">ID</th>
				<th style="text-align: center;">Registration Date</th>
				<th style="text-align: center;">UpdateDate</th>
				<th style="text-align: center;">Title</th>
				<th style="text-align: center;">body</th>
				<th style="text-align: center;">Member ID</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td style="text-align: center;">${article.id}</td>
				<td style="text-align: center;">${article.regDate.substring(0,10)}</td>
				<td style="text-align: center;">${article.updateDate.substring(0,10)}</td>
				<td style="text-align: center;">${article.title}</td>
				<td style="text-align: center;">${article.body}</td>
				<td style="text-align: center;">${article.memberId}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>