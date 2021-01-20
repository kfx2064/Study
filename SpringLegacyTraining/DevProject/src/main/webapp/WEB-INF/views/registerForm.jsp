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
        <tr>
            <td><form:label path="userId">유저ID</form:label></td>
            <td><form:input path="userId" /><font color="red"><form:errors path="userId" /></font></td>
        </tr>
        <tr>
            <td><form:label path="userName">이름</form:label></td>
            <td><form:input path="userName" /><font color="red"><form:errors path="userName" /></font></td>
        </tr>
        <tr>
            <td><form:label path="email">E-MAIL</form:label></td>
            <td><form:input path="email" /><font color="red"><form:errors path="email" /></font></td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>