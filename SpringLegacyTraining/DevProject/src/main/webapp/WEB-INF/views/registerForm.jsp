<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Register Form</h1>

<form action="/registerUserId" method="post">
    userId: <input type="text" name="userId" /><br>
    <input type="submit" value="registerUserId">
</form>

<form action="/registerMemberUserId" method="post">
    userId: <input type="text" name="userId" /><br>
    <input type="submit" value="registerMemberUserId">
</form>

<form action="/registerPassword" method="post">
    password: <input type="password" name="password" /><br>
    <input type="submit" value="registerPassword">
</form>

<form action="/registerRadio" method="post">
    gender: <br>
    <input type="radio" name="gender" value="male" checked> Male<br>
    <input type="radio" name="gender" value="female"> Female<br>
    <input type="radio" name="gender" value="other"> Other<br>
    <input type="submit" value="registerRadio">
</form>

<form action="/registerSelect" method="post">
    nationality:
    <select name="nationality">
        <option value="Korea" selected>대한민국</option>
        <option value="Germany">독일</option>
        <option value="Australia">호주</option>
        <option value="Canada">캐나다</option>
    </select><br>
    <input type="submit" value="registerSelect">
</form>

<form action="/registerMultipleSelect01" method="post">
    cars:
    <select name="cars" multiple>
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="opel">Opel</option>
        <option value="audi">Audi</option>
    </select><br>
    <input type="submit" value="registerMultipleSelect01">
</form>

<form action="/registerMultipleSelect02" method="post">
    carArray:
    <select name="carArray" multiple>
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="opel">Opel</option>
        <option value="audi">Audi</option>
    </select><br>
    <input type="submit" value="registerMultipleSelect02">
</form>

<form action="/registerMultipleSelect03" method="post">
    carList:
    <select name="carList" multiple>
        <option value="volvo">Volvo</option>
        <option value="saab">Saab</option>
        <option value="opel">Opel</option>
        <option value="audi">Audi</option>
    </select><br>
    <input type="submit" value="registerMultipleSelect03">
</form>

<form action="/registerCheckbox01" method="post">
    hobby: <br>
        <input type="checkbox" name="hobby" value="Sports"> Sports<br>
        <input type="checkbox" name="hobby" value="Music"> Music<br>
        <input type="checkbox" name="hobby" value="Movie"> Movie<br>
    <input type="submit" value="registerCheckbox01">
</form>

<form action="/registerCheckbox02" method="post">
    hobby: <br>
    <input type="checkbox" name="hobbyList" value="Sports"> Sports<br>
    <input type="checkbox" name="hobbyList" value="Music"> Music<br>
    <input type="checkbox" name="hobbyList" value="Movie"> Movie<br>
    <input type="submit" value="registerCheckbox02">
</form>

<form action="/registerCheckbox03" method="post">
    hobby: <br>
    <input type="checkbox" name="hobbyArray" value="Sports"> Sports<br>
    <input type="checkbox" name="hobbyArray" value="Music"> Music<br>
    <input type="checkbox" name="hobbyArray" value="Movie"> Movie<br>
    <input type="submit" value="registerCheckbox03">
</form>

<form actio="/registerCheckbox04" method="post">
    developer: <input type="checkbox" name="developer" value="Y"><br>
    <input type="submit" value="registerCheckbox04">
</form>

<form actio="/registerCheckbox05" method="post">
    developer: <input type="checkbox" name="foreigner" value="false"><br>
    <input type="submit" value="registerCheckbox05">
</form>

<form action="/registerAddress" method="post">
    postCode: <input type="text" name="postCode"/><br>
    location: <input type="text" name="location"/><br>
    <input type="submit" value="registerAddress">
</form>

<form action="/registerUserAddress" method="post">
    address.postCode: <input type="text" name="address.postCode"><br>
    address.location: <input type="text" name="address.location"><br>
    <input type="submit" value="registerUserAddress">
</form>

<form action="/registerUserCardList" method="post">
    카드1 - 번호 : <input type="text" name="cardList[0].no"><br>
    카드1 - 유효년월 : <input type="text" name="cardList[0].validMonth"><br><br>
    카드2 - 번호 : <input type="text" name="cardList[1].no"><br>
    카드2 - 유효년월 : <input type="text" name="cardList[1].validMonth"><br><br>
    <input type="submit" value="registerUserCardList">
</form>

<form action="/registerTextArea" method="post">
    introduction: <br>
    <textarea name="introduction" rows="6" cols="50"></textarea><br>
    <input type="submit" value="registerTextArea">
</form>

<form action="/registerDate01" method="post">
    dateOfBirth: <input type="text" name="dateOfBirth"><br>
    <input type="submit" value="registerDate01">
</form>

<form action="/registerDate02" method="post">
    dateOfBirth: <input type="text" name="dateOfBirth"><br>
    <input type="submit" value="registerDate02">
</form>

<br>
<br>
<br>
<br>
<br>


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

