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
   form#write-form {
      width:80%;
      margin: 10px auto;
   }
   form#write-form fieldset{

      border-radius: 10px;
      
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
      width: 70%;
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
	
	button#save{
		background-color: brown ;
		
	}

</style>


<form id="write-form" method="POST">
   <fieldset>
  
      <div>
         <label>작성일자</label>
         <input name="n_date">
      </div>
      <div>
         <label>작성시간</label>
         <input name="n_time">
      </div>
      
      <div>
         <label>작성자</label>
         <input name="n_writer">
      </div>
      
      <div>
         <label>제목</label>
         <input name="n_subject">
      </div>
      <div>
         <label>내용</label>
         <input name ="n_text">
        <!-- <textarea id="n_content" rows="5" cols="20" name="n_content"></textarea> -->
         
      </div>
      
      
      <div class="button-box">
      	<button type="button" id ="list">리스트</button>
      	<button type="submit" id ="save">저장</button>
      
      </div>
   </fieldset>
</form>
