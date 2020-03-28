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
<title>Styler List</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->
<script>
</script>

<style>

#home_a1, #home_a2{
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
				<h6 class="mb-0 text-white lh-100">Styler List</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">Styler List</h6>
			<%-- ${listView} --%>
			<table class="table table-striped">
				<tr>
					<th>no</th>
					<th>사용자</th>
					<th>사진 제목</th>
					<th>스타일</th>
					<th>촬영 날짜</th>
				</tr>

<!-- 리스트 시작 -->
	         
				<c:forEach items="${stylerListView.list}" var="stylerPhotoView">
			    <tr>
						<td>${stylerPhotoView.stylerIdx}</td>
						<td>${stylerPhotoView.stylerUser}</td>
						<td><a href="<c:url value="/styler/stylerDetailView?stylerIdx=${stylerPhotoView.stylerIdx}"/>">${stylerPhotoView.stylerPhoto}</a></td>
						<td>
						<c:choose>
					<c:when test = "${stylerPhotoView.stylerPhoto == 'default.png'}">
					사진이 없습니다.
					</c:when>
					<c:otherwise>
					<img src="<c:url value="/uploadfile/userphoto/${stylerPhotoView.stylerPhoto}" />" class="photo" alt="사진" width="200" height="140">
					</c:otherwise>					
					</c:choose>
				</td>
						<td><fmt:formatDate value="${stylerPhotoView.stylerOn}" pattern="yyyy. MM. dd" /></td>
				</tr>
				</c:forEach>
			</table>
<!-- 리스트 끝-->

<%-- 			<div>
				<c:forEach begin="1" end="${stylerListView.totalPageCount}" var="i">
					<a  href="<c:url value ="/styler/stylerList?page=${i}"/>">[${i}]</a>
				</c:forEach>	
			</div> --%>
			
			<nav aria-label="Page navigation example">
		 	 <ul class="pagination">
		    <li class="page-item">		
		     <c:forEach begin="1" end="${stylerListView.totalPageCount}" var="i">
		 <li class="page-item"><a  class="page-link"  href="<c:url value ="/styler/stylerList?page=${i}"/>">${i}</a></li>
				</c:forEach>
				</ul>	
		    </nav>
			
		</div>
		
		<br>
		<div>
		<a id="home_a1" href="<c:url value="/styler/recommendation"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="오늘의 스타일" id="click-home"/></a>
		</div>
		
		<br>
		<div>
		<a id="home_a2" href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home"/></a>
		</div>

	</main>

<!-- 메인 컨텐트 끝 -->

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->


</body>
</html>