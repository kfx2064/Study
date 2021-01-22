<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/resources/js/jquery-3.5.1.js"></script>
<body>
<h3>LIST</h3>
<a href="register">New</a>
<table border="1">
    <tr>
        <th align="center" width="60">NO</th>
        <th align="center" width="80">USERID</th>
        <th align="center" width="300">USERPW</th>
        <th align="center" width="100">USERNAME</th>
        <th align="center" width="180">REGDATE</th>
    </tr>
    <c:forEach items="${list}" var="member">
        <tr>
            <td align="center">${member.userNo}</td>
            <td align="center"><a href="/user/read?userNo=${member.userNo}">${member.userId}</a></td>
            <td align="left">${member.userPw}</td>
            <td align="right">${member.userName}</td>
            <td align="center"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${member.regDate}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
