<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
<h2>Spring Form</h2>
<form id="member" action="register" method="post">
    <table>
        <tr>
            <td>유저ID</td>
            <td><input id="userId" name="userId" type="text" value=""/></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input id="userName" name="userName" type="text" value="홍길동"/></td>
        </tr>
        <tr>
            <td>E-MAIL</td>
            <td><input id="email" name="email" type="text" value="aaa@ccc.com"/></td>
        </tr>
    </table>
    <button id="register" name="register" type="submit" value="Submit">등록</button>
</form>
</body>
</html>