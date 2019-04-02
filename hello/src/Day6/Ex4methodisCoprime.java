package Day6;

public class Ex4methodisCoprime {

	public static void main(String[] args) {
		int num1=7, num2=9;
		if(isCoprime(num1,num2)){
			System.out.println("두 수는 서로소");
		}else{
			System.out.println("두 수는 서로소아님");
		}
	}
	//공약수예제가져오기.이용해서 구하기
	public static int gcd(int num1,int num2){
		int gcdNum =1;
		for(int i=1;i<=num1;i++){
		if(num1%i==0 && num2%i==0){
				gcdNum = i;
			}
		}
		
		return gcdNum;
	}
	
	/*
	 * 기능 : 두 정수가 주어지면 서로소인지 아닌지를 참 또는 거짓으로 아려주는 메소드
	 * 매개변수 : 두 정수 => int num1 , num 2
	 * 리턴타입 참또는 거짓 => boolean
	 * 메소드명 : isCoprime
	 * */
	public static  boolean isCoprime(int num1, int num2){
		if(gcd(num1,num2)==1){
			return true;
		}else{
			return false;
			//if(gcd(num1,num2)==1)      return true;
			//else                       return false;
			//이렇게 중괄호 생략해서 쓸수도 있다
		}
	}	
	
	
	
	
}
