/*website 데이터베이스에 있는 회원정보를 수정하는 쿼리문을 작성하세요*/
update user
set user_pw='aa1234',
user_email='a1@naver.com',
user_name='유관순',
user_nick='유유',
user_phone='01077777777',
user_address='청주시 서원구'
where user_id='aaa111'
;
SELECT * FROM website.user;