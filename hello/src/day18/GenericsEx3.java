package day18;

public class GenericsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox<Fruit> fBox1=new FruitBox<>();
		//FruitBox<String> fBox2=new FruitBox<>();
		//오류
	}

}

//676p 지네릭클래스를 제한하고 싶을떄 
//과일클래스
class Fruit implements Eat{}//아래 &Eat을 추가하면 메인에 오류가 뜨는데 인터페이스를 구현하지 않았기 때문이라 implements Eat를 추가해주면 된다.
//과일 클래스를 상속받은 사과클래스
class Apple extends Fruit{}
//과일박스 지네릭 클래스
class FruitBox<T extends Fruit & Eat >{}
//Fruit의 자손이면서 Eat 인터페이스도 구현해야 한다면 &Eat를 추가 해준다 .
//Eat 인터페이스를 구현하고 Fruit클래스를 상속받은 클래스만 타입변수 T로 올수 있다.


interface Eat{}