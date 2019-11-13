<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../includes/header.jsp" %>


<section class="container">
    <div class="row">
        <form:form action="/event/form" method="post" modelAttribute="event">
            <fieldset>
                <form:label path="title">모임이름 : </form:label>
                <form:input path="title"/>
                <form:errors path="title" cssClass="text-danger"/>
            </fieldset>
            <fieldset>
                <form:label path="limit">정원 :</form:label>
                <form:input path="limit"/>
                <form:errors path="limit" cssClass="text-danger"/>
            </fieldset>
            <fieldset>
                <form:label path="email">이메일 :</form:label>
                <form:input path="email"/>
                <form:errors path="email" cssClass="text-danger"/>
            </fieldset>
            <button type="submit">submit</button>
        </form:form>
    </div>
</section>

<%@ include file="../includes/footer.jsp" %>
