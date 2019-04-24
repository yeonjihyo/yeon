package Day9;
/*2차원 좌표의 점을 의미하는 Point클래스
 * */
public class Point {

	/*
	 * 1.필요한멤버변수
	 * x좌표의점, y좌표의점
	 * 2.생성자
	 * 멤버변수 초기화 => 기본생성자,복사생성자
	 * 3. 필요한멤버메소드
	 * grtter.setter
	 * x,y의 값이 주어졌을때 멤버변수의 값 변경
	 * 현재좌표출력
	 * 다른점과의 거리계산
	 * */
	
	
	
	
	//1.필요한 멤버변수
	/*
	 x좌표의점
	 y좌표의점
	*/
	private int x;
	private int y;
	
	
	
	//2.생성자
	// 멤버변수 초기화 => 기본생성자,복사생성자
	
   public Point(){
	   //x=0; y=0; 아래처럼 좀더 간단하게 나타낼수 있다
	   move(0,0);
   }
   public Point(int x, int y){
	   //this.x=x; this.y=y;아래처럼 좀더 간단하게 나타낼수 있다
	   move(x,y);
   }
   public Point(Point p){
	 //this (p.x,p.y);아래처럼 좀더 간단하게 나타낼수 있다
	   move(p.x,p.y);
   }
	
	//3.필요한 멤버메소드
	
    //grtter.setter
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
	//x,y의 값이 주어졌을때 멤버변수의 값 변경
	//리턴타입필요없음
	public void move(int x, int y){
		setX(x); //this.x=x;
		setY(y); //this.x=y;
	}
	//현재좌표출력
	public void print(){
		//(1,2)
		System.out.println("("+x+","+y+")");
	}
	// 다른점과의 거리계산 
	
	public double distance (Point p){
	
	/*	int dx= p.x-x;
		int dy= p.y-y;
		return Math.sqrt(Math.pow(dx, 2.0)+Math.pow(dy, 2.0));
		코드중복피하기 . 아래처럼간단하게 나타낼수 있음  */
		return distance(p.x, p.y);
	}
	
	public double distance (int x , int y){
		int dx= x - this.x;
		int dy= y - this.y;
		return Math.sqrt(Math.pow(dx, 2.0)+Math.pow(dy, 2.0));
	}
	
	public void moveUp(){  y--;} 
	public void moveDown(){  y++;}
	public void moveLeft(){  x--;} 
	public void moveRight(){  x++;}
	
	
}
