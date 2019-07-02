package test2;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//인터페이스는 기능 명세다.
//장점: 기능들을 일목요연하게 볼 수 있다 
//	     통일성을 갖출 수 있다. 
interface Draw{
	public void resize(int width, int height);//추상메소드 
	public void move(int x, int y);
}
class Rect implements Draw{

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}