<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<link rel="stylesheet" href="src/css/css.css">
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE MODIFY</title>
</head>
<body>
	<h1>MODIFY</h1>
	<hr />
	<table border="1" cellspacing="0" cellpadding="5" style="width: 100%; border-collapse: collapse;">
		<thead>
			<tr>
				<th style="text-align: center;">ID</th>
				<th style="text-align: center;">Registration Date</th>
				<th style="text-align: center;">UpdateDate</th>
				<th style="text-align: center;">Title</th>
				<th style="text-align: center;">body</th>
				<th style="text-align: center;">Member Name</th>
			</tr>
		</thead>
		<form method="POST" action="modify">
		<tbody>
			<tr>
				<td>
					<input type="hidden" name="id" value="${article.id}" />
				</td>
				<td style="text-align: center;">${article.regDate.substring(0,10)}</td>
				<td>
					<input type="hidden" name="updateDate" value="NOW()" />
				</td>
				<td style="text-align: center;">
					<input type="text" name="title" value="${article.title}" />
				</td>
				<td style="text-align: center;">
					<input type="text" name="body" value="${article.body}" />
				</td>
				<td style="text-align: center;">${article.memberId}</td>
			</tr>
		</tbody>
		<button onclick="hB()" type="submit">저장</button>
		<button type="button"><a  href="list">나가기</a></button>
		</form>
	</table>
</body>
</html>

	<script>
		function hB() {
			location.replace("../article/list");
		}
	</script>