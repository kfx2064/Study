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
    <p>number : ${coin}</p>
    <p>currency : <fmt:formatNumber value="${coin}" type="currency"/></p>
    <p>percent : <fmt:formatNumber value="${coin}" type="percent"/></p>
    <p>pattern : <fmt:formatNumber value="${coin}" pattern="000000.00"/></p>
</body>
</html>
