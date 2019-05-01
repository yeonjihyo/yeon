/*website 데이터베이스에 있는 게시판 테이블에 게시글을 추가하는 쿼리문을 작성하세요*/
insert into 
board (board_title,
board_contents,
board_writer,
board_category_code,
board_cafe_name)
values('강아지장난감2',
'장난감정보2',
'aaa111',
1,
'강아지');
/*board_category_code는 게시판 유형으로 게시판마다 미리 지정된 값을 저장*/
SELECT * FROM website.board;