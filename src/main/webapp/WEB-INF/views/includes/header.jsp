<%--
  Created by IntelliJ IDEA.
  User: govlmo91
  Date: 2019/11/08
  Time: 6:58 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Title</title>

	<link rel="stylesheet" href="/resources/css/animate-3.7.0.css">
	<link rel="stylesheet" href="/resources/css/font-awesome-4.7.0.min.css">
	<link rel="stylesheet" href="/resources/fonts/flat-icon/flaticon.css">
	<link rel="stylesheet" href="/resources/css/bootstrap-4.1.3.min.css">
	<link rel="stylesheet" href="/resources/css/owl-carousel.min.css">
	<link rel="stylesheet" href="/resources/css/nice-select.css">
	<link rel="stylesheet" href="/resources/css/style.css">

</head>
<body>

<header class="header-area main-header">
	<div class="container">
		<div class="row">
			<div class="col-lg-2">
				<div class="logo-area">
					<a href="index.html"><img src="/resources/images/logo.png" alt="logo"></a>
				</div>
			</div>
			<div class="col-lg-10">
				<div class="custom-navbar">
					<span></span>
					<span></span>
					<span></span>
				</div>
				<div class="main-menu">
					<ul>
						<li class="active"><a href="/index">home</a></li>
						<li><a href="about.html">about us</a></li>
						<li><a href="job-category.html">category</a></li>
						<li><a href="#">blog</a>
							<ul class="sub-menu">
								<li><a href="blog-home.html">Blog Home</a></li>
								<li><a href="blog-details.html">Blog Details</a></li>
							</ul>
						</li>
						<li><a href="contact-us.html">contact</a></li>
						<li><a href="#">pages</a>
							<ul class="sub-menu">
								<li><a href="job-search.html">Job Search</a></li>
								<li><a href="/calendar">캘린더</a></li>
								<li><a href="/formTest">form테스트</a></li>
								<li><a href="/event/form">스프링밸리데이터적용 이벤트</a></li>
							</ul>
						</li>
						<li class="menu-btn">
							<c:choose>
								<c:when test="${not empty sessionScope.member}">
									${sessionScope.member.username}
									<a href="/logout" class="template-btn">logout</a>
								</c:when>
								<c:otherwise>
									<a href="/loginForm" class="login">log in</a>
									<a href="/signupForm" class="template-btn">sign up</a>
								</c:otherwise>
							</c:choose>

						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</header>