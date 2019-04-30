/*회원이 카페에 등록한 글의 갯수(member_board_count) 를 쿼리문으로 작성해보세요*/
update member
set member_board_count=(select count(*) from board where board_cafe_name ='갤럭시' and  board_writer='eee111'  )
where member_no>=1 and member_cafe_name ='갤럭시' and member_user_id='eee111' ;
SELECT * FROM member;