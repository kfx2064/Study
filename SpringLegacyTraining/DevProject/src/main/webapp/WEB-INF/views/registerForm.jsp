<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Form</title>
</head>
<body>
<h2>Spring Form</h2>
<form:form modelAttribute="member" method="post" action="register">
    <table>
        <tr>
            <td>개발자여부</td>
            <td>
                <input id="developer1" name="developer" type="checkbox" value="Y" checked="checked"/>
                <input type="hidden" name="_developer" value="on" />
            </td>
        </tr>
        <tr>
            <td>외국인여부</td>
            <td>
                <input id="foreigner1" name="foreigner" type="checkbox" value="true" checked="checked" />
                <input type="hidden" name="_foreigner" value="on" />
            </td>
        </tr>
        <tr>
            <td>취미(hobby)</td>
            <td>
                <input id="hobby1" name="hobby" type="checkbox" value="Sports" />
                <label for="hobby1"> Sports</label>
                <input type="hidden" name="_hobby" value="on" /><br>
                <input id="hobby2" name="hobby" type="checkbox" value="Music" />
                <label for="hobby2"> Music</label>
                <input type="hidden" name="_hobby" value="on" /><br>
                <input id="hobby3" name="hobby" type="checkbox" value="Movie" checked="checked" />
                <label for="hobby3"> Movie</label>
                <input type="hidden" name="_hobby" value="on" />
            </td>
        </tr>
        <tr>
            <td>취미(hobbyArray)</td>
            <td>
                <input id="hobbyArray1" name="hobbyArray" type="checkbox" value="Sports"/>
                <label for="hobbyArray1"> Sports</label>
                <input type="hidden" name="_hobbyArray" value="on" /><br>
                <input id="hobbyArray2" name="hobbyArray" type="checkbox" value="Music" checked="checked" />
                <label for="hobbyArray2"> Music</label>
                <input type="hidden" name="_hobbyArray" value="on" /><br>
                <input id="hobbyArray3" name="hobbyArray" type="checkbox" value="Movie" checked="checked" />
                <label for="hobbyArray3"> Movie</label>
                <input type="hidden" name="_hobbyArray" value="on" />
            </td>
        </tr>
        <tr>
            <td>취미(hobbyList)</td>
            <td>
                <input id="hobbyList1" name="hobbyList" type="checkbox" value="Sports" />
                <label for="hobbyList1"> Sports</label>
                <input type="hidden" name="_hobbyList" value="on" /><br>
                <input id="hobbyList2" name="hobbyList" type="checkbox" value="Music" />
                <label for="hobbyList2"> Music</label>
                <input type="hidden" name="_hobbyList" value="on" /><br>
                <input id="hobbyList3" name="hobbyList" type="checkbox" value="Movie" checked="checked" />
                <label for="hobbyList3"> Movie</label>
                <input type="hidden" name="_hobbyList" value="on" />
            </td>
        </tr>
    </table>
    <button id="register" name="register" type="submit" value="Submit">등록</button>
</form:form>
</body>
</html>