package ex;
/*카드 클래스를 만들고 list에 모든 카드 (52장)를 넣고 섞는 코드를 작성하세요 
 * 카드 클래스의 멤버 변수는 숫자 ,모양이 있다*/
//Card : 카드 1장 정보를 담는 클래스
//CardPack : 카드 최대 52장 정보를 담는 클래스 
import java.util.ArrayList;
import java.util.Collections;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Card c=new Card();
		c.setNum(5);
		c.setShape("H");
		System.out.println(c);*/
		
		
		CardPack cp=new CardPack();
		cp.shuffle();
		cp.show();
		cp.give();
		cp.show();
		System.out.println();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		
	}
}

//CardPack : 카드 최대 52장 정보를 담는 클래스 
class CardPack{
	private ArrayList<Card> list=new ArrayList<Card>();
	//순서유지를 위해 리스트 사용-> .get , .set 도 이용하기 위해
	
	public CardPack(){
		cardPackSetAll();
	} 
	/*모양이 주어지면 해당모양의 1번카드부터 k카드까지 팩에 추가*/
	private void cardPackSet(String shape){
		for (int i=1;i<=13;i++){
			Card c= new Card();
			c.setNum(i);
			c.setShape(shape);	
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear(); 
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
	}
	public void show (){
		for (int i=0;i<list.size();i++){
			System.out.print(list.get(i)+ " ");
			if ((i+1)%10==0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	//카드정보를 줘야하니까 리턴타입이 카드
	public Card give(){
		if (list.size() !=0){
			Card c=new Card(list.get(0));
			list.remove(0);//하나꺼내줬으니까 하나없어진거니까 지워야함
			return c;
		}else{
			return null;
		}
	}
	
}



//Card : 카드 1장 정보를 담는 클래스

 class Card {

	private int num;
	private String shape;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	
	@Override
	public String toString() {
		String s = new String();
		if (shape.equals("S")){
			s+="♠";
		}else if(shape.equals("H")){
			s+="♥";
		}else if(shape.equals("C")){
			s+="♣";
		}else if(shape.equals("D")){
			s+="◆";
		}
		
		if (num ==11) s+="J";
		else if (num ==12) s+= "Q";
		else if (num ==13) s+= "K";
		else
			s+=num;
		return s;
	}
	public Card(){} //생성자
	public Card(Card c){ //복사생성자
		this.num=c.num;
		this.shape=c.shape;
	}

}
