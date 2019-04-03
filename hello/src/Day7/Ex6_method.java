package Day7;

public class Ex6_method {

	public static void main(String[] args) {
	/*	 메소드 : 하나의 특정 기능을 하도록 묶어 놓은 것
	 *  매개변수 :기능을 실행하는데 있어서 필요한 정보 
	 *  리턴타입 :기능이 실행되고나서알려주는정보 ,동작과혼동x 동작이끝나고나서 호출한애한테알려줘여하는정보기때문에 동작과다름
	 *  메소드명 :기능의 잘 표현할 수 있는 이름으로 짓는다
	 *  
	 *  1.메소드의 기능을 풀어쓴다
	 *  2.풀어쓴 기능에서 매개변수를 정한다.
	 *  3.풀어쓴 기능에서 리턴타입을 정한다.
	 *  4.메소드명을 정한다
	 *  5.2,3,4에서 정한 내용을 토대로 메소드를 선언한다
	 *  6.메소드를 구현한다.
	 *  
	 *  
	 *  
	 *  일반변수 vs 참조변수
	 *  일반변수 : 값을 저장하는 변수 int num1; char op; double num2;
	 *  참조변수 : 주소를 저장하는 변수 int [] arr;
	 *  
	 *  매개변수의 원본이 바뀌려면 매개변수가 참조변수이어야 한다.
	 *  
	 *  
	 *  데스크에서 9시에 502호 강의실에 학생이 몇명? 9명
	 *  12시에 학생수가 10명
	 *  일반변수는 전달받기 떄문에업데이트하지않는한 끝이지만 참조변수는 주소로직접가서하기떄문에 
	 *  참조변수라고해서원본이 무조건 바뀌는것도아님 
*/
	}
	
	
	/* 참조변수라고해서원본이 무조건 바뀌는것도아님의 예 (책맨앞포스트잇참고)
	 * 기능 : 배열을 num로 초기화하는 메소드
	 * 매개변수 배열 num =>int[] arr, int num
	 * 리턴타입 없다 => void
	 * 메소드명 initArr 초기화
	 * 
	 * */
	public static void initArr(int[] arr, int num){
		//arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = num;
		}
	}
	public static void printArr(int[] arr){
		for (int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	
}
