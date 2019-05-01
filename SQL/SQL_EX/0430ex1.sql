/*university 데이터베이스에서 신입생들의 학생수를 출력하는 쿼리문*/
SELECT count(*)
FROM university.student
where student.student_num>=2019000000;
/* student_num이 varchar일떄
where student.student_num like '2019%'
*/