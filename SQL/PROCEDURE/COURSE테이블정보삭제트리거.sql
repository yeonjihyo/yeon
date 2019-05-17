
/*COURSE 테이블의 정보가 삭제 됐을때 처리하는 트리거를 작성하세요*/

DROP TRIGGER IF EXISTS delete_course; 
DELIMITER // 
CREATE TRIGGER delete_course AFTER DELETE ON course 
FOR EACH ROW 
BEGIN 
	/*삭제된 course테이블의 정보중 giveup_state 가 Y이면 아무것도 안해도 된다
    => 이전에 작성한 update트리거에 의해서 total값이 하나 빠진 상태이기 때문에 해당 행을 지워도 total값에는 영향이 없다*/

	/*삭제된 course 테이블의 정보 중 giveup_state가 N이면 total 값을 한 뺴야 한다
	조건식 : giveup_state가 N이다=>giveup_state가 N과 같다
	실행문 : total값을 하나 뺴라 => total-total-1; */
		if old.giveup_state='N' then
        update
        class
		set
		total=total-1
		where old.class_no=no;
		end if;
END // 
DELIMITER ;
