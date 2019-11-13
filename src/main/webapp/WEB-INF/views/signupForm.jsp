<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/13
  Time: 2:36 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.jsp" %>
<section class="container">
    <div class="row">
        <div class="form-group">
            <form:form modelAttribute="member">
                <div class="form-control">
                    유저이름 : <form:input path="username"/>
                    <form:errors path="username" cssClass="text-danger"/>
                </div>
                <div class="form-control">
                    비밀번호 : <form:input path="password"/>
                    <form:errors path="password" cssClass="text-danger"/>
                </div>
                <div class="form-control">
                    이메일 : <form:input path="email"/>
                    <form:errors path="email" cssClass="text-danger"/>
                </div>
                <button type="submit">가입</button>
            </form:form>
        </div>
    </div>
</section>
<%@ include file="includes/footer.jsp" %>