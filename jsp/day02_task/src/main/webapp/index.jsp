<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이름 나이를 입력하세요</h1>
	<form action="MyServlet1" method="get">
		<label for="name">이름 : </label>
		<input type="text" id="name" name="userName" placeholder="이름을 입력하세요"><br>
		<label for="age">나이 : </label>
		<input type="number" id="age" name="userAge" placeholder="나이를 입력하세요"><br>
		
		<label for="gender">성별 : </label>
		<input type="radio" id="none" name="gender" value="선택안함">
		<label for="none">선택안함</label>
		<input type="radio" id="male" name="gender" value="남자">
		<label for="male">남자</label>
		<input type="radio" id="female" name="gender" value="여자">
		<label for="female">여자</label><br>
		
		<label>취미 : </label><br>
		<input type="checkbox" name="hobby" value="운동">운동<br>
		<input type="checkbox" name="hobby" value="독서">독서<br>
		<input type="checkbox" name="hobby" value="여행">여행<br>
		<input type="checkbox" name="hobby" value="영화보기">영화보기<br>
		
		<button type="submit">로그인</button>
	</form>
</body>
</html>