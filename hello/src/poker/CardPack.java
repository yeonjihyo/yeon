package poker;

import java.util.ArrayList;
import java.util.Collections;

//CardPack : 카드 최대 52장 정보를 담는 클래스 
public class CardPack {
private ArrayList<Card> list = new ArrayList<Card>();
	////순서유지를 위해 리스트 사용-> .get , .set 도 이용하기 위해
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	/* 기능 : 모양이 주어지면 해당 모양의 1번카드부터 K카드까지 팩에 추가 */
	private void cardPackSet(String shape){
		for(int i=1; i<=13; i++){
			Card c = new Card();
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
	public void show(){
		for(int i=0; i<list.size();i++){
			System.out.print(list.get(i) + " ");
			if( (i+1)% 10 == 0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	//카드정보를 줘야하니까 리턴타입이 카드
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0));  //리스트0번지에있는 값을 c에 복사해서 넘겨준다 
			list.remove(0); //하나꺼내줬으니까 하나없어진거니까 지워야함=> 원본에 저장된 값을 지워줘야한다.
			return c;
		}else{
			return null;
		}
	}

}
