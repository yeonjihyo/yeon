
package ex;
//접근제한자 default가 생략돼 있기 때문에 같은 패키지이기때문에 import는 안써도 된다  

//3차원 좌표 평면의 점을 나타내는 point3d 클래스를 생성하세요
public class  point3d extends point {
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	public point3d(){} //기본생성자
	public point3d(int x, int y, int z){ 
		move(x,y,z);	
	}
	public point3d(point3d p){
		move(p.getX(),p.getY(),p.z);
		//x와 y는 부모의 멤버 변수를 상속 받았고 접근제한자가 private이기 때문에 
		//직접 접근할 수 없다. 따라서 getter를 이용하여 접근한다
	}
	//메소드 오버라이딩 =>메소드이름도같고 매개변수도 같기 때문에 (오버로딩과 오버라이딩은 메소드 선언부로 판단 )
	public void print(){
		/*super.print();
		System.out.println(","+z);*/ //그대로 가져다 쓰면 이렇게 하면 되지만 괄호 안에 z가 들어가야 하기 때문에 아래처럼 해야함
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
	//메소드 오버로딩
	public void move(int x, int y, int z){
		move(x,y);//point클래스에 있는 move메소드 =>상속받았기때문에 오버로딩임
		this.z=z;
	}
}
