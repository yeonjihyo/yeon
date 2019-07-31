<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 공통으로 들어가는 jsp를 따로 관리할때 불러오는 코드 -->
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

<meta charset="UTF-8">
<title>게시판관리</title>
<script type="text/javascript">
	$(document).ready(function(){
		$('select[name=validState]').change(function(){
			location.href='<%=request.getContextPath()%>/admin/board/update?'+$(this).val()
		})
	})
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include><!--얘는 바디태그 안에 있어야 함 태그니까 -->
	<h1 style="margin-top: 80px;">게시판</h1>
	<table class="table">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
			<th>상태</th>
			
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
				<th>
					<select name="validState">
						<option value="num=${board.num}&valid=D&page=${pageMaker.criteria.page}" <c:if test="${board.valid eq 'D'}">selected</c:if>>삭제</option>
						<option value="num=${board.num}&valid=I&page=${pageMaker.criteria.page}" <c:if test="${board.valid  eq 'I'}">selected</c:if>>게시</option>			
					</select>
				</th>
			</tr>
		</c:forEach>	
	</table>

	<!-- 게시판 목록 페이지에 페이지네이션 추가 -->
	<ul class="pagination" style="justify-content: center;">
	    <c:if test="${pageMaker.prev}"><!-- 참이면 보여주고 거짓이면 안보여주고  -->
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${pageMaker.startPage-1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Previous</a>
	        </li>
	    </c:if>
	    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage}" var="index">
	       <c:if test="${pageMaker.criteria.page == index}">
		        <li class="page-item active">
		            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>
	         <c:if test="${pageMaker.criteria.page != index}">
		         <li class="page-item">
		            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${index}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">${index}</a>
		        </li>
	        </c:if>
	    </c:forEach><!-- 스타트페이지에서 엔드페이지까지 하나씩 증가하는 작업, 인덱스를 for에 i라고 생각하기  -->
	    <c:if test="${pageMaker.next}">
	        <li class="page-item">
	            <a class="page-link" href="<%=request.getContextPath()%>/admin/board/list?page=${pageMaker.endPage+1}&type=${pageMaker.criteria.type}&search=${pageMaker.criteria.search}">Next</a>
	        </li>
	    </c:if>
	</ul>
	<form class="float-right" method="get" action="<%=request.getContextPath()%>/admin/board/list">
		<select name="type" class="float-left">
			<option value="0">선택</option>
			<option value="1" <c:if test="${pageMaker.criteria.type eq 1}">selected</c:if>>제목</option>
			<option value="2" <c:if test="${pageMaker.criteria.type eq 2}">selected</c:if>>내용</option>
			<option value="3" <c:if test="${pageMaker.criteria.type eq 3}">selected</c:if>>작성자</option>
		</select>
		<input type="text" name="search"class="float-left" value="${pageMaker.criteria.search}">
		<button type="submit" class="btn btn-outline-danger float-left">검색</button>
	</form>
	<a href="<%=request.getContextPath()%>/board/register">
		<button type="button" class="btn btn-outline-danger">등록</button>
	</a>
</body>
</html>