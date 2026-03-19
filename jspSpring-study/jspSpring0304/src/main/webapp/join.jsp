<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<h2>회원가입</h2>

<form action="${pageContext.request.contextPath}/member/join.do" method="post">
    아이디 : <input type="text" name="userId"><br><br>
    비밀번호 : <input type="password" name="userPwd"><br><br>
    이름 : <input type="text" name="userName"><br><br>
    <input type="submit" value="가입하기">
</form>

<br>
<a href="${pageContext.request.contextPath}/member/loginui.do">로그인</a>

</body>
</html>