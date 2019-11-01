<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <!-- <title>Welcome</title> -->
    <title><spring:message code="welcome.title" text="Welcome"/></title>
</head>

<body>

<h2>
	<spring:message code="welcome.message" text="Welcome to Court Reservation System"/>
</h2>

<!-- <h2>Welcome to Court Reservation System</h2> -->
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/>.

<hr/>
Handling time : ${handlingTime} ms

<br/>
Locale : ${pageContext.response.locale}

</body>
</html>