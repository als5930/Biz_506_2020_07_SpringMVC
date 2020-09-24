<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />        
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Read Book 2020</title>
      <link href="${rootPath}/static/css/index.css?var=2020-09-24" rel="stylesheet" />
    <script src="https://code.jquery.com/jquery-latest.min.js?var=2020-09-24-000"></script>
    <script>
    var rootPath ="${rootPath}"
    </script>
		 <script src="${rootPath}/static/js/main-nav.js"></script>
  </head>
  <body>
    <header>
      <h1>Read Book 2020</h1>
      <h5>책속에 길이 있다네!! 정말로???</h5>
    </header>
    <nav id="main-nav">
      <ul>
        <li>Read Book</li>
        <li>도서정보</li>
        <li>독서록</li>
        <li>네이버검색</li>
        <li>회원가입</li>
        <li>로그인</li>
        <li>마이페이지</li>
        <li>로그아웃</li>
      </ul>
    </nav>
    <section id="main-section">
    <c:choose>
    	<c:when test="${BODY == 'BOOK-LIST'}">
    		<%@ include file="/WEB-INF/views/books/book-list.jsp" %>
    	</c:when>
    	<c:when test="${BODY == 'BOOK-WRITE'}">
    		<%@ include file="/WEB-INF/views/books/book-write.jsp" %>
    	</c:when>
    	<c:when test="${BODY == 'BOOK-DETAIL'}">
    		<%@ include file="/WEB-INF/views/books/book-detail.jsp" %>
    	</c:when>
    	
    </c:choose>
    
    
 
    
    
    </section>
    <footer>
      <address>copyRight &copy; als3478@naver.com</address>
    </footer>
  </body>
</html>
