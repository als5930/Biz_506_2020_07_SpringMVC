<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var = "rootPath" value ="${pageContext.request.contextPath}"/>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
section#not-detail-header {
  width: 50%;
  margin: 20px auto;
  display: flex;
  box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5);
}
section#not-detail-header article:first-child {
  flex: 1;
}
section#not-detail-header article:last-child {
  flex: 2;
}
section#not-detail-header div {
  margin: 5px;
  padding: 10px;
  border-bottom: 1px solid #ddd;
}
section#not-detail-header .title {
  display: inline-block;
  width: 25%;
  background-color: #ddd;
  font-weight: bold;
  text-align: right;
}
section#not-detail-header .content {
 display: inline-block;
  width: 25%;
  width: 25%;
  background-color: #ddd;
  font-weight: bold;
  text-align: right;
}
section#not-detail-body {
  width: 50%;
  margin: 10px auto;
  box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.5);
}
section#not-button-box {
  width: 50%;
  margin: 10px auto;
  text-align: right;
 
}
section#not-button-box button {
  margin: 10px;
  padding: 10px 16px;
  border: 0;
  outline: 0;
  border-radius: 5px;
  color: white;
  font-weight: bold;
   cursor: pointer;
}
/* button.bbs-list */
section#not-button-box button:hover {
  box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.6);
}
section#not-button-box button:nth-child(1) {
  background-color: orange;
}
section#not-button-box button:nth-child(2) {
  background-color: skyblue;
}
section#not-button-box button:nth-child(3) {
  background-color: violet;
}
h2 {
  text-align: center;
  color: violet;
}
</style>
<script>
$(function() {
	$(".not-list").click(function() {
		document.location.href = "${rootPath}/bbs/list"
	})
	$(".update").click(function() {
		let seq = ${BbsVO.b_seq}
		document.location.href = "${rootPath}/bbs/update/" + seq
	})
	$(".delete").click(function() {
		let seq = ${BbsVO.b_seq}
		document.location.href = "${rootPath}/bbs/delete/" + seq
	})
})
</script>
<body>
<section id="not-detail-header">
	<article>
		<h2>게시판</h2>
		<div class="title">작성자</div>
		<th>${NoticeVO.n_writer}</th>
		<hr />
		<div class="content">제목</div>
		<th>${NoticeVO.n_subject}</th>
		<hr />
		<div class="title">날짜</div>
		<th>${NoticeVO.n_date}</th>
		<hr />
		<div class="content">시간</div>
		<th>${NoticeVO.n_time}</th>
		<hr />
		
		<div class="title">내용</div>
		<th>${BbsVO.b_content}</th>
	</article>
</section>
<section id="team-button-box">
	<button class="not-list">리스트</button>
	<c:if test=""></c:if>
	<button class="update">수정</button>
	<button class="delete">삭제</button>
</section>
</body>
</html>