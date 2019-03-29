package Day3;

import java.util.Scanner;

public class Aaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 5까지의 합을 구하는 코드를 반복문을 이용하여 작성하세요
		/* int i=0;
		int sum=0;
		for(i=1, sum=0 ;i<=5;i++) {
			sum=sum+i;
		}
			System.out.println(sum);*/
		//1부터 10까지 짝수의 합을 구하는 코드를 반복문을 이용하여 작성
			/*방법1:1부터 10까지 하나씩 증가하면서짝수이면더하고 홀수이면무시한다
			 * 방법2"1부터 10까지 2개씩증가하면서 더한다
			 * 방법3: 1부터5까지 하나씩증가하면서 해당수에 2를곱해더한다*/
		
		/*방법2
		int i=0;
		int sum=0;
		for (i=1, sum=0;i<=10;i++){
			if(i%2==0){
				sum+= i;
			
			}
		}
		System.out.println("1부터10까지짝수합"+ sum);
		
		방법2
		 * int i=0;
		int sum=0;
		for(i=2, sum=0;i<=10;i+=2){
			sum+=i;
		}
		
		System.out.println("1부터10까지짝수합:"+ sum);
		
		
		방법3
		int i=0;
		int sum=0;
		for(i=1, sum=0;i<=5;i++){
			sum+=i*2;
		}
		System.out.println("1부터10까지짝수합:"+ sum);
		
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
		
		/*
		 소수판별
		 i가 num의 약수이면
		 2가4의약수이면
		 num%i==0
		 */
		
		/*두수의 최대공약수를 구하는 코드를 작성하시오
		 * 최대공약수:두수의공약수중가장큰공약수
		 * 공약수: 두수의약수중에서공통으로들어가있는약수
		 * 8의약수 1 2 4 8
		 * 12의약수 1 2 3 4 6 12
		 * 8과12의공약수 1 2 4
		 * 8과12의 최대공약수 4 
		 * */
		
		/*
		 int num1=8, num2=12, gcd=1, i=1;
		for (gcd=1, i=1;i<=num1;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println(num1+"과"+num2+"의최대공약수"+gcd);
		*/
		
		/* 두수가 서로소인지 판별하세요
		 * 서로소란 두수의 최대공약수가1인두수사이의관계를말함
		 * 3과7은 서로소관계
		 * 4와6은서로소관계가아님
		 */
		/*
		int num1=3, num2=7, i=1, gcd=1;
		for(i=1, gcd=1;i<=num1;i++){
				if(num1%i==0 && num2%i==0){
					gcd=i;			
				}
		}
		//최대공약수가1과같으면서로소관계라고출력하고아니면서로소관계가아님
		if(gcd==1){
			System.out.println(num1+"과"+ num2 +"는 서로소");
		}else{
		System.out.println(num1+"과"+ num2 +"는 서로소아님");
		}
		
		
		*/
		
		
		/* 
		 *break와continue
		 break는 if문을 동반하며 break문을 만나는 순간 반복문을 빠져나감
		 continue는 if문을 동반하며 continue문을 만나면 아래 코드를 실행하지 않는다.
		 
		 
		 
		 
		 두수의 최소공배수를 구하는 코들르 작성하세요
		 최소공배수는 두수의 공배수중 가장작은 공배수
		 공배수는 두수의 배수중 공통으로 포함한 배수
		 10의 배수: 10 20 30 40 50 60...
		 15의 배수 : 15 30 45 60 75 90
		 10과 15의 공배수 : 30 60 90 120
		 10과 15의 최소공배수 : 30
		   
		  답		 
		int num1=10, num2=15, i=1, lcm=1;
		for(i=1,lcm=1 ; i<= num1*num2 ;i++){
			//num가 6의배수이면 => num % 6 == 0
			//i가 num의배수이면 => i % num1 == 0
			if(i % num1 == 0 && i % num2 == 0){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "과" + num2 + "의 최소공배수 : " +lcm);
		
		더간단한방법 
		
		
		int num1=10000, num2=20000, i=1, lcm=1;
		for(i=num1,lcm=1 ; i<= num1*num2 ;i+=num1){
			//num가 6의배수이면 => num % 6 == 0
			//i가 num의배수이면 => i % num1 == 0
			if(i % num2 ==0 ){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "과" + num2 + "의 최소공배수 : " +lcm);
		
		더더간단한방법
		
		
		int num1=10000, num2=20000, i=1, lcm=1;
		int tmp;
		if(num2>num1){
			//두수를바꾼다(23,24p참고)
			tmp = num1;
			num1= num2;
			num2 = tmp;
		}
		for(i=num1,lcm=1 ; i<= num1*num2 ;i+=num1){
			//num가 6의배수이면 => num % 6 == 0
			//i가 num의배수이면 => i % num1 == 0
			if(i % num2 ==0 ){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "과" + num2 + "의 최소공배수 : " +lcm);
		
		
		*/
		
	
	}
}
