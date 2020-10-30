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
 form#write-form {
      width:80%;
      margin: 10px auto;
   }
   form#write-form fieldset{
      border: 1px solid purple;
      border-radius: 10px;
      
   }
   form#write-form legend{
   	  
      color:purple;
      margin: 5px;
      padding: 5px;
   }
   form#write-form label{
      display: inline-block;
      width: 20%;
      padding: 4px;
      margin: 4px;
      color: purple;
      text-align: right;
      font-weight: bold;
   }
   form#write-form input{
      display: inline-block;
      width: 70%;
      padding: 4px;
      margin: 4px;
   }
   form#write-form textarea {
      width: 70%
   }
   
   div.button-box{
   		text-align: right;
   }
   
   form#write-form .button-box button{
   	color: white;
   	cursor: pointer;
   	outline: 0;
   	border: 0;
   	padding: 10px 16px;
   	margin: 5px;
   	border-radius: 5px;
   }
   
   button:hover{
   	box-shadow: 2px 2px 2px rbga(0,0,0,0.5);
   }
	button#list{
		background-color: orange;
		
		
	}
	</style>


</head>
<body>
<h3>나의 홈페이지 방문을 환영합니다</h3>

<form method="POST" id="write-form">
		<div>
		<input type="hidden" name="g_seq" value="${GRADE.g_seq}">
		</div>
		<div>
			<label>학번</label> 
			<input  name="g_num" value="${GRADE.g_num}">
		</div>
			<div>
			<label>이름</label> 
			<input name="g_name" value="${GRADE.g_name}">
		</div>
			<div>
			<label>국어</label> 
			<input name="g_kor" value="${GRADE.g_kor}">
		</div>
			<div>
			<label>영어</label> 
			<input name="g_eng" value="${GRADE.g_eng}">
		</div>
			<div>
			<label>수학</label> 
			<input name="g_math" value="${GRADE.g_math}">
		
		</div>
		<div class="button-box">
			<button id="list">저장</button>
		</div>
		</form>


</body>
</html>