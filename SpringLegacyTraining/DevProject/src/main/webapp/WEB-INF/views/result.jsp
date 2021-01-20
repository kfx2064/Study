<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>Result</h3>
<table border="1">
    <tr>
        <td>유저ID</td>
        <td>${member.userId}</td>
    </tr>
    <tr>
        <td>이름</td>
        <td>${member.userName}</td>
    </tr>
    <tr>
        <td>E-MAIL</td>
        <td>${member.email}</td>
    </tr>
</table>
</body>
</html>
