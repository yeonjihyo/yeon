package Day4;

public class Zzzz2 {

	public static void main(String[] args) {
		

			     /* 
			   *          i=1  공=5  *=1
		    ***         i=2  공=4  *=3
		   *****        i=3  공=3  *=5
		  *******       i=4  공=2  *=7
		 *********      i=5  공=1  *=9
		***********     i=6  공=0  *=11
							공=6-i  *=2*i-1
			
			
			*/
			
		/*	
			
		int i=0, j=0;
		for(i=1;i<=6 ;i++){
			for( j=1 ; j<=6-i ; j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println( );
				
				
				/*
				*********   i=1 *=9 공=0 5=>6-i
				 *******    i=2 *=7 공=1 4
				  *****     i=3 *=5 공=2 3
				   ***      i=4 *=3 공=3 2
				    *       i=5 *=1 공=4 1
				           공=i-1 *= 2*(6-i)-1
				                2(5+1-i)-1
				                
				           
				          
		int num=5;
		int i, j;
		for(i=1;i<=num;i++){
			for(j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*(num-i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		*********   i=5 *=9 공=0 5=>6-i
		 *******    i=4 *=7 공=1 4
		  *****     i=3 *=5 공=2 3
		   ***      i=2 *=3 공=3 2
		    *       i=1 *=1 공=4 1
		           		공=5-i        *= 2*(6-i)-1
		                  =num-i       = 2*i-1
		                
		           
		   
			
		num=5;
		for(i=5;i>=1;i--){
			for(j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();			
		}
		*/
		
		
		
		/*정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 코드를 반복문을 이용하여 작성	
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1,cnt=0; i<=num; i++){
			if(num % i ==0){
				cnt++;
			}
		}
		if(cnt ==2){
			System.out.println(num+"는소수");
		}
		else{
			System.out.println(num+"는소수가아님");
		} */
		
		//100이하의소수를모두출력하는코드를작성하세요
		
		int num=7,i,cnt=0;
		for(num=1; num<=100;num++){
			for(i=1,cnt=0; i<=num; i++){
				if(num % i ==0){
					cnt++;
				}
			}
			if(cnt ==2){
				System.out.print(num+" ");
			}
		}
		System.out.println();
		
		
		
	}

}
