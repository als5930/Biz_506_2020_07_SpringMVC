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
</head>
<style>

 input {
      flex: 5;
      width: 20%;
      border: 1px solid #ddd;
      margin: 5px;
      padding: 8px;
     
      
    }
    button {
      background-color: violet;
      cursor: pointer;
      vertical-align: middle;

      padding: 8px;
    }

    button:hover {
      border-bottom: 3px solid skyblue;
    }
h4#login-fail{
	margin: 5px auto;
	background-color: red;
	color: yellow;
	border-radius: 15px;
	padding: 8px;
}

</style>
 <body>
    <form action="${rootPath}/login" method="POST">
      <h2>로그인</h2>
		
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		
		<h4 id="login-fail">${SPRING_SECURITY_LAST_EXCEPTION.message}</h4>
		<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session"/>
		</c:if>
		
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
      <input name="username" placeholder="사용자 ID" />
      
      <input name="password" type="password" placeholder="비밀번호" />
      <button>로그인</button>
    </form>
  </body>
</html>
