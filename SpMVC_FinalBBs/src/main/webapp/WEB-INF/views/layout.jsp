<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
         <c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="nav" />
<section id="content">
<tiles:insertAttribute name="content" />
</section>
<tiles:insertAttribute name="footer" />

</body>
</html>
