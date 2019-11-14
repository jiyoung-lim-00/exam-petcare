<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/13
  Time: 5:10 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="includes/header.jsp" %>
<section class="container">
    <div class="row">

        <form action="/chkbox" method="post">
            <label for="id-op1">체크박스1</label>
            <input type="checkbox" name="op" value="op1" id="id-op1">

            <label for="id-op1">체크박스2</label>
            <input type="checkbox" name="op" value="op2" id="id-op2">

            <button type="submit">전송</button>
        </form>
    </div>
</section>
<%@include file="includes/footer.jsp" %>