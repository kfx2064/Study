<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
</head>
<script src="/resources/js/jquery-3.5.1.js"></script>
<body>
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="menu" />
    <div align="center">
        <tiles:insertAttribute name="content" />
    </div>
    <tiles:insertAttribute name="footer" />
</body>
</html>
