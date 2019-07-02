package test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.2차원 좌표의 점을 저장하는 Point클래스를 생성하고 테스트하는 코드를 작성하세요
		Point p = new Point();
		p.print();
		p.move(3, 4);
		p.print();
		Point p2 = new Point(p);
		p2.print();

	}
}
	/*
 	
	 -멤버변수 :x,y
	 -멤버함수
	  -생성자
	  -getter와 setter
	  -좌표이동
	  -좌표출력
	 */
	/*
	 * 멤버 변수 초기화 순서
	 * 각 자료형에 대한 기본값 : x의 자료형 int는 기본값이 0 =>명시적초기화 : x=0 =>초기화 블록: {x=0} =>생성자  
	 */
	
class Point{
	private int x;
	private int y;
	
	//생성자 :리턴타입없고 클래스명과동일
	public Point(){}
	public Point(int x,int y){
		move(x,y);
	}
	//복사생성자
	public Point(Point p){
		move(p.x,p.y);
	}
	
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
	
	
	public void move(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
}


