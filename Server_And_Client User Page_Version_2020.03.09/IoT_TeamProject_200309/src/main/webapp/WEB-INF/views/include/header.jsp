<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page trimDirectiveWhitespaces="true"%>
<script>

</script>

<style>
    .nav-link{
    margin: 0 30px
    }
    
    .navbar-brand{
    font-size: 2em;
    font-style: italic;
    padding: 0 10px;
    }
    a.a-line{
     text-decoration:none;
     color: #646464
    }
</style>

	<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
		<h5 class="my-0 mr-md-auto font-weight-normal"><a href="<c:url value="/"/>" class="a-line">
		
		<svg class="bi bi-house-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M8 3.293l6 6V13.5a1.5 1.5 0 01-1.5 1.5h-9A1.5 1.5 0 012 13.5V9.293l6-6zm5-.793V6l-2-2V2.5a.5.5 0 01.5-.5h1a.5.5 0 01.5.5z" clip-rule="evenodd"/>
  <path fill-rule="evenodd" d="M7.293 1.5a1 1 0 011.414 0l6.647 6.646a.5.5 0 01-.708.708L8 2.207 1.354 8.854a.5.5 0 11-.708-.708L7.293 1.5z" clip-rule="evenodd"/>
</svg>
		5G
		
		</a></h5>
		
		<nav class="my-2 my-md-0 mr-md-3">
			<a class="p-2 text-dark" href="<c:url value="/cctv/userCctv"/>">CCTV</a> 
			<a class="p-2 text-dark" href="<c:url value="/led/userLed"/>">LED</a> 
			<a class="p-2 text-dark" href="<c:url value="/styler/userStyler"/>">Styler</a> 
			<a class="p-2 text-dark" href="<c:url value="/history/userSelectLog"/>">My History</a>
		</nav>
		<a class="btn btn-outline-primary" href="<c:url value="/"/>">Home</a>
	</div>