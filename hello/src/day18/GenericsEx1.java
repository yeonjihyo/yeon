package day18;

public class GenericsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Integer> box = new Box2<Integer>();
		Box2<String> box2 = new Box2<String>();
		Box2<Object> box3 = new Box2<Object>();
		
		
		
		//674p
		//왼쪽에 인터페이스명, 오른쪽에는 왼쪽에 있는 인터페이스를 구현한 클래스
		//인터페이스<Integer> test = new 클래스<Integer>();
		//왼쪽에 부모클래스, 오른쪽에는 자식클래스
		//부모클래스<Integer> test2= new 자식클래스<Integer>();
	}

}

class Box2<T>{
	T item;
	void setItem(T item){
		this.item=item;
	}
	T getItem(){
		return item;
	}
	
}