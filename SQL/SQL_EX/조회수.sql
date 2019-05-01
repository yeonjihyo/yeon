/*
website 데이터베이스에 있는 게시판 테이블에 views(조회수)속성을 추가한뒤 
update를 이용해 조회수를 1 증가하는
쿼리문을 작성
예시) 1번 게시판의 조회수가 0->1
*/
update board
set board_views= board_views+1
where board_no=40 ;
SELECT * FROM website.board; 