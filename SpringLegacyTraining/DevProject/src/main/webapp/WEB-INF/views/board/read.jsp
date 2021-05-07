<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Board</title>
</head>
<script src="/resources/js/jquery-3.5.1.js"></script>
<script>
$(document).ready(function () {

    var formObj = $("#board");

    console.log(formObj);

    $("#btnModify").on("click", function () {
        formObj.attr("action", "/board/modify");
        formObj.attr("method", "get");
        formObj.submit();
    });

    $("#btnRemove").on("click", function () {
        formObj.attr("action", "/board/remove") ;
        formObj.submit();
    });

    $("#btnList").on("click", function () {
        self.location = "/board/list";
    });

});
</script>
<body>
<h2>READ</h2>
<form:form modelAttribute="board">
    <form:hidden path="boardNo"/>
    <table>
        <tr>
            <td>Title</td>
            <td><form:input path="title" readonly="true"/></td>
        </tr>
        <tr>
            <td>Writer</td>
            <td><form:input path="writer" readonly="true"/></td>
        </tr>
        <tr>
            <td>Content</td>
            <td><form:input path="content" readonly="true"/></td>
        </tr>
    </table>
</form:form>
<div>
    <button type="submit" id="btnModify">Modify</button>
    <button type="submit" id="btnRemove">Remove</button>
    <button type="submit" id="btnList">List</button>
</div>
</body>
</html>