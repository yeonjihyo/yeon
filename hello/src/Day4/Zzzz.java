package Day4;

import java.util.Scanner;

public class Zzzz {

	public static void main(String[] args) {
	/*
		//두정수를입력받아두정수의합을출력하는코드를작성하시오
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println(num1+"과"+num2+"의합은"+(num1+num2));
		//System.out.println(num1+num2);
		scan.close();
	
		
		//두정수와산술연산자를입력받아연산결과를출력하는코드를작성하세요
		//char op = scan.next().charAt(0);
		//10 20 + 
		//30
		
		int num1, num2;
		char op;
		Scanner scan = new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		op=scan.next().charAt(0);
		//System.out.println(""+ num1 + op + num2);
		switch (op){
		case '+':
			 System.out.println(""+num1 + op + num2 +"="+(num1+num2));
		 break;
		case '-':
			 System.out.println(""+num1 + op + num2 +"="+(num1-num2));
		 break;
		case '*':
			 System.out.println(""+num1 + op + num2 +"="+(num1*num2));
		 break;
		case '/':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			default:
	    	 	System.out.println(""+num1 + op + num2 +"="+((double)num1/num2));
			}
			break;
		case '%':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
			    break;
			default:
	    	   System.out.println(""+num1 + op + num2 +"="+((double)num1%num2));
			}
			break;
		 default:
			 System.out.println(op+"는잘못된산술연산자입니다/");
			break;
		}

	 	*/
	
	
		//1부터100까지짝수만출력하는코드를작성하세요 
		/*
		 * 
		 방법1
		 * int i=0; 
		for(i=1;i<=100;i++){
			if(i%2==0){
			System.out.println(i);
			}
		}

		 방법2
			int i;
		  for(i=2;i<=100;i+=2){
		  	System.out.println(i);
		  }
		  
			
	        방법3
		  int i=0; 
			for(i=1;i<=100;i++){
				if(i%2==1){
					continue;
				System.out.println(i);
				}
			}
		
			 */
		
		
		
		//두수의 공약수를 출력하는 코드를 작성하세요
		//8과12의 공약수  : 1 2 4
		
	 	int num1=8, num2=12, gcd=1, i=1;
	 	System.out.print(num1+"과"+num2+"의공약수: ");
		 for (gcd=1, i=1 ; i<=num1 ;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
				System.out.print(i+" ");
			}
		}
		 System.out.println(" ");
		System.out.println( num1+"과"+num2+"의 최대공약수: "+gcd);
		
		
		
		
		
		
		
	}
}
