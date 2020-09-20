<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
<h2>Spring Form</h2>

<form:form modelAttribute="user" method="post" action="register">
    <table>
        <tr>
            <td>유저ID</td>
            <td><form:input path="userId" /><font color="red"><form:errors path="userId"/></font></td>
        </tr>
        <tr>
            <td>이름</td>
            <td><form:input path="userName" /><font color="red"><form:errors path="userName"/></font></td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>

</body>
</html>
