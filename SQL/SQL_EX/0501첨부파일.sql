/*업로드파일 데이터를 추가하고 
등록된 '강아지사진'에 첨부된 파일리스트를 출력하는 쿼리문을 작성하세요*/

SELECT upload_filename
FROM upload
where upload_board_no=40;

/*'aaa111'회원이 '강아지'카페에 등록한 첨부파일리스트를 출력하는 쿼리문을 작성하세요  */
SELECT upload_filename
FROM upload
join board
on upload.upload_board_no=board.board_no 
where board_writer='aaa111' and board.board_cafe_name='강아지';