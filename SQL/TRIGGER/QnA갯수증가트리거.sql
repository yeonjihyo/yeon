/*제품의 QnA갯수를 증가시키는 트리거*/
drop trigger if exists input_qna_count;
DELIMITER // 
create trigger input_qna_count
after insert on qna
for each row
begin 
	declare qnacount int default 0;
    set qnacount=(select count(*) from qna where new.qna_product_code=qna_product_code);
   update 
   product
   set 
   product_qnacnt=qnacount
   where product_code=new.qna_product_code;
END //
DELIMITER ;

   
     