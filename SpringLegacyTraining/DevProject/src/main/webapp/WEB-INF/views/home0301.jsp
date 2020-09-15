<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>{empty.member}</td>
            <td>${empty member}</td>
        </tr>
        <tr>
            <td>{empty member.userId}</td>
            <td>${empty member.userId}</td>
        </tr>
    </table>
</body>
</html>
