/*전년도구매금액기준으로 회원등급 결정하는 프로시저
누적 100만원 이상 구매-> 우수회원
누적 300만원 이상 구매->최우수회원
으로 등업*/

DROP PROCEDURE IF EXISTs user_upgrade;
DELIMITER //
create procedure user_upgrade(
IN in_order_user_id varchar(45)
)
	begin
		declare pre_first datetime;
		declare pre_last datetime;
		declare pre_total int default 0;
		DECLARE total_cnt int default 0;
		declare i int default 0;
        declare in_user_grade varchar(45) default '일반회원';
        -- 작년 1월1일을 datetime으로 만드는 과정, 작년12월 31일을 datetime으로 만드는 과정 
		set pre_first = concat(year(now())-1,'-01','-01');
		set pre_last = concat(year(now())-1,'-12','-31');
		-- 작년1월1일과 작년12월 31일 사이에 있는 누적금액을 계산
        set total_cnt=(select count(*) from leather.order where order_date >= pre_first and order_date <=pre_last and order_user_id=in_order_user_id);
        while i<total_cnt do
			set pre_total=pre_total+(select order_total from leather.order where order_date >= pre_first and order_date <=pre_last and order_user_id=in_order_user_id limit i,1);
			set i = i+1;
		end while;
        if pre_total >= 1000000 then
			set in_user_grade='우수회원';
		end if;
		if pre_total >= 3000000 then
			set in_user_grade='최우수회원';
		end if;
		update  user set user_grade = in_user_grade where user_id=in_order_user_id;
		
    end //
DELIMITER ;