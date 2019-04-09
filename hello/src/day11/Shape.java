package day11;

import Day10.Point;

public class Shape implements Draw {
	private Point center;
	private double width;
	private double height;
	
	//Shape 클래스를 통해(상속도포함) 만들어진 객체의 갯수를 저장하는 변수
	public static int count=0;
	
	//클래스멤버변수count의 값을 출력하는 클래스 멤버 메소드
	public static void printcount(){
		System.out.println("총 만들어진 도형 : "+ count);
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	public void setCenter(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}//기존것도 살리고 x,y도 추가

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println("-------------------");
		System.out.println("중심점 : ");
		center.print();
		System.out.println("가로 : "+ width);
		System.out.println("세로 : "+ height);
		System.out.println("-------------------");

	}

	@Override
	public void resize(double width, double height) {
		this.width=width;
		this.height=height;
		

	}

	@Override
	public void move(int x, int y) {
		this.setCenter(x,y);

	}
	public Shape(){
		center = new Point();
		count++;
	}
	public Shape(Shape s){
		center = new Point();
		resize(s.width,s.height);
		this.center=new Point (s.center);
		count++;
	}
	public Shape (int x, int y , int width, int height){
		this.center=new Point(x,y);
		resize(width,height);
		count++;
	}
	
	
	//451p
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Shape){
			Shape s = (Shape)obj; //조건문이참이기떄문에가능
			if (s.width!=this.width) return false;
			if (s.height!=this.height) return false;
			if (s.getCenter().getX()!=this.getCenter().getX()) return false;
			if (s.getCenter().getY()!=this.getCenter().getY()) return false;
			return true;
		}
		return false;
	}
	//toString
	@Override
	public String toString() {
		return "Shape [center=" + center + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}



/*
 * 책앞에 포스트잇그림으로이해 .
 * 객체멤버메소드에서 클래스멤버변수를 사용할수있다?
 * yes 
 * 클래스멤버변수는 클래스이름 통해 사용 가능 
 * => 객제 생성없이 사용가능
 * => 객체가 생성되고 나서도 사용가능
 * 클래스 멤버메소드에서 객체멤버변수를 사용할수 있다?
 * no
 * 객체멤버변수는 객체를 생성하고 사용가능
 * 클래스멤버메소드는 객체생성없이사용가능한데
 * 클래스 멤버메소드 안에 객체멤버변수가 있다면
 * 객체를 안만든상태에서 객체멤버변수를 사용하려하기때문에 에러가 난다
 *  
 * 
 * */
 