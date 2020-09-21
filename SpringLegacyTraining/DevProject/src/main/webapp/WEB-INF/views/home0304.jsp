<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <p>now : {now}</p>
    <p>pattern : <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss" /></p>
    <p>pattern : <fmt:formatDate value="${now}" pattern="a h:mm" /></p>
    <p>pattern : <fmt:formatDate value="${now}" pattern="z a h:mm"/></p>
</body>
</html>
