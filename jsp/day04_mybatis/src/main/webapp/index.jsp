<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	<form action="MyServlet" method="get">
		<label for="id">아이디 : </label>
		<input type="text" id="id" name="userId" placeholder="아이디를 입력하세요"><br>
		
		<label for="pw">비밀번호 : </label>
		<input type="password" id="pw" name="userPw" placeholder="비밀번호를 입력하세요"><br>
		
		<label for="name">이름 : </label>
		<input type="text" id="name" name="userName" placeholder="이름을 입력하세요"><br>
		
		<label for="age">나이 : </label>
		<input type="text" id="age" name="userAge" placeholder="나이를 입력하세요"><br>

		<label for="gender">성별 : </label>
		<input type="radio" id="none" name="userGender" value="N">
		<label for="none">선택안함</label>
		<input type="radio" id="male" name="userGender" value="M">
		<label for="male">남자</label>
		<input type="radio" id="female" name="userGender" value="F">
		<label for="female">여자</label><br>
		
		<button type="submit">회원가입</button>
	</form>
</body>
</html>