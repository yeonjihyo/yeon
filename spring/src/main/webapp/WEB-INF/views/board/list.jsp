<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
	<h1>게시판</h1>
	<table class="table">
		<tr>
			<th width="5%">번호</th>
			<th width=55%">제목</th>
			<th width="10%">작성자</th>
			<th width="20%">등록일</th>
			<th width="10%">조회수</th>
		</tr>
		<!-- 맨위에 줄에 있는 url을 복사한 이유는 아래처럼 사용하기 위해-->
		<!-- 향상된 for문이라고 생각  -->
		<c:forEach var="board" items="${list}"> <!-- 컨트롤러가보내줄리스트  -->
		<!-- items에서 리스트를 하나씩 끄집어 내서 board에 저장--> 
			<tr>
				<th>${board.num}</th> <!-- .뒤는 getter를 호출-->
				<th><a href="<%=request.getContextPath()%>/board/display?num=${board.num}">${board.title}</a>                                                                                   </th>
				<th>${board.writer}</th>
				<th>${board.registered}</th>
				<th>${board.views}</th>
			</tr>
		</c:forEach>	
	</table>
	
</body>
</html>