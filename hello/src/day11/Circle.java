package day11;

import Day10.Point;

public class Circle extends Shape {
	
	public double getRedius(){
		return getWidth()/2;
	}
	public double getArea(){
	return getRedius()*getRedius()*Math.PI;
	}
	@Override
	public void print(){
		System.out.println("-------------------");
		System.out.println("중심점 : ");
		getCenter().print();
		System.out.println("반지름 : " + getRedius());
		System.out.println("넓이 : " + getArea());
		System.out.println("-------------------");
	}
	public void resize(double r){
		setWidth (r*2);
		setHeight (r*2);
	}
	public Circle(){ } //객체가 없기때문에 부모의 기본생성자 호출해서 기본값으로 초기화 시키면됨
	public Circle(int x, int y, int r){ 
		super(x,y,r*2,r*2);
	}

}
