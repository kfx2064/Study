<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%@ include file="./includes/header.jsp" %>
<p> The time on the server is ${serverTime}. </p>

<%@ include file="./includes/footer.jsp" %>
</body>
</html>
