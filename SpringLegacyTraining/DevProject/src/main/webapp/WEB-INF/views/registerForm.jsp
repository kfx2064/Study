<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Register Form</h1>

<a href="register?userId=hongkd&password=1234">register?userId=hongkd&amp;password=1234</a><br>
<a href="register/hongkd">register/hongkd</a><br>

<a href="register/hongkd">register/hongkd</a><br>
<a href="register/hongkd/100">register/hongkd/100</a><br>

<a href="registerByGet01?userId=hongkd&dateOfBirth=1234">registerByGet01?userId=hongkd&amp;dateOfBirth=1234</a><br>
<a href="registerByGet01?userId=hongkd&dateOfBirth=2018-09-08">registerByGet01?userId=hongkd&amp;dateOfBirth=2018-09-08</a><br>
<a href="registerByGet01?userId=hongkd&dateOfBirth=20180908">registerByGet01?userId=hongkd&amp;dateOfBirth=20180908</a><br>
<a href="registerByGet01?userId=hongkd&dateOfBirth=2018/09/08">registerByGet01?userId=hongkd&amp;dateOfBirth=2018/09/08</a><br>
<a href="registerByGet02?userId=hongkd&dateOfBirth=20180908">registerByGet02?userId=hongkd&amp;dateOfBirth=20180908</a><br>

<form action="/register" method="post">
    userId:         <input type="text" name="userId"        value="hongkd"><br>
    password:       <input type="text" name="password"      value="1234"><br>
    dateOfBirth:    <input type="text" name="dateOfBirth"   value="20180908"><br>
    <input type="submit" value="register">
</form>

<form action="/register01" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register01">
</form>

<form action="/register02" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register02">
</form>

<form action="/register03" method="post">
    uid:        <input type="text" name="uid"       value="50"><br>
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register03">
</form>

<form action="/register04" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register04">
</form>

<form action="/register05" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register05">
</form>

<form action="/register0201" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register0201">
</form>

<form action="/register0202" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register0202">
</form>

<form action="/register0301" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register0301">
</form>

<form action="/register0302" method="post">
    userId:     <input type="text" name="userId"    value="hongkd"><br>
    password:   <input type="text" name="password"  value="1234"><br>
    coin:       <input type="text" name="coin"      value="100"><br>
    <input type="submit" value="register0302">
</form>
</body>
</html>
