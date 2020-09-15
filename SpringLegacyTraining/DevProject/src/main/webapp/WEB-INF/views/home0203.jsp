<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <p>coin : ${coin}</p>
    <fmt:parseNumber value="${coin}" type="percent" var="coinNum"/>
    <p>coinNum : ${coinNum}</p>
</body>
</html>
