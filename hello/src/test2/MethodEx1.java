package test2;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 합을 구하는 메소드를 생성하여 테스트 하세요 
	
		
		int sum=cal(1,10);
		System.out.println(cal2(1,10)*2);
	}

	/*
	 * 기능 :두 정수가 주어지면 min부터 max까지의 합을 알려주는 메소드 
	 * 매개변수 int min, int max
	 * 리턴타입 합=>int
	 * 메소드명 : cal
	 * */
	public static int cal(int min, int max){
		int sum = 0;
		for(int i=min;i<=max;i++){
			sum+=i;
		}
		System.out.println(min+"부터 "+max+"까지의 합 : "+sum);
		return sum;
	}
	
	public static int cal2(int min, int max){
		int sum = 0;
		for(int i=min;i<=max;i++){
			sum+=i;
		}
		return sum;
	}
}
