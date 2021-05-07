<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
</head> 
<body>
<div id="content">
	<form id="member_join_form" class="width500">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Sign up</h3>
			</div>
			<div class="panel-body">
				<div class="form-group">
					<input type="text" id="iptId" value="bongbong3"/>
					<input type="password" id="iptPswd" value="1234" />
				</div>
			</div>
		</div>
		<div class="text-right">
			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="submit" class="btn btn-default">Cancel</button>
		</div>
	</form>
</div>
</body>
</html>