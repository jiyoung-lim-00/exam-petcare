<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/08
  Time: 10:44 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../includes/header.jsp" %>
<%@ include file="../includes/footer.jsp" %>
<link href='${pageContext.request.contextPath}/resources/fullcalendar/core/main.css' rel='stylesheet'/>
<link href='${pageContext.request.contextPath}/resources/fullcalendar/daygrid/main.css' rel='stylesheet'/>
<link href='${pageContext.request.contextPath}/resources/fullcalendar/timegrid/main.min.css' rel='stylesheet'/>
<script src="${pageContext.request.contextPath}/resources/fullcalendar/core/moment.min.js"></script>
<script src='${pageContext.request.contextPath}/resources/fullcalendar/core/main.js'></script>
<script src='${pageContext.request.contextPath}/resources/fullcalendar/daygrid/main.js'></script>
<script src='${pageContext.request.contextPath}/resources/fullcalendar/timegrid/main.js'></script>
<script src='${pageContext.request.contextPath}/resources/fullcalendar/interaction/main.js'></script>
<script src="${pageContext.request.contextPath}/resources/fullcalendar/core/select2.min.js"></script>
>
<script src="${pageContext.request.contextPath}/resources/fullcalendar/core/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet" href='${pageContext.request.contextPath}/resources/fullcalendar/core/select2.min.css'/>
<link rel="stylesheet"
      href='${pageContext.request.contextPath}/resources/fullcalendar/core/bootstrap-datetimepicker.min.css'/>
<link rel="stylesheet" href='${pageContext.request.contextPath}/resources/css/main.css'/>


<div class="container container-fluid">
    <div class="row">
        <div id="calendar"></div>
    </div>
    <div class="row container align-items-center">
        <!-- 일정 추가 MODAL -->
        <div class="modal fade" tabindex="-1" role="dialog" id="eventModal">
            <div class="modal-dialog modal-small" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title"></h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-12">
                                <label class="col-md-6 pull-left" for="edit-title">일정명</label>
                                <input class="inputModal col-md-6 pull-right" type="text" name="edit-title"
                                       id="edit-title"
                                       required="required"/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <label class="col-md-6 pull-left" for="edit-start">시작</label>
                                <input class="inputModal col-md-6 pull-right" type="text" name="edit-start"
                                       id="edit-start"/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <label class="col-md-6" for="edit-desc">설명</label>
                                <textarea rows="8" cols="50" class="col-md-12 block" name="edit-desc"
                                          id="edit-desc"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer modalBtnContainer-addEvent">
                        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
                        <button type="button" class="btn btn-primary" id="save-event">예약</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="${pageContext.request.contextPath}/resources/js/calendar-main.js"></script>






