drop procedure if exists ordernum_end; 
DELIMITER //
create procedure ordernum_end(
in front varchar(20),
out end varchar(30)
)
begin
	set end = (select count(*) from leather.order where order_num like concat(front,'%'));-- 주문번호 앞부분이 먼저 생기고 그걸검색해서 뒷부분의번호가 순서대로 매겨진다 
	if end < 10 then -- 1~9 => 한자리수일때 0을 7개 붙인다.
		set end = concat('0000000',end+1);
	end if;
    if end < 100 and end >= 10 then
		set end = concat('000000',end+1);
	end if;
    if end < 1000 and end >= 100 then
		set end = concat('00000',end+1);
	end if;
    if end < 10000 and end >= 1000 then
		set end = concat('0000',end+1);
	end if;
	if end < 100000 and end >= 10000 then
	set end = concat('000',end+1);
	end if;
    if end < 1000000 and end >= 100000 then
	set end = concat('00',end+1);
	end if;
    if end < 10000000 and end >= 1000000 then
	set end = concat('0',end+1);
	end if;
    set end = concat(front,'-',end);
end //
DELIMITER ;
