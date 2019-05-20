/* student 테이블에서 insert 이벤트가 발생하면 추가된 student_num의 정보를 이용하여 graduation 테이블에 insert를 한다. */

drop trigger if exists insert_student;
delimiter //
create trigger insert_student
 after insert on student
for each row
begin
 declare r_num int; -- 졸업번호
    declare r_year int; -- 졸업년도

 /*졸업 요건 정보는 입학년도와 전공을 통해 결정된다는 전제조건*/
    set r_year = left(new.student_num , 4); -- 졸업연도 계산,left는 길이만큼 문자열을 반환하는것 =>학번의 왼쪽에서 4번쨰자리까지반환  
    if new.student_major is not null then -- 새로추가되는 학생의 전공이 널이 아니라면 
  set r_num = (select requirement_num from requirement 
        where new.student_major = requirement_major and requirement_entrance_year = r_year); 
 end if;
 /*새로 추가되는 학생의 전공이 졸업요건에 있는 전공과 같고 졸업요건에 있는 입학년도가 졸업년도와 같을때 졸업요건번호를 가져오면 졸업번호가 생성된다 */

 insert graduation(graduation_student_num, graduation_requirement_num)
    values(new.student_num, r_num);
    /*졸업테이블의 졸업학생번호와 졸업요건번호의 값은 새로 추가되는 학생번호와 졸업번호를 가져와야 한다*/
end //
delimiter ;
