package day18;

public class EnumsEx1 {

	public static void main(String[] args) {
		// 691p 열거형 
		
		Card c = new Card();
		System.out.println(c.kind);//자동으로 toString()이 생성되서 생략되있음 그 안에 name이 있는거?
		c.kind= Card.Kind.CLOVER;
		//Kind 는 Card클래스에에 있는 거기때문에 import를 해주거나 Card.Kind.CLOVER 를 해줘야 한다.
		System.out.println(c.kind.ordinal());//순서를반환
		System.out.println(c.kind.name());
		
		
		
	}

}


class Card{
	public enum Kind {SPACE(1),CLOVER(2),HEART(3),DIA(4);
	private final int value;
	Kind (int value){this.value=value;}
	public int getValue(){return value;}
	}//그냥 상수이름만있으면 자동으로 0 1 2 3 이지만 (1)처럼 값을 지정하면 추가적인작업이필요하다
	//Kind의 K는 열거형자료형이라 대문자로 쓰는게 좋음
	//열거형은 public로 해주는게 좋음 
	
	Kind kind=Kind.SPACE;//열거형을 통해 하나의 변수를 만듬
	
	/*
	열거형(enum)을 써서 위에 한줄로 정리할수 있다 
	final int SPACE=0;
	final int CLOVER=1;
	final int HEART=2;
	final int DIA=3;*/
	
	//int kind=SPACE;
	
}