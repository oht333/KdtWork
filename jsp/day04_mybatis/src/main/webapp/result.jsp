<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
<body>
	<h1>회원가입이 되었습니다</h1>
	<p>아이디 : <%= request.getAttribute("userId") %></p>
	<p>비밀번호 : <%= request.getAttribute("userPw") %></p>
	<p>이름 : <%= request.getAttribute("userName") %></p>
	<p>나이 : <%= request.getAttribute("userAge") %></p>
	<p>성별 : ${userGender}</p>
</body>
</html>