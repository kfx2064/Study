<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/resources/js/jquery-3.5.1.js"></script>
<script>
    $(document).ready(function () {
        var formObj = $("#member");
        console.log(formObj);;

        $("#btnModify").on("click", function () {
            formObj.attr("action", "/user/modify") ;
            formObj.attr("method", "get");
            formObj.submit();
        });

        $("#btmRemove").on("click", function () {
            formObj.attr("action", "/user/remove");
            formObj.submit();
        });

        $("#btnList").on("click", function () {
            self.location = "/user/list";
        });
    });
</script>
<body>
<h3>READ</h3>
<form:form modelAttribute="member">
    <form:hidden path="userNo" />
    <table>
        <tr>
            <td>userid</td>
            <td><form:input path="userId" readonly="true" /></td>
        </tr>
        <tr>
            <td>username</td>
            <td><form:input path="userName" readonly="true" /></td>
        </tr>
        <tr>
            <td>auth - 1</td>
            <td>
                <form:select path="authList[0].auth">
                    <form:option value="ROLE_USER" label="사용자" />
                    <form:option value="ROLE_MEMBER" label="회원" />
                    <form:option value="ROLE_ADMIN" label="관리자" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td>auth - 2</td>
            <td>
                <form:select path="authList[1].auth">
                    <form:option value="" label="=== 선택해 주세요. ==="/>
                    <form:option value="ROLE_USER" label="사용자" />
                    <form:option value="ROLE_MEMBER" label="회원" />
                    <form:option value="ROLE_ADMIN" label="관리자" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td>auth - 3</td>
            <td>
                <form:select path="authList[2].auth">
                    <form:option value="" label="=== 선택해 주세요. ===" />
                    <form:option value="ROLE_USER" label="사용자"/>
                    <form:option value="ROLE_MEMBER" label="회원" />
                    <form:option value="ROLE_ADMIN" label="관리자" />
                </form:select>
            </td>
        </tr>
    </table>
</form:form>

<div>
    <button type="submit" id="btnModify">Modify</button>
    <button type="submit" id="btnRemove">REMOVE</button>
    <button type="submit" id="btnList">LIST</button>
</div>
</body>
</html>
