package Day7;

public class Ex1_test1 {

	public static void main(String[] args) {
		//구구단 전체를 출력하는 코드를 작성하세요
		int num=1;
		int i=0;
		for(num=2;num<=9;num++){
			for(i=1;i<=9;i++){
				System.out.println(num +" x "+i+"="+num*i);	
			}
		}
		System.out.println();
		
		
	}

}
