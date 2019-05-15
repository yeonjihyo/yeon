/*제품의 리뷰갯수를 증가시키는 트리거*/
drop trigger if exists input_review_count;
DELIMITER // 
create trigger input_review_count
after insert on review
for each row
begin 
	declare reviewcount int default 0;
    set reviewcount=(select count(*) from review where new.review_product_code=review_product_code);
   update 
   product
   set 
   product_reviewcnt=reviewcount
   where product_code=new.review_product_code;
END //
DELIMITER ;

   
     