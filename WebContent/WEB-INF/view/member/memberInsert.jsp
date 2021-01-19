<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<!-- 일련번호, 이름, 이메일, 비번, 우편번호, 주소, 생년월일, 
회원레벨, 가입날짜, 정보수정날짜, 탈퇴여부 -->

<form id="memberForm" name="memberForm" method="POST" action="memberInsert2.do">
<input type="text" id="name" name="name" placeholder="이름"/>
<input type="email" id="email" name="email" placeholder="이메일"/>
<input type ="password" id ="pw" name="pw" placeholder="비밀번호"/>
<input type ="password" id="pwChk" name="pwChk" placeholder="비밀번호 확인"/>
<input type="text" id="zipcode" name="zipcode" placeholder="우편번호"/>
<input type="text" id="addr" name="addr" placeholder="주소"/>
<input type="text" id="extraAddr" name="extraAddr" placeholder="나머지 주소"/>
<input type="text" id="birth" name="birth" placeholder="생년월일"/>
<input type="hidden" id="level" name="level" value="N"/>
<button type="submit">회원가입</button>
</form>
</body>
</html>