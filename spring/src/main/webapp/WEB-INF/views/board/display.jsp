<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
</script>
<body><!-- 괄호안은 속성명임 -->
	${board}<br>
	<br>
	${board.title}<br>
	${board.writer}<br>
	${board.registered}<br>
	${board.views}<br>
	${board.contents}<br>
	${board.file}<br>
</body>
</html>