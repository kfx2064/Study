<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
<h1>Spring Form</h1>
<form:form modelAttribute="member" method="post" action="register">
    <table>
        <tr>
            <td>유저ID</td>
            <td><form:input path="userId"/><font color="red"><form:errors path="userId"/></font></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><form:input path="userName"/><font color="red"><form:errors path="userName"/></font></td>
        </tr>
        <tr>
            <td>E-MAIL</td>
            <td><form:input path="email"/><font color="red"><form:errors path="email"/></font></td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>