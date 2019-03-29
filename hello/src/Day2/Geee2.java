package Day2;

import java.util.Scanner;

public class Geee2 {

	public static void main(String[] args) {
	/*int num =6;
		if(num%2==0 && num%3==0){
			System.out.println(num+"6의 배수");
		}*/
		
		//num가 2의 배수이면 2의 배수라고 출력하고
		//num가 3의 배수이면 3의 배수라고 출력하고
		//num가 6의 배수이면 6의 배수라고 출력하고
		//num가 2,3,6,의배수가아니면 2,3,6의 배수가 아닙니다
		//라고출력하는예제
		//num = 6 => 6의 배수입니다만 출력해야한다
		
		//앞서한방식말고 중첩if문을이용한방법
		/*int num = 6;
		if(num % 2 == 0){
			if(num % 3 == 0){
				System.out.println(num+"는6의배수");
			}else {
			System.out.println(num+"는2의배수");
		}
		}else if (num % 3 == 0){
				System.out.println(num+"는3의배수");	
		}else{
			System.out.println(num+"는2,3,6의배수가아닙니다.");
		}
		*/

		
		/*int num = 3;
		switch(num%2){
		case 0: //if(num % 2 == o)
			System.out.println("짝수");
			break;
			//..
		case 1: //값이2가지이므로 default:로해도됨 
			System.out.println("홀수");
			
			}	
			*/
		
		
		/*달력의 각 달마다 마지막 일수가 다릅니다
		 * 달이입력되면 해당하는 마지막 일수를출력하는코드를 switch case문을 이용하여 작성하시오
		 * 31 : 1,3,5,7,8,10,12
		 * 30 : 4,6,9,11
		 * 28 : 2
		   
		 * int month = 3;
		switch(month){
		case 1 : 
			System.out.println("31");
		break;
		case 2 : 
			System.out.println("28");
		break;
		case 3 : 
			System.out.println("31");
		break;
		case 4 : 
			System.out.println("30");
		break;
		case 5 : 
			System.out.println("31");
		break;
		case 6 : 
			System.out.println("30");
		break;
		case 7 : 
			System.out.println("31");
		break;
		case 8 : 
			System.out.println("31");
		break;
		case 9 : 
			System.out.println("30");
		break;
		case 10 : 
			System.out.println("31");
		break;
		case 11 : 
			System.out.println("30");
		break;
		case 12 : 
			System.out.println("31");
		break;
		default:
			System.out.println("잘못입력했습니다");
		}
		default는 생략가능하지만 쓴다면 저렇게 
		if (month ==1 || month ==3 || ) if를이용하면이런식을하면됨*/
		
		//min~max 사이의 정수를 랜덤으로 생성하는 코드
		/*int min = 1;
		int max = 10;
		int random = (int)(Math.random()*(max-min+1) + min);
		System.out.println(random);*/
		//컴이 가위 바위 보중에서 랜덤으로하나선탣
		/*
		 * int min = 1;
		int max = 3;
		int com = (int)(Math.random()*(max-min+1) + min);
		int user = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3)중하나를입력하세요");
		user = scan.nextInt();
		switch (user-com) {
		case 0:
			System.out.println("무승부입니다.");
			break;
		case -1: case2:
			System.out.println("컴퓨터승입니다");
		case 1: case-2:  //default로 대체가능
			System.out.println("사용자승입니다");
		}
		//System.out.println(com);
		//152페이지부터 참고
		
		*/
		
	
	}

}
