<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css">
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('input[name=id]').focus();
			$('#findBtn').click(function(){
				//ajax를 통해 아이디와 이메일을 서버에 전송 후 일치 여부를 확인 
				var id=$('input[name=id]').val();
				var email=$('input[name=email]').val();
				$.ajax({
			        async:true,
			        type:'POST',
			        data:{'id':id, 'email':email},
			        url:"<%=request.getContextPath()%>/checkemail",
			        dataType:"json",
			        contentType:"application/json; charset=UTF-8",
			        success : function(data){
			            if(data.isOk){
			            	$('#findForm').submit();
			            }else{
			            	alert('일치하는 정보가 없습니다.');
			            }
			        }
			    });
			});
		});
	</script>
	<title>비밀번호찾기</title>
	<style>
	*{
		margin: 0;
		padding : 0;
	}
	.main{
		margin-top:50px;
	}
	.row{
		margin: 5px 0px;
	}
	.fab.fa-amazon{
		font-size: 100px;
		color: red;
	}
	</style>
	
</head>
<body>
<div>
		<div class="offset-4 col-4 border border-dark mt-5">
			<h1 class="text-center">비밀번호찾기</h1>
			<form method="post" action="<%=request.getContextPath()%>/password/send" id="findForm">
				<div class="row">
					<label class="col-4" >아이디</label>
					<input type="text"class="form-control col-7" name="id" placeholder="아이디">
				</div>
				<div class="row">
					<label class="col-4" >이메일</label>
					<input type="email"class="form-control col-7" name="email" placeholder="이메일">
				</div>
				<div class="offset-7 col-4 clearfix p-0">
					<button type="button" class=" btn btn-primary float-right" id="findBtn">비밀번호찾기</button>
					<!-- type을 button으로 한 이유 : 버튼을클릭했을떄 ajax로 일치하는지 요청하고 결과에 따라 submit을 진행할지 안할지 결정하기 위해  -->
				</div>
			</form>
		</div>
	</div>
</body>
</html>