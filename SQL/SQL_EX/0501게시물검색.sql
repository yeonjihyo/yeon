/* '강아지'카페에 등록된 모든 게시물들을 출력하는 쿼리문을 작성하세요 */

select * from board where board_cafe_name='강아지';


/*'강아지'카페에 등록된 게시물 중 제목에 '단어'가 포함된 게시물들을 출력하는 쿼리를 작성하세요 */

select *from board where board_cafe_name='강아지' and board_title like '%사료%';