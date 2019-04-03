package Day7;

public class Ex8 {
	

	public static void main(String[] args) {
		//재사용성이 높은 메소드를 만드는 예제
		printchar (5,'*');
	}
		// **********
		//위처럼 출력 되도록 메소드를 만들어 보세요
		
		/*
		 * 기능      : 문자인*을 10개 출력하는 메소드
		 * 매개변수 : char
		 * 리턴타입 : void
		 * 메소드명 : printchar
		 * */
	public static void printchar (int cnt,char ch){
		for(int i=1;i<=cnt;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
}