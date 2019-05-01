/*website 데이터베이스에 있는 회원이 카페에 가입할때 필요한 쿼리문을 작성하세요*/
insert into member (member_cafe_name,member_user_id)
values ('고양이','eee111');
 
/*가입시 총회원수를 증가 */
update cafe
/*member_board_count=member_board_count+1*/
set cafe_total=(select count(*) from  member where member_cafe_name='고양이')
where cafe_name='고양이';

/*내가 쓴 글의 갯수 증가 */
update member
/*member_board_count=member_board_count+1*/
set member_board_count=(select count(*) from  board where board_cafe_name='강아지' and board_writer='aaa111' )
where member_no>=1 and member_cafe_name='강아지 ' and member_user_id='aaa111';
select * from member;

