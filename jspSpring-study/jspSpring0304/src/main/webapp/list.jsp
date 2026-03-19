<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
</head>
<body>

<h2>공지사항 목록</h2>

<table border="1" width="700">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
    </tr>

    <c:forEach var="notice" items="${list}">
        <tr>
            <td>${notice.id}</td>
            <td>
                <a href="detail.do?id=${notice.id}">
                    ${notice.title}
                </a>
            </td>
            <td>${notice.writer}</td>
            <td>${notice.regDate}</td>
            <td>${notice.hit}</td>
        </tr>
    </c:forEach>

</table>

<br>
<a href="writeui.do">글쓰기</a>

</body>
</html>