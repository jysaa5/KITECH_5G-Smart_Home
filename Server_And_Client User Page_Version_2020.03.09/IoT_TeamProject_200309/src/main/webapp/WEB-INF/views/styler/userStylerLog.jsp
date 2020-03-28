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

#btn_logDB{

	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;

}

#btn_on {
	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;
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

#dict_table {
	width: auto;
	height: auto;
	text-align: center;
	margin: auto 0px;
}

#date_on {
	font-size: 20px;
	width: 200px;
	height: 60px;
	text-align: center;
}

.a_layer {
	width: auto;
	height: auto;
	text-align: center;
	margin: auto 0px;
}

.a_content {
	width: auto;
	height: auto;
	display: inline-block;
}

.dataframe{
	width: auto;
	height: auto;
	display: inline-block;
}

</style>

<title>Styler Log View</title>

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
				<h6 class="mb-0 text-white lh-100">Styler Log</h6>
				<small>Since 2020</small>
			</div>
		</div>
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">Styler Log</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray"> </p>
			</div>
			<br>
			
			<div class="a_layer">
				<div class="a_content ">
					<h6>날짜를 선택해주세요.</h6>
					<br>
					<input type="date" class="btn btn-secondary"  name="date_Cctv_log" id="date_on">
					<input type="button" class="btn btn-primary" value="확인" id="btn_on">
					 <a href="<c:url value="/styler/stylerLogList"/>"><input type="button" class="btn btn-success" value="로그 DB" id="btn_logDB"/></a>
				</div>
			</div>
			
			<br>
			<div id="dict_table" class="table table-striped"></div>
			<br>
			
			<div> 
			  <a href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home" /></a>
			</div>
		</div>
	</main>
<!-- 메인 컨텐트 끝 -->

<script>
		$(document).ready(function() {
			
			var logData ='';

			$('#btn_on').click(function() {

				var date = $('#date_on').val();

				$.ajax({
					/*url : 'http://192.168.0.24:5000/log/' + date,*/
					url:'http://192.168.0.66:5000/stylerlog/'+date,
					success : function(res) {
						console.log(res)
						if (res == 'Error') {
							$('#dict_table').text('해당하는 날짜에 저장된 로고가 없습니다.');
						} else {
							$('#dict_table').html(res);
							logData = res;
						}
						
						$.ajax({
							
							url: 'writeLog',
							type: 'POST',
							data: {
								stylerLogFile: logData,
								stylerLogDate: date
							},
							success:function(res){
								console.log('success')
							}
							
						});

					},
					error: function(res){
						$('#dict_table').text('다시 시도해주세요.');
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