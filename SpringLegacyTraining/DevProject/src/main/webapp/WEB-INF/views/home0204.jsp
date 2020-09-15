<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <c:set target="${member}" property="userId" value="hongkd"/>

    <table border="1">
        <tr>
            <td>member.userId</td>
            <td>${member.userId}</td>
        </tr>
    </table>
</body>
</html>
