<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>BOARD</title>
</head>
<body>
	<h3>READ</h3>

	<form method="get" action="/board/get">
		<button type="submit" name="modify">Modify</button>
		<button type="submit" name="remove">Remove</button>
	</form>

	<a href="/board/get?list">LIST</a>
</body>
</html>