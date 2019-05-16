/*b123회원이 주문한 총금액이 50000원이 넘으면 배송비 무료 /넘지않으면 배송비3000추가?*/
use leather;
drop procedure if exists deliver_price; 
DELIMITER //
CREATE PROCEDURE deliver_price(
in in_order_no varchar(45)
)
BEGIN 
	DECLARE total_price int default 0;
	DECLARE i int default 0;
	DECLARE cnt int default 0;
	set cnt = (select count(*) from userlist join product on userlist_product_code=product_code where userlist_order_num=in_order_no);
	select cnt; -- 없어도 되지만 호출에서 확인하기 위해
	while i<cnt do
		set total_price = total_price + (select product_price from userlist join product on userlist_product_code=product_code where userlist_order_num=in_order_no limit i,1)
						*(select userlist_count from userlist join product on userlist_product_code=product_code where userlist_order_num=in_order_no limit i,1);

		set i = i+1;
	end while;
	select total_price;  -- 없어도 되지만 호출에서 확인하기 위해
	if total_price < 50000 then
		set total_price = total_price + 3000;
	end if;
	update leather.order set order_total = total_price where order_num = in_order_no;
end //
DELIMITER ;


