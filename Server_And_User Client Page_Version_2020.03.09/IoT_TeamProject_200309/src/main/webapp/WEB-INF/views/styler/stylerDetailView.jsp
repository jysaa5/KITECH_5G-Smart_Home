<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Styler Detail View</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->
<script>
</script>
<style>

#home_a{
   text-decoration: none;
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

img.photo {
	width:500px;
}

#tableimg{
text-align: center;
}
</style>

</head>
<body>

<!-- 해더 시작 -->
<%@ include file="/WEB-INF/views/include/header.jsp"%>
<!-- 해더 끝 -->

<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">Styler Detail View</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">Styler Detail View</h6>
			<%-- ${listView} --%>
			<table class="table table-striped">
				    <tr>
					<th>no</th>
					<td>${stylerDetailView.stylerIdx}</td>
					</tr>
					<tr>
					<th>작성 날짜</th>
					<td><fmt:formatDate value="${stylerDetailView.stylerOn}" pattern="yyyy. MM. dd" /></td>
					</tr>
					<tr>
					<th>사용자</th>
					<td>${stylerDetailView.stylerUser}</td>
					<tr>
					<th>제목</th>
					<td>${stylerDetailView.stylerPhoto}</td>
					</tr>
					<tr>
					<th colspan="2">사진</th>
					</tr>
					<tr>
					<td id="tableimg" colspan="2"><img src="<c:url value="/uploadfile/userphoto/${stylerDetailView.stylerPhoto}"/>" class="photo" alt="사진"></td>
					</tr>
				</table>
	    <div>
	    <a id="home_a" href="<c:url value="/styler/stylerList"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="뒤로가기" id="click-home"/></a>
	    </div>
		</div>
	</main>

<!-- 메인 컨텐트 끝 -->

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->


</body>
</html>