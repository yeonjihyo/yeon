package ex;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc(1,2,'+');

		
	}
/*산술연산자를 이용한 계산하는 예제를 메소드를 이용하여 작성하세요
 * 1.메소드를 이용하지 않고 산술연산자를 입력받아 계산하는 예제 작성
 * 2.메소드를 이용
 * 3.예외처리 
 * */
	/*두수와 산술연산자가 주어지면  계산하는 메소드
	 * 매개변수 double num1, double num2, char op
	 * 리턴타입 void
	 * 메소드명 calc    
	 * */
	public static void calc ( double num1, double num2, char op){
		switch (op){
		case '+' : System.out.println(num1+num2); break;
		case '-' : System.out.println(num1-num2); break;
		case '*' : System.out.println(num1*num2); break;
		case '/' : System.out.println(num1/num2); break;
		case '%' : System.out.println(num1%num2); break;
		}
	}
}

