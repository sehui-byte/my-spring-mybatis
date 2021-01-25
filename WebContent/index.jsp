<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAIN</title>
</head>
<body>
	welcome!
	<br>
	<c:if test="${msg =='success'}">
		<h3>${sessionScope.userid}님환영합니다.</h3>
		<a href="logout.do">로그아웃</a>
	</c:if>
	<c:if test="${sessionScope.userid == null}">
		<a href="join.do">회원가입</a><br>
		<a href="login.do">로그인</a>
	</c:if>
</body>
</html>