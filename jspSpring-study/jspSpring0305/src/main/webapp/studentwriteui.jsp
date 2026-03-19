<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가</title>
</head>
<body>
<h1>학생 추가</h1>
<hr>
<form action="studentwrite.do" method="post">
	<ul>
		<li>
			<label>이름</label>
			<input type="text" name="username">
		</li>
		<li>
			<label>대학</label>
			<input type="text" name="univ">
		</li>
		<li>
			<label>생일</label>
			<input type="text" name="birth">
		</li>
		<li>
			<label>이메일</label>
			<input type="text" name="email">
		</li>
		<li>
			<button type="submit">등록</button>
		</li>
	</ul>
</form>
</body>
</html>