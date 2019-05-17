
/*학번이 2019100100인 학생이 수강한 목록과 학생이름을 출력하는 쿼리를 join을 이용하여 작성하세요 */
select 
course_class_num,
student_name,
course_total
from 
course
join 
student
on 
course_student_num=student_num
where 
student_num='2019100100';
 