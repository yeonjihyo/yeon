package Day10;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1= new Triangle();
		t1.print();
		Triangle t2 = new Triangle(1,1,3,3);
		t2.print();
		Triangle t3=null;
		t3.print();//오류
		/* 
		 *  에러내용 :NullPointerException
			에러원인: 참조변수가 null값을 가지는데 해당변수를 사용했을 경우에 생기는에러
			             일반적으로 클래스의 객체를 선언만 하고 new를 통해 생성하지 않은 상테에서 해당 
			             객체의 메소드를 호출하는 경우 발생한다.
		       해결방법 : 객체를 생성하고 호출하면 된다.
		*/

	}

}
