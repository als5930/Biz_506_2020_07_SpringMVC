<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<style>
h2 {
	text-align: center;
	margin: 3%;
}

table {
	width: 80%;
	margin: 10px auto;
	border-collapse: collapse;
	border-top: 2px solid #8d8d8d;
}

th {
	padding: 10px 8px; 
	background: #f9f9f9;
	color: #666;
	border-bottom: 1px solid #8d8d8d;
}

td {
	padding: 10px 8px;
	text-align: center;
	line-height: 1.25em;
	color: #666;
	border-bottom: 1px solid #8d8d8d;
	cursor: pointer;

}

tr.bor-tr:hover {
	background-color: #ccc;
}

div.btn {
	width: 90%;
	text-align: right;
}

div.btn button  {
	font-weight: bold;
	border: none;
	background: rgb(18, 184, 134);
	color: white;
	border-radius: 6px;
	padding: 10px 20px;
	font-size: 1rem;
}

.btn button:hover {
	background-color: #aaa;
	color: black;
}
</style>
<script>
document.addEventListener("DOMContentLoaded", function() {
	document.querySelector("#g-save").addEventListener("click",
			function() {
				document.location.href = `${rootPath}/notice/writer`
			})
})

document.addEventListener("DOMContentLoaded", function() {
	document.querySelector(".bor-tr").addEventListener("click",
			function() {
				document.location.href = `${rootPath}/notice/detail`
			})
})

</script>
<body>

	<h2>게시판</h2>
	<table class="table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>날짜</th>
				<th>시간</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>조회수</th>
			</tr>
		</thead>
		<c:if test="${empty noList}">
			<tr>
				<td colspan="7">데이터가 없습니다</td>
		</c:if>
		<c:forEach items="${noList}" var="nolist">
			<tr class="bor-tr" data-id="${nolist.id}">
				<td>${nolist.id}</td>
				<td>${nolist.n_date}</td>
				<td>${nolist.n_time}</td>
				<td>${nolist.n_writer}</td>
				<td>${nolist.n_subject}</td>
				<td>${nolist.n_text}</td>
				<td>${nolist.n_count}</td>
			</tr>
		</c:forEach>
	</table>

	<div class="btn">
		<button id="g-save">작성</button>
	</div>