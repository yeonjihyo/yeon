SELECT 
course.course_num,
subject.subject_title,
course.course_student_num,
student.student_name,
course.course_total,
avg(course.course_total*0.045)
FROM course
join student
on student.student_num=course.course_student_num
join class
on course.course_class_num=class.class_num
join subject
on subject.subject_code=class.class_subject_code
where student_name='홍길동'
;
