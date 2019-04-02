package Day6;

public class Ex1method {

	public static void main(String[] args) {
		
		 /* sum()메소드가 printSum()메소드보다 재사용성이 높다 */
		System.out.println(sum(1,2));
		printSum(1,2);
		
		
	}
	
	
	//배열
	/*-같은의미와 같은자료형을가지는 변수들의집합
	inti,j,sum=0;
	for(i=1;i<=10;i++){
				sum+=i;
	}
	sysout(sum);
	 =>의미가다르기떄문에 같이안쓰는게좋다 
	(변수의목적이다름)
	
	-0번지부터시작 배열의크기-1번지까지접근이가능
	-배열선언 
	자료형 []배열이름,배열이름2;
	자료형 배열이름[],배열이름;
	//, 이생기면 의미가달라져서
	
	*/
	/*
	 * 메서드 : 하나의 특정작업을 수행하는 일련의 문장들을 하나로 묶은것
	 * 메서드를 자판기라고 생각하면
	 * 입력 :메뉴,돈
	 * 출력 : 음료수
	 * 
	 * 기능 : 두 정수의 합을 알려주는 메소드를만들기
	 * 입력 : 이기능을 실행할때 필요한 정보 , 두 정수 => int num1, int num2;
	 * 출력 : 이 기능을 실행하고 나서 알려주는 정보 => int 
	 *출력은 동작이아님 출력이없을수도있음 계산과정알려줄핗요없음 결과만알려주면됨 
	 *이름 : sum
	 * 
	 * 
	 * 메소드 선언방법
	 * 출력 이름 (입력){
	 * 			구현
	 * }
	 * 리턴타입 메소드명(매개변수){
* 				  구현
	 * }
	 * int sum(int num1,int num2){
 * 			int res = num1+num2;
	 * return res; //res라는 값을 돌려줌
	 * }
	 * 
	 * 
	 * 
	 * */
	public static int sum (int num1 , int num2){
  		int res = num1+num2;
	    return res;
	}
		/*
		 * 기능 : 두 수의 합을 콘솔에 출력하는 기능
		 * 입력 : 두 정수 => int num1, int num2
		 * 출력 : 필요없음 => void
		 * 이름 : printSum
		 * */
		
		
	public static void printSum (int num1, int num2){
		System.out.println(num1+num2);
	}

}
