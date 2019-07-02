package test;


public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.산술 연산하는 함수를 생성하여 테스트하는 코드를 작성하세요
		int num1=1, num2=3;
		char op = '/';
		double res=0.0;
		try{
			res= calc(num1,num2,op);
			System.out.println(""+num1+op+num2+"="+res); 
			//""있는이유: op가 아스키코드가 나옴 그래서 빈문자열을 넣어줘서 문자열+정수=문자열이기때문에 문자열이 나오게 만들어줌
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	/*
	 * 산술연산하는 메소드
	 * 매개변수 : int num1, int num2
	 * 리턴타입 : double
	 * 메소드명 calc
	 * */
	public static double calc(int num1, int num2, char op) throws Exception{
		double res=0.0;
		switch(op){
		case '+' : res=num1+num2; break;
		case '-' : res=num1-num2; break;
		case '*' : res=num1*num2; break;
		case '/' : 
			if(num2 ==0) 
				throw new ArithmeticException ("0으로 나눌 수 없습니다.");
			res=(double)num1/num2; 
			break;
		case '%' : 
			if(num2 ==0) 
				throw new ArithmeticException ("0으로 나눌 수 없습니다.");
			res=(double)num1%num2; 
			break;
		default:
			throw new Exception("잘못된 연산자입니다.");
		}return res;
	}

}

