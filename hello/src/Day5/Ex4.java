package Day5;

public class Ex4 {

	public static void main(String[] args) {
		
		
		/*두수의 최대공약수를 구하는 코드를 작성하시오
		 * 최대공약수:두수의공약수중가장큰공약수
		 * 공약수: 두수의약수중에서공통으로들어가있는약수
		 * 8의약수 1 2 4 8
		 * 12의약수 1 2 3 4 6 12
		 * 8과12의공약수 1 2 4
		 * 8과12의 최대공약수 4 
		 
		 int num1=8, num2=12, gcd=1, i=1;
		for (gcd=1, i=1;i<=num1;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println(num1+"과"+num2+"의최대공약수"+gcd);
		*/
		
		//두수 공약수들을 배열에 저장하여 출력하는 코드를 작성하세요
		//공약수는 최대10개까지 저장
		 
		int num1=8, num2=12; 
		int i;
		int[]arr=new int[10];//추가된부분
		int cnt=0;//공약수의갯수,추가된부분
		for(i=1 ; i<=num1 ; i++){
			if(cnt == 10){  //좀더안전하게하려면 추가
				break;      //좀더안전하게하려면 추가
			}               //좀더안전하게하려면 추가
			if(num1%i==0 && num2%i==0){
					arr[cnt] = i; //추가된부분
					cnt++; //추가된부분,공약수갯수를하나증가
				}
			}
		//추가된부분
		 for(int j=0;j<cnt;j++){
		 System.out.print(arr[j]+" ");
		 }
		

		 
	}

}
