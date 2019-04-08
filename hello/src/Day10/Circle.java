package Day10;

public class Circle extends Shape {
	private int redius;

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}
	@Override //오버라이딩하는경우 써주는게 좋음 
	public void print(){//오버라이딩.328p .부모에게서 상속받은 내용을 변경 
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름 : "+redius);	
	}
	
	public Circle (){
		//super(); 부모클래스의 생성자 생략되있음
		
	}
	public Circle(int x, int y,int r){
		super(x,y,r,r);//shape에서 
		redius =r;
	}
}
