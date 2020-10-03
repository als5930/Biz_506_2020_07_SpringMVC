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
<link href="${rootPath}/static/css/iolist-list.css?var=2020-09-29-000" rel="stylesheet">
<script src="${rootPath}/static/js/iolist-list.js?ver=2020-09-29-001"></script>
</head>
<body>
<table id="iolist-list">
	<tr>
		<th>NO</th>
		<th>일자</th>
		<th>시각</th>
		<th>상품명</th>
		<th>구분</th>
		<th>단가</th>
		<th>수량</th>
		<th>합계</th>
	</tr>
	</table>
</body>
</html>