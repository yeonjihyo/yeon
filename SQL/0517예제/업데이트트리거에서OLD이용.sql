DROP TRIGGER IF EXISTS update_course; 
DELIMITER // 
CREATE TRIGGER update_course AFTER UPDATE ON course 
FOR EACH ROW 
BEGIN 
	/*수강신청했다가 수강포기를 하는 경우=> giveup_state 가 	N에서 Y로 바뀌는 경우*/
    if old.giveup_state = 'N' and new.giveup_state = 'Y' then
    update 
    class
    set
    total=total-1
    where new.no=no;
    end if;
    /*수강포기를 했다가 수강포기를 철회하는 경우 => giveup_state가 Y에서 N으로 바뀌는 경우 */
    if old.giveup_state = 'Y' and new.giveup_state = 'N' then
    update 
    class
    set
    total=total+1
    where new.no=no;
    end if;
END // 
DELIMITER ;
