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
<link href="${rootPath}/static/css/nav.css" rel="stylesheet" />
<script>
document.addEventListener("DOMContentLoaded", function() {
	document.querySelector("#menu-notlist").addEventListener("click",
			function() {
			
				document.location.href = `${rootPath}/notice/list`
			})
})


</script>
<body>
    <nav id="main-nav">
		<ul>
			<li id="menu-home">HOME</li>
			<li id="menu-notlist">자유게시판</li>
			<li id="menu-join">회원가입</li>
			<li id="menu-login">로그인</li>
			<li id="menu-mypage">마이페이지</li>
			<li id="menu-logout">로그아웃</li>
		</ul>
	</nav>
</body>
</html>