package test2;

import Day10.Point;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p=new Point3D();
		p.print();
		p.move(1,1,1);
		p.print();

	}
}

class Point3D extends Point{
	//x,y는 Point 클래스에서 상속받아 안보이지만 존재하나 x,y의 접근제한자가 private이어서 
	//직접적으로 접근할 수 없다. setter와 getter를 이용하여 접근해야 한다.
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//메소드 오버로딩
	public void move(int x,int y,int z){
		super.move(x,y);
		this.z=z;
	}
	//메소드 오버라이딩
	@Override
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");//부모여도 프라이빗이기때문에 getX(),getY()를 불러와야 한다 
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")";
	}
	//생성자
	public Point3D(){
		//super(); //상속받았기 때문에 자동으로 호출. 단 기본생성자가 있을 경우  
		//각자료형의 기본값 순서 떄문에 
		/*
		 멤버 변수 초기화 순서
	 	각 자료형에 대한 기본값 : x의 자료형 int는 기본값이 0 =>명시적초기화 : x=0 =>초기화 블록: {x=0} =>생성자  
		 * */
	}
	public Point3D(int x,int y,int z){
		move(x,y,z);
	}
	public Point3D(Point3D p){
		move(p.getX(),p.getY(),p.z);
	}
}