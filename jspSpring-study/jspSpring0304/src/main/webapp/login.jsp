<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h2>로그인</h2>

<form action="${pageContext.request.contextPath}/member/login.do" method="post">
    아이디 : <input type="text" name="userId"><br><br>
    비밀번호 : <input type="password" name="userPwd"><br><br>
    <input type="submit" value="로그인">
</form>

<br>
<a href="${pageContext.request.contextPath}/member/joinui.do">회원가입</a>

</body>
</html>