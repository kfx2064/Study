<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
<div style="width: 100%; height: 100%">
	<div id="css"><tiles:insertAttribute name="css" /></div>
	<div id="header"><tiles:insertAttribute name="header" /></div>
	<div id="menu"><tiles:insertAttribute name="menu" /></div>
	<div id="content"><tiles:insertAttribute name="content" /></div>
	<div id="footer"><tiles:insertAttribute name="footer" /></div>
</div>
</body>
</html>