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

<div id="formTest"></div>

<form action="/formTest" method="post">
    <input type="checkbox" name="chkTest" value="yes">
    <input type="checkbox" name="chkTest" checked="checked" value="no">

    <input id="select-submit" type="submit" value="전송">
</form>

<%@ include file="includes/footer.jsp"%>
<script>
    $('#select-submit').on('click', function(e) {
        console.log($('input[type="checkbox"]').find(':checked').value());
        e.preventDefault();

        $.ajax({
            url:'/formTest',
            type: 'post',
            dataType: 'json',
            contentType: "application/json;charset=utf-8",
            data : JSON.stringify($('input[type="checkbox"]').find(':checked').value()),
            success: function(data) {
                console.log(data);
            }
        })
    })
</script>