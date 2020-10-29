<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         <c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta name='viewport' content='width=device-width, initial-scale=1'>
<title>나의 홈페이지</title>

<style>
	table#ems-list{
		width: 80%;
		margin: 10px auto;
		border-collapse: collapse;
		border: 1px solid #aaa;
	}
	
	
	td,th{
		border: 1px solid #ccc;
		
	}
	button {
		cursor: pointer;
		background-color: violet;
		float: right;
		margin: 10px;
		padding: 10px;
	}
	#btn{
		color: white;
	}
	
	tr.ems-tr:hover {
		background-color: #ccc;
	}
	h3{
		text-align: center;
	}

</style>
</head>
<body>
<h3>나의 홈페이지 방문을 환영합니다</h3>
<table id="ems-list">
	<tr >
		<th>발송Email</th>
		<th>수신Email</th>
		<th>발송일자</th>
		<th>발송시각</th>
		<th>제목</th>
		<th>내용</th>
		<th>삭제</th>
	</tr>
	<c:if test="${empty EMS_LIST}">
		<tr ><td colspan="8">데이터가 없습니다</td>
	</c:if>
	<c:forEach items="${EMS_LIST}" var="ems">
		<tr class="ems-tr">
			<td >${ems.from_email}</td>
			<td>${ems.to_email}</td>
			<td>${ems.s_date}</td>
			<td>${ems.s_time}</td>
			<td>
			<a href="${rootPath}/update?id=${ems.id}">${ems.s_subject}</a></td>
			
			<td>${ems.s_content}</td>
			
			
			<td>
			<a href="${rootPath}/delete?id=${ems.id}">삭제</a></td>
			</tr>
	</c:forEach>

</table>

<div>
	<button><a id="btn" href="${rootPath}/write">메일작성</a></button>
</div>
</body>
</html>