package day11;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(calc(1,0,'/'));
		}catch (Exception e) {
			// TODO Auto-generated catch block
			//Exception e = new Exception("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}finally{//예외가 되도 실행 안되도 실행 =>무조건실행
			System.out.println("예외처리가 끝나면 무조건 실행되는 곳");
		}

	}
	public static double calc(int num1,int num2, char op)
	throws Exception{
		double res = 0.0;
		if(op=='/' && num2==0){
			//throw new Exception("0으로 나눌 수 없습니다."); 
			Exception e = new Exception("0으로 나눌 수 없습니다.");
			throw e;
		}
		switch(op){
		case '+' : res=num1+num2; break;
		case '-' : res=num1-num2; break;
		case '*' : res=num1*num2; break;
		case '/' : res=(double)num1/num2; break;
		case '%' : res=num1%num2; break;
		}
		return res;
	}
}
