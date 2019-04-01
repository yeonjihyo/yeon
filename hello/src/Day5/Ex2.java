package Day5;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 배열
		/*
		 * 배열은 같은 의미를 가지는 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 배열의 장점 : 물리적으로 연속된 공간으로 배열을 생성하기 떄문에 접근이 빠르다.
		 * 
		 * //정수형 변수를 국어 영어 수학 체육성적과 학년 반 번호를 저장하기 위해서 배열로 만든다.
		//학생7명의 정수형 변수 국어 성적을 배열로 만든다.
		//100 100 100 100 1 1 1
		//100 90 90 80 70 100 50
		//같은의미를가지는거로 생각하는게 
		
		 * 
		 * 
		 * 
		 * 자료형[]배열이름; //배열을 선언
		 * 배열이름 = new 자료형 [배열의크기]; //배열생성
		 * 자료형 배열이름[]; //배열을 선언
		 * 배열이름 = new 자료형 [배열의크기]; //배열생성
		 * 배열의 시작번지는 0번지부터이다.
		 * 배열의 마지막번지는 배열의크기-1번지까지이다.
		 * 배열은 주로 반복문과 사용된다.
		 * 잘못된번지로접근하면 예외가 발생한다.
		 * =>ArrayIndexOutOfBoundsException
		 * 배열이름.length : 배열의 크기를 알려줌
		 * 자료형[] 배열이름= new int[]{값1,값2,값3 ...};
		 * 자료형[] 배열이름= {값1,값2,값3 ...};
		 * 보통선언하고 그떄그떄입력하는데 위에2개처럼 선언과동시에 초기화도할수있지만 잘하지않음
		 * 
		 * 
		 * */
		/*
		int [] kor;
		kor = new int[10];
		//int [] kor = new int[10];
		//위에처럼한번에써도됨
		
		kor[0]=10;
		System.out.println(kor[0]);
		System.out.println(kor[9]);
		
		
		//kor[0]은 10으로 지정했기때문에 10이 뜨고 나머진지정하지않았기떄문에 0이뜸
		//System.out.println(kor[10]);//예외발생
		
		
		int i;
		for (i=0;i<kor.length;i++){
			System.out.println(i+"번지 : " + kor[i]);
		}
		Scanner scan = new Scanner(System.in);
		for (i=0;i<3;i++){
			kor[i]=scan.nextInt();
		}
		scan.close();
		int [] eng;
		eng=kor;
		for (i=0;i<eng.length;i++){
			System.out.println(i+"번지 : " + eng[i]);
		}
		eng[9]=100;
		for (i=0;i<eng.length;i++){
			System.out.println(i+"번지 : " + kor[i]);
		}
		//위는잘못된예 이렇게되면 값이 잘못나옴
		
		eng=new int[10]; //eng배열생성
		//kor배열의 값을 eng배열에 복사
		for(i=0;i<eng.length;i++){
			eng[i] = kor[i];		
		}
		
		*/
		
		
		
		
		/*7개의 정수형 배열을 생성하고 0번지에는 0 1번지에는 1...6번지에는 6을 넣는 코드를 작성하세요*/
		/*
		int [] num;
		num = new int[7];
		int i=0;
		for(i=0;i<num.length;i++){
			num[i] = i ;
			System.out.println(num[i]);
		}
		*/
		//7개를저장할수있는정수형배열을 생성하고 각번지에1~45사이의 랜덤한수를 생성하여 저장하는 코드를 작성하세요
		
		int [] num;
		num = new int[7];
		int i=0;
		for(i=0;i<num.length;i++){
			num[i]=(int)(Math.random()*45+1) ;
			//num[i]=(int)(Math.random()*(45-1+1))+1 ;
			// <이므로 45는 포함되지않는 0~44까지이므로 1을더한다
			
			System.out.println(num[i]);
		}
		
		
	}

}
