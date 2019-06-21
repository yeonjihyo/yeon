$(document).ready(function(){
	//pw1 : 길이->내용이변경됐을 때 체크 or 가입버튼이 눌렸을 때
	$('#pw1').change(function(){
		if(!checkLength('#pw1',8,13)){
			alert('8~13자리를 입력해야합니다.');
		}
	});
	//pw2 : pw1과 같기만하면 된다->내용이변경됐을 때 체크 or 가입버튼이 눌렸을 때
	$('#pw2').change(function(){
		if(!equals('#pw1','#pw2')){
			alert('비밀번호가 일치하지 않습니다.');
		}
	});
});


//이벤트가 발생했을때 적용되는 함수가 아니고 그냥 함수이기 때문에$(document).ready 밖에 한다.
//일반함수 선언및구현은 $(document).ready 밖에다 한다
//일반함수 또는 해당하는 이벤트를 등록,사용할 경우에는 $(document).ready안에 한다  
function checkLength(selector,min,max){
	//selector에 #을 입력안하고 순수하게 아이디명만 입력하는 경우 
	//예) pw1
	//var length=$('#'+selector).val().length;//selector가 selector인 val를 가져와서 길이를 
	//selector에 #을 포함한 아이디를 입력하는 경우 
	//예) #pw1
	var length=$(selector).val().length;
	if(length > max || length < min)
		return false;
	else
		return true;
}

function equals(sel1,sel2){
	if($(sel1).val() == $(sel2).val())
		return true;
	return false;
}