/*신입생들의 학생수를 출력하는 쿼리문*/
SELECT count(*)
FROM university.student
where student.student_num>=2019000000;