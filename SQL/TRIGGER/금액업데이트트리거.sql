/*총금액 증가시키는트리거*/
DROP TRIGGER IF EXISTS update_price;
 DELIMITER // 
 CREATE TRIGGER update_price AFTER update ON userlist FOR EACH ROW BEGIN 
	declare totalprice int default 0;
	set totalprice=(select order_total from leather.order where new.userlist_order_num=order_num);
	set totalprice=totalprice+(select product_price from userlist join product on userlist_product_code=product_code where userlist_no=new.userlist_no)
			*new.userlist_count;
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

 END// 
 
 DELIMITER ;

