package day18;
//695p
public class EnumEx2 {
	public static void main(String[] args) {
		for( Kind k : Kind.values()){ //values()배열로 만들어주는거
			System.out.println(k.name() + "=" + k.getValue());
			
		}
		Number num = Number.ONE;
		num=Number.FIVE;
		
		Human h = new Human();
		h.gender2=Gender2.MALE;
	}
}
class Human{
	Gender2 gender2;
}
enum Gender2{MALE,FEMALE}
enum Kind{
	SPACE(1),CLOVER(2),HEART(3),DIA(4);
	private final int value;
	Kind (int value){this.value=value;}
	public int getValue(){return value;}
}


enum Number{ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,J,Q,K}
