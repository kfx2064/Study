<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h3>Result</h3>

<h4>user.address : </h4>
user.address.postCode : ${user.address.postCode} <br>
user.address.location : ${user.address.location} <br>

<h4>user.cardList : </h4>
<c:forEach var="card" items="${user.cardList}">
    <c:out value="${card.no} ${card.validMonth}" /><br>
</c:forEach>

<c:forEach var="card" items="${user.cardList}">
    <c:out value="${card.no}" /><br>
    <c:out value="${card.validMonth}" /><br>
</c:forEach>

<c:forEach var="card" items="${user.cardList}">
    ${card.no} ${card.validMonth}
</c:forEach>
</body>
</html>
