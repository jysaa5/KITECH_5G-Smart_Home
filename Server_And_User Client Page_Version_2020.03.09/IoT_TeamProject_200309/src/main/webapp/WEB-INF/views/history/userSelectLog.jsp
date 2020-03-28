<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>

<style>

#home_a1, #home_a2, #home_a3, #home_a4, #home_a5, #home_a6, #home_a7{
   text-decoration: none;
} 

#btn_0, #btn_1, #btn_2, #btn_3, #btn_4, #btn_5 {
	padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;
	display: table;
	margin-left: auto;
	margin-right: auto;
}

#click-home {
	padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;
	display: table;
	margin-left: auto;
	margin-right: auto;
}

</style>

<title>My Home History View</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝-->

<script>
</script>

</head>
<body>

<!-- 해더 시작 -->
<%@ include file="/WEB-INF/views/include/header.jsp"%>
<!-- 해더 끝 -->

	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">My Home History</h6>
				<small>Since 2020</small>
			</div>
		</div>
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">My Home History</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray"></p>
			</div>
			<br>
			<br>
			
			<a id="home_a1" href="<c:url value="/cctv/userCctvLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="CCTV 로그" id="btn_0"></a><br>
			<a id="home_a2" href="<c:url value="/fingerprint/userFingerprintLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Fingerprint 로그" id="btn_1"></a><br>
			<a id="home_a3" href="<c:url value="/led/userLedLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="LED 로그" id="btn_2"></a><br>
			<a id="home_a4" href="<c:url value="/temperature/userTempLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="온도 로그" id="btn_3"></a><br>
			<a id="home_a5" href="<c:url value="/humidity/userHumLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="습도 로그" id="btn_4"></a><br>
			<a id="home_a6" href="<c:url value="/styler/userStylerLog"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Styler 로그" id="btn_5"></a><br>
			<div>
				<a id="home_a7" href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home" /></a>
			</div>
			
		</div>
	</main>
<!-- 메인 컨텐트 끝 -->

<script>
</script>

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->

</body>
</html>