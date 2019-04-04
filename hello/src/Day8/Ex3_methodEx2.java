package Day8;

public class Ex3_methodEx2 {

	public static void main(String[] args) {
		/*double res=calc(1,2,'+');
		System.out.println(res);
		*/
		System.out.println(calc(1,2,'+'));
		System.out.println(calc(1,2,'-'));
		System.out.println(calc(1,2,'*'));
		System.out.println(calc(1,2,'/'));
		System.out.println(calc(1,2,'%'));
		

	}
	
	/*
	 * 기능 : 두 정수의 산술연산결과를 알려주는 메소드 
	 * 매개변수 : 두 정수,산술연산자 => int num1, int num2, char op
	 * 리턴타입 : 산술연산결과 => 실수 => double
	 * 메소드명 : calc (calulate 계산하다)
	 * 
	 * */
	public static double calc(int num1, int num2,char op){
		double res=0.0;
		switch(op){
		case '+' :
			res=num1+num2;
			break;
			//case '+' : return num1+num2; 으로도 가능하다
		case '-' : 
			res=num1-num2;
			break;
		case '*' : 
			res=num1*num2;
			break;
		case '/' : 
			res=(double)num1/num2;
			break;
		case '%' : 
			res=num1%num2;
			break;
			//위에서 초기에 res를 0.0으로 초기화했기떄문에 default: res=0.0;이 생략가능하다
			
		}
		
		return res;
	}
	
	
	
	//다른방법

}
