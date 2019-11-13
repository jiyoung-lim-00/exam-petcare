
<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/08
  Time: 8:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.jsp"%>
<section class="container">
    <div class="row">
        <form:form modelAttribute="member" method="post" action="/loginProcess">
            아이디 : <form:input path="username"/>
            <form:errors path="username"/>
            비밀번호 : <form:input path="password"/>
            <form:errors path="password"/>
            <button type="submit">로그인</button>
        </form:form>
    </div>
</section>

<%@ include file="includes/footer.jsp"%>