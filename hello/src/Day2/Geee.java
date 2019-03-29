package Day2;

import java.util.Scanner;

public class Geee {

	public static void main(String[] args) {
		//정수를입력받아 10이 짝수인지 아닌지확인하는코드를 입력하시오
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isEven = num % 2 ==0;
		(num을 2로 나누었을떄 나머지가 0과 같다)
		System.out.println(isEven);
		scan.close();*/
		
		//10을3으로나누었을떄값을입력하시오
		/*int num1=10, num2=3;
		double res;
		res=num1/(double)num2;
		System.out.println(res);*/
		
		//나이가20이상이면성인이라고출력하고20미만이면청소년이라고출력하는코드를작성하시오
		/*int num = 21;
		if(num >=20){
			System.out.println("성인");
		}
		else{
			System.out.println("청소년");
			}*/
		
		
		 //num이0이면0이라고 출력하고1이면1이라고출력하고 0과1이아니면0과1이아닙니다라고 출력하는 예쩨
		/*int num=0;
		//num가 0이면
		//num가0과같다면
		if(num == 0){
			System.out.println("0입니다,");
		}else if (num == 1){
			System.out.println("1입니다.");
		}
		else{//num!=0 && num ! =1
			System.out.println("0과1이아닙니다.");
		}*/
		
		
		//num가 2의배수이면 2의배수라고 출력하는 예제
		//2 4 6 8 10 ..
		//num를 2오 나누었을떄 나머지가 0과같다면 2의 배수
		/*int num=4;
		if(num % 2 == 0){
			System.out.println(num+"는2의배수");
		}*/
		
		//num가 2의 배수이면 2의 배수라고 출력하고
		//num가 3의 배수이면 3의 배수라고 출력하고
		//num가 6의 배수이면 6의 배수라고 출력하고
		//num가 2,3,6,의배수가아니면 2,3,6의 배수가 아닙니다
		//라고출력하는예제
		//num = 6 => 6의 배수입니다만 출력해야한다
		
		/*
		 * int num=6;
		 * num가 6의배수이면
		if (num % 6 == 0){
			System.out.println(num+ "는6의배수");
		}else if (num % 3 == 0 ){
			System.out.println(num+ "3의배수");
		}else if (num % 2 == 0){
			System.out.println(num+"2의배수");
		}else{
			System.out.println(num+ "2,3,6의 배수가 아닙니다");
		}*/
		//위부터처리하기떄문에 6의배수를먼저 써야함
	
		//점수가주어지면점수에맞는학점을출력하는코드를작성하시오
		//90점이상 ~100점이하 :A
		//80점이상 ~90점미만 :B
		//70점이상 ~80점미만 :C
		//60점이상 ~70점미만 :D
		//0점이상 ~60점미만 :F
		//0점미만,100점초과 : 잘못된점수입니다.
		/*int num = 90;
		if (num>=90 && num<=100){
			System.out.println("A");
		}
		else if(num>=80 && num<90){
			System.out.println("B");
		}
		else if(num>=70 && num<80){
			System.out.println("C");
		}
		else if(num>=60 && num<70){
			System.out.println("D");
		}
		else if(num>=0 && num<60){
			System.out.println("F");
		}else{
			System.out.println("잘못된점수입니다.");
		}
		
		다른방법
		 * Scanner scan = new Scanner(System.in);
		double score = scan.nextdouble();
		if~~~
		scan.close();
		
		다른방법2
		스캐너이용
		if((int)score/10 == 9 || score==100)
		10자리수가9일경우로 해석함
		else if ((int)score/10 == 8){
		*/
		
		
		
		
		
		
		
	} 
}


