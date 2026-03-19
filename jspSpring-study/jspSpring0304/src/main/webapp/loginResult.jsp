<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>

<c:choose>
    <c:when test="${not empty dto}">
        <h2>${dto.userName}님 로그인 성공</h2>
        <a href="${pageContext.request.contextPath}/member/list.do">회원목록</a><br><br>
        <a href="${pageContext.request.contextPath}/member/logout.do">로그아웃</a>
    </c:when>

    <c:otherwise>
        <h2>로그인 실패</h2>
        <a href="${pageContext.request.contextPath}/member/loginui.do">다시 로그인</a>
    </c:otherwise>
</c:choose>

</body>
</html>