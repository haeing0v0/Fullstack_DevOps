<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals("관리자") && pw.equals("1234")){
    response.sendRedirect("response_success.jsp");
}else{
    response.sendRedirect("response_failed.jsp");
}
%>