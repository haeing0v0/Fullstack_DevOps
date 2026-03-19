<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>

<h2>회원 목록</h2>

<table border="1" width="500">
    <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
    </tr>

    <c:forEach var="m" items="${list}">
        <tr>
            <td>${m.userId}</td>
            <td>${m.userPwd}</td>
            <td>${m.userName}</td>
        </tr>
    </c:forEach>
</table>

<br>
<a href="${pageContext.request.contextPath}/member/joinui.do">회원가입</a> |
<a href="${pageContext.request.contextPath}/member/loginui.do">로그인</a>

</body>
</html>