<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>member.userId</td>
            <td>${member.userId}</td>
        </tr>
        <%--<tr>
            <td>${coin}</td>
            <td>${coin}</td>
        </tr>
        <tr>
            <td>${coin + 100}</td>
            <td>${coin + 100}</td>
        </tr>
        <tr>
            <td>${coin - 100}</td>
            <td>${coin - 100}</td>
        </tr>
        <tr>
            <td>${coin * 100}</td>
            <td>${coin * 100}</td>
        </tr>
        <tr>
            <td>${coin / 100}</td>
            <td>${coin / 100}</td>
        </tr>
        <tr>
            <td>${coin / 100}</td>
            <td>${coin div 100}</td>
        </tr>
        <tr>
            <td>${coin % 100}</td>
            <td>${coin % 100}</td>
        </tr>
        <tr>
            <td>${coin % 100}</td>
            <td>${coin mod 100}</td>
        </tr>--%>
    </table>
</body>
</html>