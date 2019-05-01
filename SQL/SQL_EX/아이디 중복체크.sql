/* website 데이터베이스에 있는 회원가입시 아이디가 aaa111인 아이디가 있는지 
   중복체크에 활용할 수 있는 쿼리문을 작성하세요*/

SELECT count(*) /*검색결과 값이 0이면 비회원이므로 회원가입가능, 1이면 회원이므로 다른 아이디를 입력해야함*/
FROM website.user
where user_id ='aaa111'  ;