package Day10;



public class Rect extends Shape  {
	private int area;
	
	public int getArea() {
		return area;
	}
	//setter를 필요하지 않다.
	//외부에서만 데이터를 접근할 수 있도록 하는 것이기 떄문에 예를 들면 4*8은 32인데 30을 주라고 할수있으니까???
	public Rect(){}//안정성을 위해 추가 
	public Rect (int x,int y, int w, int h){
		super(x,y,w,h);//부모클래스의 생성자를 호출
		area =w*h;
	}
	@Override
	public void print(){
		super.print();
		System.out.println("넓이: "+ area);
	}

	//가로와 세로를 재설정할경우 
	public void resize(int width, int height){
		this.width=width;
		this.height=height;
		area= width*height;
	}
	
}
