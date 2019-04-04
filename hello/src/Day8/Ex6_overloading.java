package Day8;

public class Ex6_overloading {
	/*
	 * 메소드 오버로딩의 조건
	 * 1.매개변수의 갯수가 다르다
	 * 2.매개변수의 갯수가 같지만 자료형이 다르다
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(sum(1,1));
		System.out.println(sum(1.2,1.2));
		System.out.println(sum(1,2,3));
	}
	/*
	 * 기능 : 두 정수의 합을 알려주는 기능
	 * 매개변수 : 두 정수 int num1, int num2
	 * 리턴타입 : int
	 * 메소드명 : sum
	 * */
	public static int sum(int num1, int num2){
		return  num1 +  num2;
		
	}
	/*
	 * 두 실수의 합을 알려주는 기능 
	 * 매개변수 double num1, double num2
	 * 리턴타입 double
	 * 메소드명 sum
	 * */
	//갯수는같지만 자료형이 달리서 가능 
	public static double sum(double num1, double num2){
		return  num1 +  num2;
	}
	
	/*
	 * 기능 : 세 정수의 합을 알려주는 기능
	 * 매개변수 : 두 정수 int num1, int num2, int num3
	 * 리턴타입 : int
	 * 메소드명 : sum
	 * */
	
	//매개변수의 갯수가달라서 가능
		public static int sum(int num1, int num2, int num3){
			return  num1 +  num2 + num3;
		}
		
		
		
		
		
		
		
		
		
		
}
