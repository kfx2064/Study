<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Board</title>
</head>
<body>
    <h2>List</h2>
    <a href="register">New</a>
    <table border="1">
        <tr>
            <th align="center" width="80">NO</th>
            <th align="center" width="320">TITLE</th>
            <th align="center" width="100">WRITER</th>
            <th align="center" width="180">REGDATE</th>
        </tr>
        <c:forEach items="${list}" var="board">
            <tr>
                <td align="center">${board.boardNo}</td>
                <td align="left"><a href="/board/read?boardNo=${board.boardNo}">${board.title}</a></td>
                <td align="center"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${board.regDate}"/></td>
            </tr>
        </c:forEach>
    </table>

    <script>
        var result = "${msg}";

        if (result === "SUCCESS") {
            alert("처리가 완료되었습니다.");
        }
    </script>
</body>
</html>
