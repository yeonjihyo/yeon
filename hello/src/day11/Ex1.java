package day11;

public class Ex1 {

	public static void main(String[] args) {
		//예외처리를 한다치면 
		//try{
		Shape s = new Shape();
		s.print();
		Shape.printcount();
		Circle c = new Circle (5,5,5);
		c.print();
		c.move(3, 3);
		c.print();
		c.resize(10);
		c.print();
		Circle.printcount();
		//자식클래스를 부모클래스로 변환할때에는 자동형변환이 가능하다
		Shape s2=c;
		Shape.printcount();//새로운 객체를 만든게 아니기떄문에 2로 유지됨
		//부모크래스를 자식클래스로 변환할 때에는 명시적형변환을 해야한다.
		//조건부로가능=>조건을 만족하지 않으면 사용할떄 
		//ClassCastException 이라는 오류가 발생할 수 있다.
		//클래스형변환 에러로 변환은 했지만 사용할 수 없는 정보가 있어서 사용하지 못하는 경우 
		//Circle c2= (Circle)s;   //실행시 에러발생
		//c2.print(); 
		Shape s3= new Circle();
		Shape.printcount();
		Circle c3 = (Circle)s3;
		c3.print();
		Circle.printcount();//연결한거기때문에 총만들어진 도형이 3으로 유지됨
		
/*
	//예외처리한다면 	
	}catch(NullPointerException e){
		System.out.println("객체를 생성하고 사용하세요");
	}catch(Exception e){
		System.out.println("예외 발생 !!");
	}finally{
		System.out.println("프로그램종료");
	}
*/	
		
	}

}
