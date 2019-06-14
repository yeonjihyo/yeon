//문자열의 길이가 최소길이에서 최대길이 사이에 있는지 확인하는 함수
function checkStringLength(str,min,max){
	if(str.length >= min && str.length <= max){
		return true;
	}return false;
}

function checkPw(pwObj,min,max){
	if(!checkStringLength(pwObj.value,min,max)){
		alert('비밀번호의 길이는 '+min+'~'+max+'자리입니다.');
		return false;
	}return true;
}

function checkPwConfirm(idPw1, idPw2,min,max){ 
	var pw1 = document.getElementById(idPw1); //document : 현재문서를 의미
	var pw2 = document.getElementById(idPw2);

	//비밀번호가 입력됐는지 안됐는지, 됐다면 원하는 길이인지 확인
	if(!checkPw(pw1,min,max)){//위에checkPw가 false를 리턴하니까 동작하려면 앞에 !이 붙어야 함
		return;
	}
	//비밀번호와 비밀번호 확인이 일치하는지 확인
	if(pw1.value !== pw2.value){
		alert('비밀번호와 비밀번호확인이 일치하지 않습니다.');
	}
}