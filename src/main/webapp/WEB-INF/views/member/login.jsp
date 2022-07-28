<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<title>로그인</title>

<!-- 부트스트랩,제이쿼리 -->
<meta name="viewprot" content="width=device-width=device-width,initial-scale=1">
<link rel="stylesheet"
          href="<c:url value="/resources/user/css/bootstrap.min.css"/>">
<script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>


<%@ include file="../includes/header.jsp"%>

</head>

<!-- login form  -->
<body>
	<div class="container">
       <div class="col-lg-4"></div>
       <div class="col-lg-4">
       <div class="jumbotron" style="padding-top:20px;">
       
       <form action="loginpros.do" method="post">
     
       <br>
       
       <div class="form-group">
       <input type="text" class="form-control" placeholder="사용자 아이디" name="userid">
       </div>
       
       <div class="form-group">
       <input type="password" class="form-control" placeholder="비밀번호" name="userpw">
       </div>
       
       <div class="form-group">
       <input type="submit" class="form-control" style="background-color:pink; color:white;" value="로그인">
        </div>
        
         
        <div class="form-group">
       <a href="memberjoin" class="form-control" style="background-color:pink; text-align:center; color:white;">회원가입</a>
       </div>

        </form>
       
        
       </div>
     </div>
   </div>
   
	<c:if test="${msg=='error'}">
	<script type=text/javascipt>
	alert('틀림');
    </script>
	</c:if>
	
</body>
</html>

<%@ include file="../includes/footer.jsp"%>