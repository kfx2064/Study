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

<table>
    <tr>
        <td>개발자여부</td>
        <td>${member.foreigner}</td>
    </tr>
    <tr>
        <td>외국인여부</td>
        <td>${member.developer}</td>
    </tr>
    <tr>
        <td>취미(hobby)</td>
        <td>${member.hobby}</td>
    </tr>
    <tr>
        <td>취미(hobbyArray)</td>
        <td>
            <c:forEach var="hobby" items="${member.hobbyArray}">
                ${hobby}<br>
            </c:forEach>
        </td>
    </tr>
    <tr>
        <td>취미(hobbyList)</td>
        <td>
            <c:forEach var="hobby" items="${member.hobbyList}">
                ${hobby}<br>
            </c:forEach>
        </td>
    </tr>
</table>
</body>
</html>
