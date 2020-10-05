<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         <c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
 <meta name='viewport' content='width=device-width, initial-scale=1'>
<title>나의 홈페이지</title>
<<<<<<< HEAD

<link href="${rootPath}/static/css/main-iolist.css?var=2020-09-29-001" rel="stylesheet" />
<link href="${rootPath}/static/css/main-nav.css?var=2020-09-29-007" rel="stylesheet" />

<link href="${rootPath}/static/css/iolist.css?var=2020-09-29-003" rel="stylesheet" />
</head>

=======
<<<<<<< HEAD
<link href="${rootPath}/static/css/main-iolist.css?var=2020-09-29-001" rel="stylesheet" />
<link href="${rootPath}/static/css/main-nav.css?var=2020-09-29-005" rel="stylesheet" />
=======
<link href="${rootPath}/static/css/iolist.css?var=2020-09-29-003" rel="stylesheet" />
</head>
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
>>>>>>> 9f22fccf837c44d729604b9a02b66496b7c0f421
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script>
    var rootPath ="${rootPath}"
    </script>
<<<<<<< HEAD

     <script src="${rootPath}/static/js/main-nav.js?var=2020-09-29-007"></script>
</head>
=======
<<<<<<< HEAD
     <script src="${rootPath}/static/js/main-nav.js?var=2020-09-29-001"></script>
</head>
<body>
<header>
 <h1>Loo9 샵의 매입매출</h1>
    </header>
=======
     <script src="${rootPath}/static/js/main-nav.js?var=2020-09-29-002"></script>
>>>>>>> 9f22fccf837c44d729604b9a02b66496b7c0f421
<body>
<header>
 <h1>Loo9 샵의 매입매출</h1>
<<<<<<< HEAD
    </header>

 

=======
    
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
>>>>>>> 9f22fccf837c44d729604b9a02b66496b7c0f421
    <nav id="main-nav">
      <ul>
        <li id="menu-home">home</li>
        <li id="menu-iolist">정보보기</li>
        <li id="menu-home">검색</li>
        <li id="menu-join">회원가입</li>
        <li id="menu-login">로그인</li>
        <li id="menu-logout">로그아웃</li>
      </ul>
    </nav>
     <section id="main-section">
      <c:choose>
         <c:when test="${BODY == 'IOLIST-LIST'}">
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 9f22fccf837c44d729604b9a02b66496b7c0f421
            <%@ include file="/WEB-INF/views/iolist-list/list.jsp"%>
         </c:when>
          <c:when test="${BODY == 'IOLIST-WRITE'}">
            <%@ include file="/WEB-INF/views/iolist-list/write.jsp"%>
         </c:when>
          <c:when test="${BODY == 'IOLIST-DETAIL'}">
            <%@ include file="/WEB-INF/views/iolist-list/detail.jsp"%>
         </c:when>
  
<<<<<<< HEAD
			<c:when test="${BODY == 'IOLIST-WRITE'}">
            <%@ include file="/WEB-INF/views/iolist-list/iolist-list.jsp"%>
         </c:when>

=======
=======
            <%@ include file="/WEB-INF/views/iolist-list/iolist-list.jsp"%>
         </c:when>
>>>>>>> b5f9a619524354a73346db20cb1209b68e3c08d8
>>>>>>> 9f22fccf837c44d729604b9a02b66496b7c0f421
    </c:choose>
    </section>
    <footer>
      <address>copyRight &copy; als3478@naver.com</address>
    </footer>
  </body>
</html>