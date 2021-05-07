<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#header {
	width: 100%;
	height: 50px;
	text-align: center;
	background-color: aqua;
}

#menu {
	float: left;
	width: 15%;
	background-color: gray;
}

#content {
	float: left;
	width: 85%;
	background-color: lime;
}

#footer {
	width: 100%;
	height: 50px;
	text-align: center;
	background-color: orange;
	clear: both;
}

#menu, #content {
	min-height: 600px;
}
</style>
</head>
<body>
<div style="width: 100%; height: 100%">
	<div id="header"><tiles:insertAttribute name="airheader" /></div>
	<div id="menu"><tiles:insertAttribute name="airmenu" /></div>
	<div id="content"><tiles:insertAttribute name="aircontent" /></div>
	<div id="footer"><tiles:insertAttribute name="airfooter" /></div>
</div>
</body>
</html>