<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${rootPath}/static/js/iolist-detail.js?var=2020-09-29-004"></script>

<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<section>
	<h3>매입 매출 리스트</h3>
	<table id="iolist-table">
		<tr>
			<th>SEQ</th>
			<th>일자</th>
			<th>시각</th>
			<th>구분</th>
			<th>상품명</th>
			<th>단가</th>
			<th>수량</th>
			<th>합계</th>
		</tr>
		<c:choose>
			<c:when test="${empty IOLIST}">
				<tr>
					<td colspan="8">데이터가 없음</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${IOLIST}" var="iolist" varStatus="i">
					<tr class ="io_item" data-seq="${iolist.seq}">
						<td>${i.count}</td>
						<td>${iolist.io_date}</td>
						<td>${iolist.io_time}</td>
						<td>${iolist.io_input}</td>
						<td>${iolist.io_pname}</td>
						<td>${iolist.io_price}</td>
						<td>${iolist.io_quan}</td>
						<td>${iolist.io_total}</td>

					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>

	<div id="iolist-box">
		<a href="${rootPath}/input">새로작성</a>
	</div>


</section>
