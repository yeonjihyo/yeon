<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 공통으로 들어가는 jsp를 따로 관리할때 불러오는 코드 -->
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$('select').change(function(){
			location.href='<%=request.getContextPath()%>/admin/user/update?'+$(this).val()
		})
	})
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include><!--얘는 바디태그 안에 있어야 함 태그니까 -->
	<h1 style="margin-top: 80px;">회원리스트</h1>
	<table class="table">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>권한</th>
			<th>수정</th>
		</tr>
		
		<c:forEach var="member" items="${list}"> <!-- 컨트롤러가보내줄리스트  -->
		<!-- items에서 리스트를 하나씩 끄집어 내서 board에 저장--> 
			<tr>
				<th>${member.id}</th> <!-- .뒤는 getter를 호출-->
				<th>${member.name} </th>
				<th>${member.email}</th>
				<th>${member.authority}</th>
				<th>
					<select>
					<option value="id=${member.id}&authority=ADMIN&page=${pageMaker.criteria.page}" <c:if test="${member.authority eq 'ADMIN'}">selected</c:if>>ADMIN</option>
					<option value="id=${member.id}&authority=user&page=${pageMaker.criteria.page}" <c:if test="${member.authority eq 'user'}">selected</c:if>>user</option>			
					</select>
				</th>
			</tr>
		</c:forEach>	
	</table>
	
	<!-- 페이지네이션추가 -->
	<ul class="pagination" style="justify-content: center;">
    <c:if test="${pageMaker.prev}">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.startPage-1}">Previous</a>
        </li>
    </c:if>
    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${index}">${index}</a>
        </li>
    </c:forEach>
    <c:if test="${pageMaker.next}">
        <li class="page-item">
            <a class="page-link" href="<%=request.getContextPath()%>/admin/user/list?page=${pageMaker.endPage+1}">Next</a>
        </li>
    </c:if>
</ul>
</body>
</html>