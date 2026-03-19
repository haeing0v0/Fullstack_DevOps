<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보</title>
</head>
<body>
<h2>학생정보</h2>
<hr>
<table border="1">
	<tr><th>id</th><th>이름</th><th>대학</th><th>생일</th><th>이메일</th></tr>
	<c:forEach var="st" items="${students}">
		<tr>
			<td>${st.id}</td><td>${st.username}</td><td>${st.univ}</td>
			<td>${st.birth}</td><td>${st.email}</td>
		</tr>
	</c:forEach>
</table>
<a href="studentwriteui.do">[학생정보 입력]</a>
</body>
</html>