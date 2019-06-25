$(document).ready(function(){
	$('.more').click(function(){
		$(this).before('<div class="contents"></div><div class="contents"></div><div class="contents"></div>');
	})
});