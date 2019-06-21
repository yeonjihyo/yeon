$(document).ready(function(){
	$('.box-check').change(function(){
		var isChecked = $(this).prop('checked');
		//체크된 경우 
		if(isChecked){
			//eq : 몇번지에 있는건지를 의미
			$('.box').eq($(this).val()).addClass('display-none');
		}
		//체크해제된 경우
		else{
			$('.box').eq($(this).val()).removeClass('display-none');
		}
	});
});
