<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<body>

<h2>공지사항 상세</h2>

<table border="1" width="700">
    <tr>
        <td width="100">번호</td>
        <td>${dto.id}</td>
    </tr>
    <tr>
        <td>제목</td>
        <td>${dto.title}</td>
    </tr>
    <tr>
        <td>작성자</td>
        <td>${dto.writer}</td>
    </tr>
    <tr>
        <td>작성일</td>
        <td>${dto.regDate}</td>
    </tr>
    <tr>
        <td>조회수</td>
        <td>${dto.hit}</td>
    </tr>
    <tr>
        <td>내용</td>
        <td style="white-space:pre-wrap;">${dto.content}</td>
    </tr>
</table>

<br>
<a href="list.do">목록</a>
<a href="updateui.do?id=${dto.id}">수정</a>
<a href="delete.do?id=${dto.id}">삭제</a>

</body>
</html>