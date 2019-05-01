/*'강아지'카페에 가입된 모든 회원들의 이메일을 출력하는 쿼리문을 작성하세요 */
select user_email
from member
join user
on member_user_id=user_id
where member_cafe_name='강아지' 
;