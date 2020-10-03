<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>나의 홈페이지</title>
<link href="${rootPath}/static/css/iolist-write.css?var=2020-09-29-007" rel="stylesheet" />
 <script src="${rootPath}/static/js/iolist-write.js?var=2020-09-29-003"></script>
</head>
<body>
	<form id="iolist" method="POST">
		<fieldset>
			<legend>매입매출리스트</legend>
			<div>
				<label for="io_pname">상품명</label> <input id="io_pname" name="io_pname"placeholder="상품명" value="${IolistVO.io_pname}"/>
			</div>

			<div>
				<label for="io_input">구분</label> <input id="io_input" name="io_input" placeholder="구분" value="${IolistVO.io_input}"/>
			</div>
			<div>
				<label for="io_price">단가</label> <input id="io_price" name="io_price"  placeholder="단가" value="${IolistVO.io_price}"/>
			</div>

			<div>
				<label for="io_quan">수량</label> <input id="io_quan" name="io_quan"  placeholder="수량" value="${IolistVO.io_quan}"/>
			</div>

			<div>
				<label for="io_total">합계</label> <input id="io_total" name="io_total"  placeholder="합계" value="${IolistVO.io_total}"/>
			</div>
			<div>
				<label for="seq"></label> <input type="hidden" id="seq" name="seq"  placeholder="seq" value="${IolistVO.seq}"/>
			</div>
			<div>
				<label for="io_date"></label> <input type="hidden"  id="iio_date" name="io_date"  placeholder="일자" value="${IolistVO.io_date}"/>
			</div>
			<div>
				<label for="io_time"></label> <input type="hidden"  id="io_time" name="io_time"  placeholder="시간" value="${IolistVO.io_time}"/>
			</div>
			


			<div class="button-box">
				<button id="btn-save" type="button">저장</button>

			</div>
		</fieldset>
		</form>
</body>
</html>