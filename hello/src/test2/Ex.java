package test2;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * static 메소드 vs 일반메소드
		 * static 멤버변수 vs 일반멤버변수
		 * static => 클래스꺼다=>클래스와 객체 모두를 이용하여 호출할 수 있다 => 객체 생성없이 만들어진다 
		 * 객체 생성 없이 만들어진다 != 객체를 통해 호출할수 없다
		 * static 메소드에는 지역변수나 static멤버 변수만 사용할 수 있다. 일반멤버변수는 사용불가능하다
		 * 왜냐하면 static메소드는 객체 생성없이 사용가능한데 일반멤버변수는 객체를 생성해야 할당되기 때문에 
		 * 클래스를 이용하여 호출하는 경우 문제가 되기 떄문이다 .
		 * static 멤버 변수는 클래스의 모든 객체가 공유한다.
		 * 
		 * 
		 * 일반
		 * 일반 메소드에서는 static메소드나 static 멤버변수를 사용할 수 있다 .
		 * 
		 * class A{
		 * 	int a;
		 * 	static void b(){
		 * 		//a=10; //에러발생
		 * 	}
		 * }
		 * class A{
		 * 	static int cnt;
		 *	 void add(){
		 *		cnt++;
		 *	 }
		 * }
		 * class Test{
		 * 	public static void main(String[] args) {
		 * 		A.b();
		 * 	}
		 * }
		 * */

	}

}
