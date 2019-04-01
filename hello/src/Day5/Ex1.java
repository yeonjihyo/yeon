package Day5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	/*	int i, j ;
		for(i=1; ; i++){
			    if(i>3){
					break;
				}
				for(j=1 ; ; j++){
					if(j>5){
						break;
					}
					System.out.print("*");
				}
				System.out.println();
		}*/
		
		
		/*
		 * for(1.초기화;2,5,8조건식;4,7증감연산){
	 *  		3,6실행문
	 *  }
	 *  
	 *  1초기화;
	 *  while(2,5,8조건식){
	 *  	3,6실행문;
	 *  	4,7증감연산;
	 *  }
	 *  
	 *  
	 *  
	 *  무한루프 만드는 차이가있음
	 *  for문과 달리 while문은 조건식 생략불가능 
	 *  for(;;){
	 *  	실행문;
	 *  }
	 *  while(true){
	 *  	실행문
	 *  }
	 *  
	 *  
	 *  */
		/*
		//for문
		int i, sum;
		for (i=1,sum=0;i<=10;i++){
			sum+=i;
		}
		System.out.println(sum);*/
		
		/*//while문
		int i, sum;
		i=1;
		sum=0;
		while(i<=10){
			sum+=i;
			i++;
		}
		System.out.println(sum);
		*/
		
		
		/* 
		 * for, while : 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * do while : 조건식에 따라 무조건 1번은 실행된다.
		 * do{
		 * 		실행문;
		 * }while(조건식);
		 * 
		 * */
		
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 삭제");
			System.out.println("4.학생정보 확인");
			System.out.println("5.종료");
			System.out.println("메뉴를 선택하세요");
			menu= scan.nextInt();
		}while(menu != 5);
		scan.close();
	}

}
