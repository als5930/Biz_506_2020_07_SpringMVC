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
<body>
<h3>나의 홈페이지 방문을 환영합니다</h3>
<form method="POST" action="${rootPath}/logout">
	<button>Logout</button>
	<input name="${_csrf.parameterName}" value="${_csrf.token}"></form>

</form>

</body>
</html>