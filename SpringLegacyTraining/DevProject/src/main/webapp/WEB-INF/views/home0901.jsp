<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h4>절대 URL</h4>
    <c:import url="http://localhost:8080/board/list"/>

    <c:import url="http://localhost:8080/board/search">
        <c:param name="keyword" value="orange" />
    </c:import>

    <h4>상대 URL - 절대 경로</h4>
    <c:import url="/board/list"/>

    <c:import url="/board/search">
        <c:param name="keyword" value="orange"/>
    </c:import>
</body>
</html>
