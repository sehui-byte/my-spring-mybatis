<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

</head>
<body>
	<form id="loginForm" name="loginForm" method="post"
		action="loginChk.do">
		<table border="1" width="400px">
			<tr>
				<td>아이디</td>
				<td><input type="text" id="email" name="email" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" id="pw" name="pw" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">로그인</button> <c:if test="${msg == 'failure'}">
						<div style="color: red">아이디 또는 비밀번호가 일치하지 않습니다.</div>
					</c:if> <c:if test="${msg == 'logout'}">
						<div style="color: red">로그아웃되었습니다</div>
					</c:if>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>