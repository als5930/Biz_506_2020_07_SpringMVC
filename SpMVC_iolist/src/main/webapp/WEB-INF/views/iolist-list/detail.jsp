<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link href="${rootPath}/static/css/detail.css?var=2020-09-29-007" rel="stylesheet" />
</head>
<body>
	<table id="iolist-detail">
	
	
		<tr>
			<td>일자</td>
			<th>${IolistVO.io_date}</th>
		</tr>
		<tr>
			<td>시간</td>
			<th>${IolistVO.io_time}</th>
		</tr>
		<tr>
			<td>상품명</td>
			<th>${IolistVO.io_pname}</th>
		</tr>

		<tr>
			<td>구분</td>
			<th>${IolistVO.io_input}</th>
		</tr>
		<tr>
			<td>단가</td>
			<th>${IolistVO.io_quan}</th>
		</tr>

		<tr>
			<td>수량</td>
			<th>${IolistVO.io_price}</th>
		</tr>
		<tr>
			<td>합계</td>
			<th>${IolistVO.io_total}</th>
		</tr>
	</table>

	<section id="iolist-body">
		<a href="${rootPath}/list">리스트</a> <a
			href="${rootPath}/update?id=${IolistVO.seq}">수정</a> <a
			href="${rootPath}/delete?seq=${IolistVO.seq}" id ="io_delete">삭제</a>
	</section>