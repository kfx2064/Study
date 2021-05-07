<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h2><spring:message code="codedetail.header.read" /></h2>

<form:form modelAttribute="codeDetail">
    <table>
        <tr>
            <td><spring:message code="codedetail.classCode" /></td>
            <td><form:select path="classCode" items="${classCodeList}" itemValue="value"
                    itemLabel="label" readonly="true" /></td>
            <td><font color="red"><form:errors path="classCode" /></font></td>
        </tr>
        <tr>
            <td><spring:message code="codedetail.codeValue" /></td>
            <td><form:input path="codeValue" readonly="true" /></td>
            <td><font color="red"><form:errors path="codeValue"/></font></td>
        </tr>
    </table>
</form:form>