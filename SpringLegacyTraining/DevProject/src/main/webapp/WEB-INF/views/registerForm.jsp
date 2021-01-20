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
            <td>개발자여부</td>
            <td>
                <form:checkbox path="developer" value="Y" />
            </td>
        </tr>
        <tr>
            <td>외국인여부</td>
            <td>
                <form:checkbox path="foreigner" value="falase" />
            </td>
        </tr>
        <tr>
            <td>취미(hobby)</td>
            <td>
                <form:checkbox path="hobby" value="Sports" label="Sports" /><br>
                <form:checkbox path="hobby" value="Music" label="Music" /><br>
                <form:checkbox path="hobby" value="Movie" label="Movie" />
            </td>
        </tr>
        <tr>
            <td>취미(hobbyArray)</td>
            <td>
                <form:checkbox path="hobbyArray" value="Sports" label="Sports" /><br>
                <form:checkbox path="hobbyArray" value="Music" label="Music" /><br>
                <form:checkbox path="hobbyArray" value="Movie" label="Movie" />
            </td>
        </tr>
        <tr>
            <td>취미(hobbyList)</td>
            <td>
                <form:checkbox path="hobbyList" value="Sports" label="Sports" /><br>
                <form:checkbox path="hobbyList" value="Music" label="Music" /><br>
                <form:checkbox path="hobbyList" value="Movie" label="Movie" />
            </td>
        </tr>
    </table>
    <form:button name="register">등록</form:button>
</form:form>
</body>
</html>