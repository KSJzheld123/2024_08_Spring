<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE Delete</title>
</head>
<body>
	<h1>게시글 삭제됨</h1>
	<button onclick="hB()">뒤로가기</button>
</body>
</html>
	<script>
		function hB() {
			location.replace("../article/list");
		}
	</script>