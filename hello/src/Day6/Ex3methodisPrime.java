package Day6;

public class Ex3methodisPrime {

	public static void main(String[] args) {
		int num = 8;
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
		
		
	}
	/*
	 * 기능 : 정소가 주어지면 해당 정수가 소수이면 참을 합성수이면 거짓을 알려주는 메서드
	 * 매개변수 (입력): 정수=> int num
	 * 리턴타입 (출력): 참 거짓 => boolean 
	 * 메소드명 : isPrime
	 * 
	 * */	
	public static boolean isPrime(int num){
		int cnt=0;
				//복사해오면 cnt가 지역변수라 빨간줄뜨기때문에 선언을해줘야함
		for(int i=1 ; i<=num ; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt ==2){
			 return true;
		}else{
			 return false;
		}
		 //return false;//unreachable code가 뜨는데 둘다 리턴을하니까 리턴은 해당값을던져주면서 종료하라는거니까 종료되기떄문에 실행될일이 없다 그러므로 지운다
	}

}
