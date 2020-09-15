<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Member Info.</h1>

<p> member.userId : <c:out value="${member.userId}" /></p>
<p> member.password : ${member.password}. </p>
<p> member.userName : ${member.userName}. </p>
<p> member.email : ${member.email}. </p>
<p> member.dateOfBirth : ${member.dateOfBirth}. </p>
</body>
</html>
