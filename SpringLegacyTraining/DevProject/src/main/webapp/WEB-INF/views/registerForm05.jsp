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
<form:form modelAttribute="member" method="post" action="register2">
    <table>
        <tr>
            <td>소유차량</td>
            <td>
                <form:select path="carList" multiple="false">
                    <form:option value="" label="=== 선택해 주세요 ===" />
                    <form:options items="${carCodeList}" itemValue="value" itemLabel="label" />
                </form:select>
            </td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>
