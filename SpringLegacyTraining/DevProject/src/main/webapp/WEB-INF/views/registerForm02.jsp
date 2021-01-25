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
            <td>국적</td>
            <td>
                <form:select path="nationality" items="${nationalityCodeList}"
                        itemValue="value" itemLabel="label" />
            </td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>
