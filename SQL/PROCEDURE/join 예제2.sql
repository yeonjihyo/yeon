/*학번이 2019100100인 학생이 수강한 목록과 학생이름을 출력하는 쿼리를 join을 이용하여 작성하세요
학생이름 강의명 총점*/
select 
student_name,
s_title.subject_title,
course_total
from course
join student
on course_student_num=student.student_num
join (select * from class join subject on class_subject_code=subject_code)
as s_title 
on course_class_num=class_num
where student.student_num='2019100100'
;
 