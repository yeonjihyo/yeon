package day15;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect2 r=new Rect2();
		r.width=10;
		r.height=5;
		r.centerX=0;
		r.centerY=0;
		r.print();
		r.move(5, 5);
		r.print();
		r.resize(5, 5);
		r.print();
				

	}

}

class Rect2{
	
	public int width; 
	public int height;
	public int centerX;
	public int centerY;
	
	public void print(){
		System.out.println("중심점 : " + centerX+","+centerY);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + width*height);
	}
	
	public void move(int x, int y){
		this.centerX=x;
		this.centerY=y;			
	}
	public void resize(int width, int height){
		this.width=width;
		this.height=height;
	}
}