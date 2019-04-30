/*카페 회원수를 쿼리문으로 수정해보세요*/
update cafe
set cafe_total=(select count(*) from member where member_cafe_name='고양이')
where cafe_name='고양이';
select * from cafe;