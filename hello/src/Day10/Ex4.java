package Day10;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//추상클래스
abstract class Shape2{
	int x,y;
	int w,h;
	//추상메소드는 주로 자식클래스에서 오버라이딩이 빈번하게 발생하는 경우에 
	//해당메소드를 구현하지 않고 추상메소드로 선언후에 자식클래스에서 구현하도록한다
	abstract void print();
	//선언부는있지만 구현부는 없다
	//구현은 이 클래스를 상속받는 자식클래스가 한다
	
}
//추상메소드를 사용하려면 추상클래스를 상속받는 자식클래스를 만들고 
//만들어진 자식클래스에서 메소드 오버라이딩을 통해 구현한후 사용한다.
//추상클래스를 상속받으면 추상메소드를 반드시 오버라이딩을 통해 구현해야한다.

class Rect2 extends Shape2{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}