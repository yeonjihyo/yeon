select 
student_name,
s_title.subject_title,
s_title.professor_name,
course_total
from course
join student
on course_student_num=student.student_num
join (select subject_title,professor_name,class_num from class join subject on class_subject_code=subject_code join professor on class_professor_num=professor_num)
as s_title 
on course_class_num=class_num
where student.student_num='2019100100'
;