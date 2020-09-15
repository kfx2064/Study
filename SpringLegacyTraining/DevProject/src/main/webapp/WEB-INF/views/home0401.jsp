<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <c:catch var="ex">
        ${member.hobbyArray[3]}
    </c:catch>

    <p>
        <c:if test="${ex != null}">
            ${ex}
        </c:if>
    </p>

    <%--<table border="1">
        <tr>
            <td>{coin == 1000 && userId == "hongkd"}</td>
            <td>${coin == 1000 && userId == "hongkd"}</td>
        </tr>
        <tr>
            <td>{coin == 1000 and userId eq "hongkd"}</td>
            <td>${coin == 1000 and userId eq "hongkd"}</td>
        </tr>
        <tr>
            <td>{not empty member && userId eq "hongkd"}</td>
            <td>${not empty member && userId eq "hongkd"}</td>
        </tr>
        <tr>
            <td>{! empty member && userId eq "hongkd"}</td>
            <td>${empty member && userId eq "hongkd"}</td>
        </tr>
    </table>--%>
</body>
</html>
