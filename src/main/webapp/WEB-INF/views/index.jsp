<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/08
  Time: 7:00 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.jsp"%>
<link rel="stylesheet" href="resources/css/main.css"/>
<c:choose>
    <c:when test="${not empty sessionScope.username}">
       <h1>${sessionScope.username} 님 환영합니다.</h1>
    </c:when>
    <c:otherwise>
        <h1>로그인해주세요.</h1>
    </c:otherwise>
</c:choose>

<h1> 안녕하세요. </h1>

<%@ include file="includes/footer.jsp"%>