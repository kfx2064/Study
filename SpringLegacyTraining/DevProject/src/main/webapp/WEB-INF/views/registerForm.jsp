<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Register Form</h1>

<form action="/register" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    <input type="submit" value="register">
</form>
</body>
</html>

