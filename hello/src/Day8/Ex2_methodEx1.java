package Day8;

public class Ex2_methodEx1 {

	public static void main(String[] args) {
		int res =sum(1,2);
		//int res =3;
		//sum(1,2);  //의미가 없다 
		//3;
		///sum(1,2);는 3을 의미하기 떄문에 3;을 쓴 코드와 비슷하지만 
		//아래에 sum안에서 어떻게 구현(표현)되어있는지 main은 알수 없기 떄문에 3;을 했을때에는
		//에러가 나지만 sum(1,2);를 했을 때에는 3;과 같은 결과가 나오더라도 에러가 안남
		System.out.println(res);
	}
	/*
	 * 기능 : 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입: 합 => 정수=> int
	 * 메소드명 : sum 
	 * */
	/*
	 * public static 리턴타입 메소드명 (매개변수){
		구현;
	}*/
	
	
	public static int sum (int num1, int num2){
		int res;
		res=num1+num2;
		return res; 
		//return num1+num2; 이렇게 한줄로하면더간단
	}
	
	
	
}
