package Day9;

public class ClassEx3 {
	public static void main(String[] args) {
		//기본 생성자를 이요한 객체생성후 초기화
		Tv t1= new Tv();
		t1.printChannel();
		t1.printVolumn();
		//생성자 오버로딩을 이용한 객체 생성후 초기화
		Tv t2= new Tv(100,15);
		t2.printChannel();
		t2.printVolumn();	
		//t3를 생성해서 t2의 값으로 초기화
		Tv t3= new Tv(t2);
		System.out.println("t3");
		t3.printChannel();
		t3.printVolumn();	
		t3.volumnDown();
		System.out.println("t3소리줄이기실행후 t3");
		t3.printVolumn();
		System.out.println("t3소리줄이기실행후 t2");
		t2.printVolumn();
		
		//t4를 생성하지 않고 t3의 다른이름으로 t4라 부른다
		//공유하는거처럼보이는거지 공유하는거는아님 
		Tv t4=t3;
		System.out.println("t3소리줄이기실행후 t4");
		t4.printVolumn();
		
		
		
		
	}

	

}
