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
section#ems-detail-header {
	width: 50%;
	
	margin: 20px auto;
	display: flex;
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5)
}
section#ems-detail-header article:first-child {
	flex: 1;
}
section#ems-detail-header article:last-child {
	flex: 2;
}
section#ems-detail-header div {
	margin: 5px;
	padding: 10px;
	border-bottom: 1px solid #ddd
}
section#ems-detail-header .title {
	
	width: 25%;
	background-color: #ddd;
	font-weight: bold;
	text-align: right;
}
section#ems-detail-header .content {
	background-color: #ddd;
	font-weight: bold;
	text-align: right;
	width: 25%;
}
section#ems-detail-header img {
	margin: 5px;
	border-radius: 5px;
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5)
}
section#ems-detail-body {
	width: 50%;
	margin: 10px auto;
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5)
}
section#ems-button-box {
	width: 50%;
	margin: 10px auto;
	text-align: right;
}
section#ems-button-box button {
	margin: 10px;
	padding: 10px 16px;
	border: 0;
	outline: 0;
	border-radius: 5px;
	color: white;
	font-weight: bold;
}
/* button.bbs-list */
section#ems-button-box button:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.6);
}
section#ems-button-box button:nth-child(1) {
	background-color: orange;
}
section#ems-button-box button:nth-child(2) {
	background-color: skyblue;
}
section#ems-button-box button:nth-child(3) {
	background-color: violet;
}

</style>
</head>
<body>

<section  id="ems-detail-header">
	<article>

<div class="title">보내는 Email : ${from_email}</div>
<div class="content">받는 Email :${to_email}</div>
<div class="title">보내는 날짜 :${EMS.s_date}</div>
<div class="content">보내는 시각 :${EMS.s_time}</div>
<div class="title">제목 :${s_subject }</div>
<div class="content">내용 :${EMS.s_content}</div>
</article>
</section>
</body>

<section id="ems-detail-body">${EMSVO.s_content}</section>
<section id="ems-button-box">
	<button class="list"><a href="${rootPath}/">처음으로</a></button>
	<button class="update">수정</button>
	<button class="delete">삭제</button>
</section>


</html>