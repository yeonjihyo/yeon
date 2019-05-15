/*총금액이 추가되는 트리거*/
use leather;
drop trigger if exists input_price;
DELIMITER // 
create trigger input_price
after insert on userlist
for each row
begin 
	declare totalprice int default 0;
	set totalprice=(select order_total from leather.order where new.userlist_order_num=order_num);
	set totalprice=totalprice+(select product_price from userlist join product on userlist_product_code=product_code where userlist_no=new.userlist_no)
				*(select userlist_count from userlist  where userlist_no=new.userlist_no);
	update
	leather.order
	set
	order_total=totalprice
	where 
    leather.order.order_num=new.userlist_order_num;
    update
    product
    set
    product_cnt= product_cnt-new.userlist_count
    where
    product_code=new.userlist_product_code;
    
end //
DELIMITER ;


