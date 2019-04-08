package Day10;

public class Triangle extends Shape {
	double area;
	double getArea(){
		return area;
	}
	
	public Triangle(){}//생성자 리턴타입없고 클래스명과같다
						//기본생성자일때 초기화 할필요없다 앞서 w h 가 0이기때문에 
	public Triangle(int x, int y, int w, int h){
		super(x,y,w,h);
		area = w*h/2.0;
	}
	@Override
	public void print(){
		System.out.println("삼각형");
		super.print();
		System.out.println("넓이 : "+ area);
	}
	
}
