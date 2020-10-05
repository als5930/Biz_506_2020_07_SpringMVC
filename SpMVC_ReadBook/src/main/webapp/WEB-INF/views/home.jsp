<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />        
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Read Book 2020</title>
<<<<<<< HEAD
      <link href="${rootPath}/static/css/index.css?var=2020-09-25-002" rel="stylesheet" />
=======
      <link href="${rootPath}/static/css/index.css?var=2020-09-25-005" rel="stylesheet" />
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
    <script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script>
    var rootPath ="${rootPath}"
    </script>
<<<<<<< HEAD
		 <script src="${rootPath}/static/js/main-nav.js?var=2020-09-25-007"></script>
=======
		 <script src="${rootPath}/static/js/main-nav.js?var=2020-09-25-010"></script>
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
  </head>
  <body>
   <header>
      <h1>Read Book 2020</h1>
      <h5>책속에 길이 있다네!! 정말로??</h5>
   </header>
   <nav id="main-nav">
      <ul>
         <li id ="menu-home">Read Book</li>
         <li id = "menu-books">도서정보</li>
         <li id = "menu-read-book">독서록</li>
         <li >네이버 검색</li>
<<<<<<< HEAD
         <li id = "menu-join">회원가입</li>
         <li id = "menu-login">로그인</li>
         <li id = "menu-mypage">마이페이지</li>
         <li id = "menu-logout">로그아웃</li>
=======
         
         <sec:authorize access="isAnonymous()">
         <li id = "menu-join">회원가입</li>
         <li id = "menu-login">로그인</li>
         </sec:authorize>
         <sec:authorize access="isAuthenticated()">
         <li id = "menu-mypage">마이페이지</li>
         <li><form:form action="${rootPath}/logout" method="POST"><button>로그아웃</button></form:form></li>         
         </sec:authorize>
         <sec:authorize access="hasRole('ADMIN')">
         <li>관리자</li>
         </sec:authorize>
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
      </ul>
   </nav>
   <section id="main-section">
      <c:choose>
         <c:when test="${BODY == 'BOOK-LIST'}">
            <%@ include file="/WEB-INF/views/books/book-list.jsp"%>
         </c:when>
<<<<<<< HEAD

         <c:when test="${BODY == 'BOOK-WRITE'}">
            <%@ include file="/WEB-INF/views/books/book-write.jsp"%>
         </c:when>

         <c:when test="${BODY == 'BOOK-DETAIL'}">
            <%@ include file="/WEB-INF/views/books/book-detail.jsp"%>
         </c:when>

=======

         <c:when test="${BODY == 'BOOK-WRITE'}">
            <%@ include file="/WEB-INF/views/books/book-write.jsp"%>
         </c:when>

         <c:when test="${BODY == 'BOOK-DETAIL'}">
            <%@ include file="/WEB-INF/views/books/book-detail.jsp"%>
         </c:when>
         <c:when test="${BODY == 'MEMBER-JOIN'}">
         	<%@ include file ="/WEB-INF/views/member/member-write.jsp" %>
         </c:when>

>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
         <c:otherwise>
         <%@ include file="/WEB-INF/views/main-body.jsp" %>
         </c:otherwise>
    	
    </c:choose>
    
    </section>
    <footer>
      <address>copyRight &copy; als3478@naver.com</address>
    </footer>
  </body>
<<<<<<< HEAD
</html>
=======
</html>
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
