package day14;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		System.out.println(1.0/0.0);
	try {
		System.out.println(calc(1.0,0.0,'/'));// '/'에 ? 넣으면 잘못된연사지입니다라고 출력결과가 나옴 
	} catch (Exception e1) {
		System.out.println (e1.getMessage());
		e1.printStackTrace();
	}	
		/*int num=0;
		try{
			num=1/0;//예외가 발생할수 있는 코드
		}catch(ArithmeticException e){
			System.out.println("계산관련예외가 발생했습니다.");
			e.printStackTrace();
		}
		catch(Exception e){//없어도되지만 넣을거라면 항상 마지막에 있어야 함. 나머지 예외들을 처리할수있게 하는 전체를 의미하기 때문에
			e.printStackTrace(); //어디서 발생한건지 확인해보고싶다 //예외발생한 순서를 확인해보고싶다
		}
		
		System.out.println(num);
		
		//ArithmeticException 계산관련 예외 발생=>try-catch문으로 예외처리하기 
*/
	}

	//메소드내부에서 예외가 발생하면 내부에서 처리할떄 try-catch문을 쓴다// 
	//직접처리안하고 다른누군가에게 처리하게 할떄 throw//
	
	
	public static double calc(double num1, double num2, char op)
			throws Exception, ArithmeticException{
		double res = 0.0;
		if((op == '/' || op =='%' ) && num2 == 0.0) 
			throw new ArithmeticException("0으로 나눌 수 없습니다");
		switch(op){
		case '+' : res= num1+num2;          break;
		case '-' : res= num1-num2;          break;
		case '*' : res= num1*num2;          break;
		case '/' : res= num1/num2;          break;
		case '%' : res= num1%num2;          break;
		default :  
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
}

