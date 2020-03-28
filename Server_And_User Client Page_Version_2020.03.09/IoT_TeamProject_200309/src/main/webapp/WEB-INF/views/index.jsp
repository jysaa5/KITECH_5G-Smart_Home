<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v3.8.6">
<title>Welcome Smart Home</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp" %>

<!-- <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/pricing/">

Bootstrap core CSS
<link href="/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

Favicons
<link rel="apple-touch-icon"
	href="/docs/4.4/assets/img/favicons/apple-touch-icon.png"
	sizes="180x180">
<link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-32x32.png"
	sizes="32x32" type="image/png">
<link rel="icon" href="/docs/4.4/assets/img/favicons/favicon-16x16.png"
	sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/4.4/assets/img/favicons/manifest.json">
<link rel="mask-icon"
	href="/docs/4.4/assets/img/favicons/safari-pinned-tab.svg"
	color="#563d7c">
<link rel="icon" href="/docs/4.4/assets/img/favicons/favicon.ico">
<meta name="msapplication-config"
	content="/docs/4.4/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
Custom styles for this template
<link href="pricing.css" rel="stylesheet"> -->
<style>
#home_a1, #home_a2, #home_a3, #home_a4, #home_a5, #home_a6{
   text-decoration: none;
} 

</style>

</head>
<body>
 <!-- 해더 시작 -->
  <%@ include file="/WEB-INF/views/include/header.jsp" %>
	<!-- <div
		class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
		<h5 class="my-0 mr-md-auto font-weight-normal">Company name</h5>
		<nav class="my-2 my-md-0 mr-md-3">
			<a class="p-2 text-dark" href="#">Features</a> <a
				class="p-2 text-dark" href="#">Enterprise</a> <a
				class="p-2 text-dark" href="#">Support</a> <a class="p-2 text-dark"
				href="#">Pricing</a>
		</nav>
		<a class="btn btn-outline-primary" href="#">Sign up</a>
	</div> -->

	<div
		class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
		<h1 class="display-4">Smart Home</h1>
		<p class="lead">오늘의 나의 집 상태를 확인해주세요.</p>
	</div>

	<div class="container">
		<div class="card-deck mb-3 text-center">
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">CCTV</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						사진/영상 <!-- <small class="text-muted">확인</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>우리집 보안 상태는?</li>
						<li>외부인의 무단 침입 방지</li>
						<li>CCTV 데이터베이스</li>
						<li></li><br>
					</ul>
					<a id="home_a1" href="<c:url value="/cctv/cctvList"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">CCTV Setting</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						설정 <!-- <small class="text-muted">확인</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>원하는 각도로 설정</li>
						<li>4각 지대 없이 구현</li>
						<li>더 안전하게 설정하기</li>
						<li></li><br>
					</ul>
					<a id="home_a2" href="<c:url value="/cctv/userCctv"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
				
			</div>
		
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">LED</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						점등 <!-- <small class="text-muted">확인</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>조명 ON/OF</li>
						<li>전기세 절약</li>
						<li>원격 조정 가능</li>
						<li></li><br>
					</ul>
					<a id="home_a3" href="<c:url value="/led/userLed"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">My Home History</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						데이터 분석 <!-- <small class="text-muted">확인</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>CCTV, 출입</li>
						<li>온습도, LED, Styler</li>
						<li>로그 분석</li>
						<li></li><br>
					</ul>
					<a id="home_a4" href="<c:url value="/history/userSelectLog"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
			</div>
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">Styler</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						촬영 <!-- <small class="text-muted">/ mo</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>웹캠 촬영</li>
						<li>오늘의 나의 스타일</li>
						<li>스타일 자랑 하기</li>
						<li></li><br>
					</ul>
					<a id="home_a5" href="<c:url value="/styler/userStyler"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">OOTD</h4>
				</div>
				<div class="card-body">
					<h2 class="card-title pricing-card-title">
						스타일 <!-- <small class="text-muted">/ mo</small> -->
					</h2>
					<ul class="list-unstyled mt-3 mb-4">
						<li>오늘 뭐 입지?</li>
						<li>자동 추천 시스템</li>
						<li>고민하지 말고 추천받자</li>
						<li></li><br>
					</ul>
					<a id="home_a6" href="<c:url value="/styler/stylerList"/>"><button type="button" class="btn btn-lg btn-block btn-outline-primary">Click</button></a>
				</div>
			</div>
		</div>
<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<!-- 		<footer class="pt-4 my-md-5 pt-md-5 border-top">
			<div class="row">
				<div class="col-12 col-md">
					<img class="mb-2" src="/docs/4.4/assets/brand/bootstrap-solid.svg"
						alt="" width="24" height="24"> <small
						class="d-block mb-3 text-muted">&copy; 2017-2019</small>
				</div>
				<div class="col-6 col-md">
					<h5>Features</h5>
					<ul class="list-unstyled text-small">
						<li><a class="text-muted" href="#">Cool stuff</a></li>
						<li><a class="text-muted" href="#">Random feature</a></li>
						<li><a class="text-muted" href="#">Team feature</a></li>
						<li><a class="text-muted" href="#">Stuff for developers</a></li>
						<li><a class="text-muted" href="#">Another one</a></li>
						<li><a class="text-muted" href="#">Last time</a></li>
					</ul>
				</div>
				<div class="col-6 col-md">
					<h5>Resources</h5>
					<ul class="list-unstyled text-small">
						<li><a class="text-muted" href="#">Resource</a></li>
						<li><a class="text-muted" href="#">Resource name</a></li>
						<li><a class="text-muted" href="#">Another resource</a></li>
						<li><a class="text-muted" href="#">Final resource</a></li>
					</ul>
				</div>
				<div class="col-6 col-md">
					<h5>About</h5>
					<ul class="list-unstyled text-small">
						<li><a class="text-muted" href="#">Team</a></li>
						<li><a class="text-muted" href="#">Locations</a></li>
						<li><a class="text-muted" href="#">Privacy</a></li>
						<li><a class="text-muted" href="#">Terms</a></li>
					</ul>
				</div>
			</div>
		</footer> -->
	</div>
</body>
</html>
