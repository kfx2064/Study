<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>BOARD</title>
</head>
<body>
    <h3>REMOVE</h3>

    <form method="post" action="/board/post">
        <button type="submit" name="remove">Remove</button>
    </form>

    <a href="/board/get?list">LIST</a>
</body>
</html>
