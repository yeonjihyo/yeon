package Day9;
//다른 패키지에 있는 public을 사용하려면
// import 패키지.클래스명
//을 선언해야 해당클래스를 사용할 수 있다.
import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Scanner는 클래스고 scan은 객체고  Scanner(System.in);는 생성자 라생각하면
		
		//nextInt()는 Scanner 클래스의 멤버메소드
		//int num = scan.nextInt();
		//next()는 Scanner 클래스의 멤버메소드
		//charAt()는 String클래스의 멤버메소드
		//char ch = scan.next().charAt(0);
		//scan은 객체고 next()는리턴타입이 string인 결과를 나타내고 
		//그결과를 가지고 charAt(0) 을 통해 리턴티입이 char인 결과가 나오는것 
		
		int num1;
		num1=10;
		scan.close();
		
		Tv tv= new Tv();
		tv.printChannel();
		Tv tv2= new Tv();
		tv.printChannel();
		Tv tv3= tv; 
		System.out.println(Tv.BRAND);
		
		//같은패키지안에서 동일한 이름을 가지는 클래스를 선언할수없다.
		
	
		
		
	}

}
/*
class Tv{
			
		}*/
