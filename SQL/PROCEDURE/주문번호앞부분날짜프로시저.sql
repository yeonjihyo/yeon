drop procedure if exists ordernum_front; 
DELIMITER //
create procedure ordernum_front(
out front varchar(20)
)
begin
	declare year varchar(5);
    declare month varchar(5);
    declare day varchar(5);
    declare hour varchar(5);
    declare minute varchar(5);
    set year = year(now()); -- 값을 설정한 뒤 조건을 걸고 불러온다고 생각
	set month = month(now());
    set day = day(now());
    set hour = hour(now());
    set minute = minute(now());
		if month<10 then
			set month = concat('0', month); 
		end if;
        if day<10 then
			set day = concat('0', day); 
		end if;
        if hour<10 then
			set hour = concat('0', hour); 
		end if;
        if minute<10 then
			set minute = concat('0', minute); 
		end if;
		set front = concat(year,month,day,hour,minute);

end //
DELIMITER ;
