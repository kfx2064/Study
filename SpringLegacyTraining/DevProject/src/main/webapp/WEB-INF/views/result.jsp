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
    <h4>gender</h4>
    <c:out value="${gender}" />
</body>
</html>
