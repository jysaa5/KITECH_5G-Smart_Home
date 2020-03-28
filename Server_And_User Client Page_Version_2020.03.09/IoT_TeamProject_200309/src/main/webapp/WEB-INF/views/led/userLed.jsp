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

<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>


<style>

#home_a{
   text-decoration: none;
} 

#btn_on, #btn_off{

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

#click-home{

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

#ligh_state{

    padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	text-align: center;
	display: table; 
	margin-left: auto; 
	margin-right: auto; 

}

</style>

<title>User LED</title>

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
				<h6 class="mb-0 text-white lh-100">LED 조절하기</h6>
				<small>Since 2020</small>
			</div>
		</div>
		
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">LED 조절하기</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">	 </p>
			</div>
			<br>
			<div>
			<h2 id="ligh_state"></h2>
			</div>
			<br>
			<br>
			 <input type="button" class="btn btn-lg btn-block btn-outline-primary"  value="light on" id="btn_on"><br>
			 <input type="button" class="btn btn-lg btn-block btn-outline-primary"  value="light off" id="btn_off"><br>
		
			<div><a id="home_a" href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home"/></a></div>
		</div>
	</main>
<!-- 메인 컨텐트 끝 -->

<script>
	
	
	$(document).ready(function(){
			
			$('#btn_on').click(function(){
				
				$.ajax({
					url:'http://192.168.0.66:5000/light_on',
						/*res: 응답 데이터 -> 문자열로 들어옴.  */
						success : function(res) {
							console.log(res)
							if (res == 'light on') {
								$('#ligh_state').text('LED ON');
							} else {
								$('#ligh_state').text('다시 시도해주세요.');
							}

						},
						error: function(res){
							$('#ligh_state').text('다시 시도해주세요.');
						}
					});

				});
		
			
	        $('#btn_off').click(function(){
				
				$.ajax({
					url:'http://192.168.0.66:5000/light_off',
						success : function(res) {
							console.log(res)
							if (res == 'light off') {
								$('#ligh_state').text('LED OFF');
							} else {
								$('#ligh_state').text('다시 시도해주세요.');
							}

						},
						error: function(res){
							$('#ligh_state').text('다시 시도해주세요.');
						}
					});

				});
	});
		
</script>

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->

</body>
</html>