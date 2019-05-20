package ex;

public class Ex4 {
	/*
	 * static 멤버메소드와 일반 메소드의 차이
	 * -sratic 멤버메소드 :클래스 멤버메소드
	 * -일반 멤버메소드: 객체멤버메소드
	 * 
	 * static멤버메소드의특징
	 * -객체 생성 없이 클래스를 통해 호출할 수 있다.
	 * -객체를 생성해서 호출할 수도 있다.
	 * -static 멤버 메소드 구현에 일반멤버변수와 일반멤버메소드를 사용할 수 없다
	 *  => 일반멤버변수와 멤버메소드는 개체를 생성할 때 할당되기 때문에 객체 없이 사용할 수 있는
	 *     static멤버 메소드에서 사용할 수 없다.
	 *
	 *static 멤버변수의 특징
 	 *-static 멤버변수를 클래스에 모든 객체들이 공유한다 
 	 *
 	 *멤버 변수 초기화 순서
 	 * 1.각 자료형의 기본값 초기화 
 	 * 2.명시적 초기화 =>private int x=0; =0을 붙여주는거
 	 * 3.초기화 블록 {} 
 	 * 4.생성자
 	 * 
 	 * 기본생성자가 필요한 이유:메인에서 기본생성자를 호출하고 싶어서, scanner같이 특이한 경우가 아니면 만들어주는게 좋음
 	 *  
	 * */

	public static void main(String[] args) {
		point p=new point();
		p.print();
		p.move(5, 5);
		p.print();
		point p2= new point(p);
		p2.print();
		

	}

}
/* point클래스를 생성하세요
 * point 클래스는 2차원 좌표 평면의 점을 나타내는 클래스이다
 * 1.멤버변수로는 x,y가 있다 외부에서접근불가능
 * 2.생성자-기본생성자ㅡ복사생성자ㅡ생성자오버로딩등
 * 3.getter와 setter생성
 * 4.좌표출력하는 메소드
 * 5.좌표이동하는 메소드*/
 
class point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public point(){}//기본생성자
	public point (point p){//복사생성자
		move(p.x,p.y);
	}
	public void point(int x, int y){	
		move(x,y);
	}
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	
}