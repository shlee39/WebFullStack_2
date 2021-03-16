<%@page import="com.google.s1.member.MemberDTO"%>
<%@page import="com.google.s1.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Test JSP Page</h1>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		memberDTO = memberDAO.login(memberDTO);
		
		String result = "로그인 실패";
		if(memberDTO != null){
			result = "로그인 성공";
		}
		
		
	%>
	
	<h1><%= id %></h1>
	<h1><%= pw %></h1>
	<h1><%= result %></h1>
	
</body>
</html>