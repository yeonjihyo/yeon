package ex;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1번에서 작성한 코드를 이용하여 min,max가 주어지면 min~max까지의 합을 구하는 코드를 메소드로 작성하세요*/
		int sum;
		int min=10;
		int max=1;
		sum=printsum(min,max);
		System.out.println(""+min+","+max);
		System.out.println(sum);
	}
	/*
	 * 기능   min,max가 주어지면 min~max까지의 합을 알려주는 메소드
	 * 매개변수 int min, int max
	 * 리턴타입 int =>리턴타입은 기능에 따라 달라진다
	 * 메소드명 printsum
	 * */
	public static int printsum(int min,int max){
		int sum;
		int i;
		if (max<min){ //숫자가 바껴도 계산하기 위해
			int tmp=min;
			min=max;
			max=tmp;
		}
		for(sum=0, i=min;i<=max;i++){
			sum+=i;
		}
		return sum;
		
	}

}
