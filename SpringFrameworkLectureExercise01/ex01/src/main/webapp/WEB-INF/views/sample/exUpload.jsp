<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
$(function(){
	$("#btnSubmit").click(function(){
		document.getElementById("fileForm").action = "/sample/exUploadPost";
		document.getElementById("fileForm").submit();
	});
});
</script>
</head>
<body>

<form method="post" enctype="multipart/form-data" id="fileForm" name="good">
	<div>
		<input type='file' name='files'>
	</div>
	<div>
		<input type='file' name='files'>
	</div>
	<div>
		<input type='file' name='files'>
	</div>
	<div>
		<input type='file' name='files'>
	</div>
	<div>
		<input type='file' name='files'>
	</div>
	<div>
		<input type='button' id="btnSubmit">
	</div>
</form>

</body>
</html>