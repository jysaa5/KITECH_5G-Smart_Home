<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>

<style>

#home_a{
   text-decoration: none;
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

#cctvSetting {
    width:auto;
	height: auto;
    padding: auto 0px;
	margin: auto 0px;
	text-align: center;
	margin-left: auto;
	margin-right: auto;
}

 tbody {
	padding: auto;
	margin: auto;
	text-align: center;
}

#resultLine{

    padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	text-align: center;
	display: table; 
	margin-left: auto; 
	margin-right: auto; 
	color: yellow;

}
</style>

<title>User CCTV</title>

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
		<div
			class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">실시간 CCTV</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">실시간 CCTV</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray"> </p>
			</div>
			<table class="cctvSetting media text-muted pt-3">
				<tr>
					<td><iframe src="http://192.168.0.63:8033" height="480" width="640" scrolling="yes" frameborder="1">
					이 브라우저는 iframe을 지원하지 않습니다.
					</iframe></td>
				</tr>
				</table>
				<br>
			<table class="cctvSetting table table-striped table-dark">
				<tr>
				<td colspan="2">	
					<h4>CCTV 설정</h4>
				</td>
				</tr>
				<tr>
				<td colspan="2">
				<div>
		     	<h2 id="resultLine"></h2>
		     	</div>
		     	</td>
				</tr>
				<tr>
				<td>
				<h5>CCTV 좌우방향</h5>
				</td>
				<td>
				<h3 style="font-size: 20px" style="cursor: hand;" title="카메라의 좌우방향을 조정합니다.">Left-------Right</h3> 
				<input type="range" id="br_val" min="2" max="25" value="0"> 
				<span id="num">0</span>
				</td>
				</tr>
				
				<tr>
				<td>
				<h5>CCTV 상하방향</h5>
				</td>
				<td>
				<h3 style="font-size: 20px" style="cursor: hand" title="카메라의 상하방향을 조정합니다.">Down-------Up</h3> 
				<input type="range" id="br_val2" min="2" max="7" value="0"> <span id="num2">0</span>
				</td>
				</tr>
				
				<tr>
				<td>
				<h5 style="cursor: hand;" title="저장되는 사진과 영상의 화질 setting 값입니다.
                                     0=(320,240),
                                     1=(640,480), 
                                     2=(1024,768), 
                                     3=(1280, 960),
                                     4=(1440, 900),
                                     5=(1680, 1050), 
                                     6=(1920,1200)  ">CCTV 화질</h5>
                  </td>
                  <td>
						<h3 style="font-size: 20px">Low-------High</h3> 
						<input type="range" id="s_val" min="0" max="6" value="0"> 
						<span id="num3">0</span>
				</td>
				</tr>
			</table>
			
			<br>
			<div>
			<a id="home_a" href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home" /></a>
			</div>
		</div>
	</main>
<!-- 메인 컨텐트 끝 -->

<script>
		$('#br_val').change(function() {
			$('#num').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/RL',
				data : {
					moter : 'm',
					p_val : $('#br_val').val()
				},
				method : 'get',
				
				success : function(res) {
					console.log(res)	
					$('#resultLine').text('설정 적용중');
					},
					
				error: function(res){
					$('#resultLine').text('다시 시도해주세요.');
					}
			});
		});

		$('#br_val2').change(function() {
			$('#num2').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/UD',
				data : {
					moter2 : 'm2',
					p_val2 : $('#br_val2').val()
				},
				method : 'get',
				success : function(res) {
					console.log(res)	
					$('#resultLine').text('설정 적용중');
					},
					
				error: function(res){
					$('#resultLine').text('다시 시도해주세요.');
					}

			});
		});

		$('#s_val').change(function() {
			$('#num3').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/setting',
				data : {
					moter3 : 'm3',
					p_val3 : $('#s_val').val()
				},
				method : 'get',
				success : function(res) {
					console.log(res)	
					$('#resultLine').text('설정 적용중');
					},
					
				error: function(res){
					$('#resultLine').text('다시 시도해주세요.');
					}

			});
		});
</script>

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->

</body>
</html>