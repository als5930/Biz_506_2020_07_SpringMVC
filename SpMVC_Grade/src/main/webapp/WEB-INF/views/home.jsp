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
	table#gra-list{
		width: 80%;
		margin: 8px auto;
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
	
	tr.gra-tr:hover {
		background-color: #ccc;
	}
	h3{
		text-align: center;
	}

</style>
</head>
<body>
<h3>나의 홈페이지 방문을 환영합니다</h3>
<table id="gra-list">
	<tr >
		<th>일련번호</th>
		<th>학번</th>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>총점</th>
		<th>기타</th>
		
	</tr>
	<c:if test="${empty GRA_LIST}">
		<tr ><td colspan="8">데이터가 없습니다</td>
	</c:if>
	<c:forEach items="${GRA_LIST}" var="gra">
		<tr class="gra-tr">
			<td >${gra.g_num}</td>
			<td>${gra.g_name}</td>
			<td>${gra.g_kor}</td>
			<td>${gra.g_eng}</td>
			<td>${gra.g_math}</td>
			<td>${gra.g_sum}</td>
			
			<td>
			<a href="${rootPath}/update?id=${gra.g_seq}">${gra.g_avg}</a></td>
			<td>
			<a href="${rootPath}/delete?seq=${gra.g_seq}">삭제</a></td>
			</tr>
	</c:forEach>

</table>

<div>
	<button><a id="btn" href="${rootPath}/write">작성</a></button>
	
</div>
</body>
</html>