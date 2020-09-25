<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
<h2>Spring Form</h2>
<form:form modelAttribute="member" method="post" action="register">
    <table>
        <td>패스워드</td>
        <td><form:password path="password"/><font color="read"><form:errors path="password"/></font></td>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>