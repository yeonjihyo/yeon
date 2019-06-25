$(document).ready(function(){
	$('#btn1').click(function(){
		$(this).before('<button>버튼2</button>');
		$(this).after('<button>버튼3</button>');
	});
});