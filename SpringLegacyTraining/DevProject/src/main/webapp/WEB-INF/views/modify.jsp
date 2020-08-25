<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>BOARD</title>
</head>
<body>
	<h3>MODIFY</h3>

	<form method="post" action="/board/post">
		<button type="submit" name="modify">Modify</button>
	</form>

	<a href="/board/get?list">LIST</a>
</body>
</html>