package ex;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=1.23, num2=0;
		char op = '/';
		double res;
		try {
		System.out.println(calculate(num1,num2,'/'));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		

	}
	/*두수와 산술연산자가 주어지면  값을 출력하는 메소드
	 * 매개변수 double num1, double num2, char op
	 * 리턴타입 double
	 * 메소드명 calculate
	 * */
	
	//메소드에 static멤버메소드을 쓴 이유 : 일반멤버메소드면 메인에서 호출이 불가능함 =>메인은 static이기때문에 메인에서 쓰기 위해서 
	public static double calculate(double num1, double num2, char op) throws Exception{ 
		double res=0.0;
		switch (op){
		case '+' : res=num1+num2; break;
		case '-' : res=num1-num2; break;
		case '*' : res=num1*num2; break;
		case '/' : 
			if (num2==0) throw new Exception ("0으로 나눌 수 없습니다.");
			res=num1/num2; break;
		case '%' :
			if (num2==0) throw new Exception ("0으로 나눌 수 없습니다.");
			res=num1%num2; break;
	
		default : 
			/*res=0.0; 위에서 초기화 햇으니까 생략*/
			throw new Exception ("잘못된 연산자입니다.");
		}
		return res;
	}
}
