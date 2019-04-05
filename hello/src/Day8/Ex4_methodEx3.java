package Day8;

import java.util.Scanner;

public class Ex4_methodEx3 {

	public static void main(String[] args) {
		//printMultiTable(2);
		//아래에 리턴이 없으므로 그냥 메소드명을 입력해서 원하는 결과를 얻을 수 있다.
		//int res = printMultiTable(2);//에러 발생 리턴이없기떄문에 메소드명에 값만 입력해서 원하는 값을 얻었는데
		//    res = ; 위의 식은 지금의 식과 같음. 
		//값이 없으니까 안됨
		
		printMultiTables(3,7);
		
	}
	/*
	 * 기능 : 한단(구구단)을 출력하는 기능
	 * 매개변수: 한 단 =>정수 => int num
	 * 리턴타입: void 단을 출력하는 거니까 보여주지않아도 되니까 없다 
	 * 메소드명 : printMultiTable
	 * */
	public static void printMultiTable(int num){
		int i=0;
		int dan=0;
		for(i=1;i<=9;i++){
			dan=num*i;
			System.out.println(num+"*"+i+"="+dan);
		}
		//return dan; 리턴타입이 void이기때문에 return을 쓸 필요가 없다 
	}
	//좀더 간단하게 풀어쓰면
	/*for(i=1;i<=9;i++){
		System.out.println(num+"x"+i+"="+num*i);
	*/
	
	/*
	 * 기능 : 2단에서 9단을 출력하는 기능(start단에서 end단까지을 출력하는 기능)
	 * 매개변수 : 2단에서 9단 =>2단 9단 =>int start, int end
	 * 리턴타입 : void
	 * 메소드명 : printMultiTables
	 * */

	public static void printMultiTables (int start, int end){

		int j=0;
		for (j=start;j<=end;j++){
			printMultiTable(j);
		}
	}
	
	
	
	
	
	
	
	/*메소드에서 리턴값이있을떄구현시 유의사항
	 * 조건문이나 반복문을 통해 리턴할 겨우 리턴되지 않을 경우를 항상생각해야한다
	 * 조건문을 통해 리턴을 하는 경우나
	 * 반복문안에서 리턴을 항경우 조심해여한다
	 * 조건문을 통해 리턴할 경우 조건문이 거짓인 경우룰 고려해야한다
	 * 반복문 안에서 리턴을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야한다*/
	/*public static int test1(){
		int r = 0;
		for(int i=1;i<=9;i++){
			r+=i;
			return r;
		}
		//반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는
		//세세한 내용까지 검사하지 않기 때문에 반복문이 종료됐을 경우 리턴도 설정해야한다
		//return 0; 이렇게 추가해줘야 에러가 안뜸
	}*/	
	/*public static int test(int num){ //우리가보기에는 문제 없지만컴파일러는else일경우도 생각하기 때문에 오류가뜨는거임
		if (num>=0) return 1;
		else if (num<0) return -1; //else return -1; 이렇게 써야 에러가 사라짐
		
	}*/
	
	
	
	
	/*public static int abs(int abs){
		int num = abs;
		if(num<=0){
			num = -abs;//리턴이없어서 오류
		}else{
			return abs;
		}*/
	/*
	 * }
		return num;
	}
	이렇게 고칠수있다
	*/
	
	/*}*/
}










