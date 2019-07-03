<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1> 

<P>  The time on the server is ${serverTime}.${name} </P>
<form method="get" action="<%=request.getContextPath()%>/"> <!-- /spring/과 같음 -->
	<input name="id" value="${name}">
</form>
<form method="get" action="<%=request.getContextPath()%>/"> 
	<input name="num1" value="${a}">+
	<input name="num2" value="${b}">=
	<input name="res" value="${c}" readonly>
	<br>
	<button>계산</button>
</form>
<form method="get" action="<%=request.getContextPath()%>/">
 <input name="number" value="${cnt}">
 <button>증가</button>
 
</form>
</body>
</html>
