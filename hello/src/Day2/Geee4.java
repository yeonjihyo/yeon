package Day2;

import java.util.Scanner;

public class Geee4 {

	public static void main(String[] args) {
		
		/*구구단의7단을출력하는코드를반복문을이용하여작성하세요
		int i=0;
		int num = 7;
		for(i=1; i<=9 ; i++ ){
			System.out.println("7x " + i +" = " +num*i);
	}*/
			
		
		//정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 코드를 반복문을 이용하여 작성하세요
		//소수:약수가 1과자기자신인수, 약수가2개인수
		//약수: 자신보다 작거나 같은 수중에서 나누어 나머지가 0인수
		//4의 약수 1 2 4
		//입력받은정수 :num
		//약수의갯수 : cnt
		//반복문에서 사용할 변수 : i
		//반복횟수 : i는 1부터 num보다 작거나 같을때 가지1씩 증가한다
		//실행문
		//i가 num의 약수이면 약수의 갯수를 하나증가
		//반복문종료후약수의갯수가2개이면 소수라고출력
		//2개가아니면소수가아님이라고출력
		
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		//반복횟수 : i는 1부터 num보다 작거나 같을떄까지 1씩 증가한다
		for(i=1,cnt=0; i<=num; i++){
			//i가 num의 약수이면 약수의 갯술르 하나증가
			//num를 i로 나누었을때 나머지가 0과 같다 =>i가 num의 약수
			if(num % i ==0){
				//if(i가 num의 약수)
				cnt++;//cnt +=1;//cnt=cnt+1//++cnt;
			}
		}
		//약수의 갯수가 2개이면 소수라고 출력
		if(cnt ==2){
			System.out.println(num+"는소수");
		}
	
		//2개가 아니면 소수가 아님이라고출력
		else{
			System.out.println(num+"는소수가아님");
		}
	
	

	}

}
