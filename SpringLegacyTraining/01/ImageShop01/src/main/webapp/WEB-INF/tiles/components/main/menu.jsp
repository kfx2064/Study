<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div align="center">
    <table>
        <tr>
            <td width="80"><a href="/"><spring:message code="header.home" /></a></td>

            <sec:authorize access="!isAuthenticated()">
                <td width="120"><a href="/board/list"><spring:message code="menu.board.member" /></a></td>
                <td width="120"><a href="/notice/list"><spring:message code="menu.notice.member" /></a></td>
                <td width="120"><a href="/item/list"><spring:message code="menu.item.member" /></a></td>
                <%-- 자료실을 메뉴에 추가한다. --%>
                <td width="120"><a href="/pds/list"><spring:message code="menu.pds.member" /></a></td>
            </sec:authorize>

            <sec:authorize access="isAuthenticated()">
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <td width="120">
                        <a href="/codeclass/list"><spring:message code="menu.codeclass.list" /></a>
                    </td>
                    <td width="120">
                        <a href="/codedetail/list"><spring:message code="menu.codedetail.list" /></a>
                    </td>
                    <td width="120">
                        <a href="/user/list"><spring:message code="menu.user.admin" /></a>
                    </td>
                    <td width="120">
                        <a href="/board/list"><spring:message code="menu.board.member" /></a>
                    </td>
                    <td width="120">
                        <a href="/notice/list"><spring:message code="menu.notice.admin" /></a>
                    </td>
                    <td width="120">
                        <a href="/item/list"><spring:message code="menu.item.admin" /></a>
                    </td>
                    <td width="120">
                        <a href="/pds/list"><spring:message code="menu.pds.admin" /></a>
                    </td>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_MEMBER')">
                    <td width="120">
                        <a href="/board/list"><spring:message code="menu.board.member" /></a>
                    </td>
                    <td width="120">
                        <a href="/notice/list"><spring:message code="menu.notice.member" /></a>
                    </td>
                    <td width="120">
                        <a href="/item/list"><spring:message code="menu.item.member" /></a>
                    </td>
                    <td width="120">
                        <a href="/coin/charge"><spring:message code="menu.coin.charge" /></a>
                    </td>
                    <td width="120">
                        <a href="/coin/list"><spring:message code="menu.coin.list" /></a>
                    </td>
                    <%-- 구매상품과 구매내역을 메뉴에 추가한다. --%>
                    <td width="120"><a href="/useritem/list"><spring:message code="menu.useritem.list" /></a></td>
                    <td width="120"><a href="/coin/listPay"><spring:message code="menu.coin.listPay" /></a></td>
                    <%-- 자료실을 메뉴에 추가한다. --%>
                    <td width="120"><a href="/pds/list"><spring:message code="menu.pds.member" /></a></td>
                </sec:authorize>
            </sec:authorize>

            <td width="120"><a href="/codeclass/list"><spring:message code="menu.codeclass.list" /></a></td>
        </tr>
    </table>
</div>
<hr>