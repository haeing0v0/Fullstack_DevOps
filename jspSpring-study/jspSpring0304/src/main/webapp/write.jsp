<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글쓰기</title>
</head>
<body>

<h2>공지사항 글쓰기</h2>

<form action="write.do" method="post">
<table border="1">
    <tr>
        <td>제목</td>
        <td><input type="text" name="title" required></td>
    </tr>
    <tr>
        <td>작성자</td>
        <td><input type="text" name="writer" value="Admin"></td>
    </tr>
    <tr>
        <td>내용</td>
        <td><textarea name="content" rows="10" cols="50"></textarea></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="저장">
            <input type="reset" value="다시작성">
        </td>
    </tr>
</table>
</form>

<br>
<a href="list.do">목록보기</a>

</body>
</html>