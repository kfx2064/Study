<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Board</title>
<script src="/resources/js/jquery-3.5.1.js"></script>
</head>
<body>
<h2>MODIFY</h2>
<form:form modelAttribute="board" action="modify">
    <form:hidden path="boardNo" />
    <table>
        <tr>
            <td>Title</td>
            <td><form:input path="title" /></td>
            <td><font color="red"><form:errors path="title" /></font></td>
        </tr>
        <tr>
            <td>Writer</td>
            <td><form:input path="writer"/></td>
            <td><font color="red"><form:errors path="writer" /></font></td>
        </tr>
        <tr>
            <td>Content</td>
            <td><form:textarea path="content" /></td>
            <td><font color="red"><form:errors path="content" /></font></td>
        </tr>
    </table>
    <div>
        <input type="submit" value="Submit" />
    </div>
    <a href="list">LIST</a>
</form:form>
</body>
</html>
