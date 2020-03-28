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
<title>CCTV Log List</title>

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
				<h6 class="mb-0 text-white lh-100">CCTV Log</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">CCTV Log</h6>
			<%-- ${listView} --%>
			<table class="table table-striped">
				<tr>
					<th>no</th>
					<th>저장된 시간</th>
					<th>로그 데이터</th>
				</tr>

				<!-- 리스트 시작 -->
				<c:forEach items="${cctvLogListView.list}" var="cctvLog">
				<tr>
					<td>${cctvLog.cctvLogIdx}</td>
					<td>${cctvLog.cctvLogDate}</td>
					<td><a href="<c:url value="/cctv/cctvLogDetailView?cctvLogIdx=${cctvLog.cctvLogIdx}"/>">자세히 보기</a></td>
				</tr>
				</c:forEach>
				<!-- 리스트 끝-->
			</table>

	<%-- 		<div>
				<c:forEach begin="1" end="${cctvListView.totalPageCount}" var="i">
					<a href="<c:url value ="/cctv/userList?page=${i}"/>">[${i}]</a>
				</c:forEach>	
			</div> --%>
			
			<nav aria-label="Page navigation example">
		 	 <ul class="pagination">
		    <li class="page-item">		
		     <c:forEach begin="1" end="${cctvLogListView.totalPageCount}" var="i">
		<li class="page-item"><a  class="page-link"  href="<c:url value ="/cctv/cctvLogList?page=${i}"/>">${i}</a></li>
				</c:forEach>
			
				</ul>	
		    </nav>	
		</div>
		
		<div>
		<a id="home_a" href="<c:url value="/"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="Home" id="click-home"/></a>
		</div>

	</main>
<!-- 메인 컨텐트 끝 -->

<!-- 푸터 시작 -->
<%@ include file="/WEB-INF/views/include/footer.jsp"%>
<!-- 푸터 끝-->


</body>
</html>