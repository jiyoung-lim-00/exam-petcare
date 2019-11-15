<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/13
  Time: 11:04 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.jsp"%>

<section class="container">
    <div class="form-group">
        <form:form modelAttribute="reservation" action="/reservationProcess" method="post">
            <form:label path="title">예약제목</form:label>
            <form:input path="title" id="title"/>
            <form:label path="description">예약내용</form:label>
            <form:input path="description" id="description"/>
            <form:label path="startDate">예약시간</form:label>
            <form:input path="startDate" type="date"/>
            <form:label path="endDate">예약종료시간</form:label>
            <form:input path="endDate" type="date"/>
            <button type="submit">예약</button>
        </form:form>
    </div>
</section>
<%@ include file="includes/footer.jsp"%>