<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation</title>
<script>
	function check(){
	    var id = document.getElementById("id").value;
	    var pw = document.getElementById("pw").value;
	
	    if(id == ""){
	        alert("아이디를 입력해 주세요");
	        return;
	    }
	   
	    if(pw == ""){
	        alert("비밀번호를 입력해 주세요");
	        return;
	    }
	    if(pw.indexOf(id) >= 0){
	        alert("비밀번호는 ID를 포함할 수 없습니다.");
	        return;
	    }
	    document.myform.submit();
	}
</script>

</head>
<body>
	<form name="myform" action="validation_process.jsp" method="post">
		아이디 : <input type="text" id="id" name="id"><br>
		비밀번호 : <input type="text" id="pw" name="pw"><br>
		<input type="button" value="전송" onclick="check()">
	</form>
</body>
</html>