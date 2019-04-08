package Day10;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t=new Tv();
		t.price =100;
		t.bonusPoint=2;
		Computer c = new Computer();
		c.price=50;
		c.bonusPoint=1;
		Audio a = new Audio();
		a.price=200;
		a.bonusPoint=5;
		Buyer buyer = new Buyer();
		buyer.buy(c);
		System.out.println("컴퓨터산후 남은 금액 : "+ buyer.money);
		buyer.buy(a);
		System.out.println("오디오산후 남은 금액 : "+ buyer.money);
		buyer.buy(t);
		System.out.println("Tv후 남은 금액 : "+ buyer.money);
	}

}
//367p매개변수의 다형성 :  부모클래스의 매개변수여야 사용가능 
//부모클래스
class Product{
	int price;
	int bonusPoint;
	
}

class Tv extends Product{}			//자식클래스1
class Computer extends Product{}	//자식클래스2
class Audio extends Product{}		//자식클래스3

//구매자클래스
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	//원래는 매개변수로 Tv t 또는 Computer c 또는 Audio a 가 와서 메소드 오버로딩으로 구현해야하지만
	//그럴경우 Product를 상속받는 제품이들이 많아지면 추가해야할 메소드가 늘어난다
	//그래서 각 클래스의 객체가 아닌 해당 클래스들의 부모인 Product클래스를 매개변수로 처리하면 
	//Product 클래스를 상속받은 제품들은 일괄처리된다
	void buy (Product p){
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}