<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <c:set var="memberId">${member.userId}</c:set>

    <table border="1">
        <tr>
            <td>member.userId</td>
            <td>${memberId}</td>
        </tr>
    </table>
</body>
</html>
