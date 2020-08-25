<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>

<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>

<script type="text/javascript">
$(document).ready(function () {

    $("#registerBtn01").on("click", function () {
        $.get("/register/hongkd", function (result) {
           console.log("result: " + result);
           if (result === "SUCCESS") {
               alert("SUCCESS");
           }
        });
    });

    $("#registerBtn02").on("click", function () {
        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
        };

        $.ajax({
            type: "post"
            , url: "/register/hongkd/pw01"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result: " + result);

                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });
    });

    $("#registerBtn03").on("click", function () {
        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
        };

        $.ajax({
            type: "post"
            , url: "/register03"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result: " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });
    });

    $("#registerBtn04").on("click", function () {
        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
        };

        $.ajax({
            type: "post"
            , url: "/register04"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result: " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });
    });

    $("#registerBtn05").on("click", function () {
        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
        };

        $.ajax({
            type: "post"
            , url: "/register05?userId=user01"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result: " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });
    });

    $("#registerBtn06").on("click", function () {
        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
        };

        $.ajax({
            type: "post"
            , url: "/register/hongkd"
            , data: JSON.stringify(userObject)
        });
    });

    $("#registerBtn07").on("click", function () {
        var userObjectArray = [
            {userId:"name01", password:"pw01"},
            {userId:"name02", password:"pw02"}
        ];

        $.ajax({
            type: "post"
            , url: "/register07"
            , data: JSON.stringify(userObjectArray)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result : " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });
    });

    $("#registerBtn08").on("click", function () {

        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
            , address   : {
                postCode: "010908"
                , location: "seoul"
            }
        };

        $.ajax({
            type: "post"
            , url: "/register08"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result: " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });

    });

    $("#registerBtn09").on("click", function () {

        var userId = $("#userId");
        var password = $("#password");
        var userIdVal = userId.val();
        var passwordVal = password.val();

        var userObject = {
            userId      : userIdVal
            , password  : passwordVal
            , cardList  : [{
                no              : "23456"
                , validMonth    : "20190908"
            }, {
                no              : "12342"
                , validMonth    : "20200705"
            }]
        };

        $.ajax({
            type: "post"
            , url: "/register09"
            , data: JSON.stringify(userObject)
            , contentType: "application/json; charset=utf-8"
            , success: function (result) {
                console.log("result : " + result);
                if (result === "SUCCESS") {
                    alert("SUCCESS");
                }
            }
        });

    });

});
</script>
<body>
<h1>Register Form</h1>
<form>
    userId:     <input type="text" name="userId" value="hongkd" id="userId">
    password:   <input type="text" name="password" value="1234" id="password">
</form>

<button id="registerBtn01">registerBtn01</button>
<button id="registerBtn02">registerBtn02</button>
<button id="registerBtn03">registerBtn03</button>
<button id="registerBtn04">registerBtn04</button>
<button id="registerBtn05">registerBtn05</button>
<button id="registerBtn06">registerBtn06</button>
<button id="registerBtn07">registerBtn07</button>
<button id="registerBtn08">registerBtn08</button>
<button id="registerBtn09">registerBtn09</button>
</body>
</html>
