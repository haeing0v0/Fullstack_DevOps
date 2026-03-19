<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>

<h2>공지사항 수정</h2>

<form action="update.do" method="post">
<input type="hidden" name="id" value="${dto.id}">

<table border="1">
    <tr>
        <td>제목</td>
        <td><input type="text" name="title" value="${dto.title}" required></td>
    </tr>
    <tr>
        <td>내용</td>
        <td><textarea name="content" rows="10" cols="50">${dto.content}</textarea></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="수정완료">
            <input type="reset" value="원래대로">
        </td>
    </tr>
</table>

</form>

<br>
<a href="detail.do?id=${dto.id}">취소</a>
<a href="list.do">목록</a>

</body>
</html>