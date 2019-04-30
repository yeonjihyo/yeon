/*홍길동 학생의 2019년도 1학기 수강과목들을 출력하는 쿼리문
홍길동 학생이 수강한 전공필수 과목들을 출력하는 쿼리문*/

SELECT 
course.course_num,
student.student_name,
title.class_year,
student.student_semester,
title.subject_title,
title.subject_type

FROM course
join student
on course.course_student_num=student.student_num
join(select * from class join subject on class.class_subject_code=subject.subject_code)
as title
on course.course_class_num=title.class_num
where student.student_name='홍길동'
and title.class_year=2019
and student.student_semester=1
and title.subject_type='전공필수'
;