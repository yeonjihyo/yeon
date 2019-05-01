/*website 데이터베이스에 있는 게시판 테이블에 게시글을 수정하는 쿼리문을 작성하세요*/
update 
board
set 
board_title='강아지장난감3',
board_contents='장난감정보3'
/*board_catrgory_code=2 => 카페내에서 게시글 카테고리 변경이 가능한 경우*/
where 
board_no=53;
SELECT * FROM website.board;