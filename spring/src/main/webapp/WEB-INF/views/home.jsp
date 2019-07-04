<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html>
<head>
	<title>Home</title>
</head>
<body><!--request의 메소드인  getContextPath()를 사용하겠다?-->
<a href="<%=request.getContextPath()%>/signup">회원가입</a>
</body>
</html>
