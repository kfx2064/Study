<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <p>now : ${now}</p>

    <p>date : <fmt:formatDate value="${now}" type="time"/></p>
    <p>date default : <fmt:formatDate value="${now}" type="time" dateStyle="default"/></p>
    <p>date short : <fmt:formatDate value="${now}" type="time" dateStyle="short"/></p>
    <p>date medium : <fmt:formatDate value="${now}" type="time" dateStyle="medium"/></p>
    <p>date long : <fmt:formatDate value="${now}" type="time" dateStyle="long"/></p>
    <p>date full : <fmt:formatDate value="${now}" type="time" dateStyle="full"/></p>
</body>
</html>