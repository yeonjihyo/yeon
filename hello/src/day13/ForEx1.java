package day13;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 전체를 출력하는 코드를 작성하세요 
		
		int num=4;
		int i=0;
		for (num=2;num<=9;num++){
			for (i=1;i<=9;i++){
				System.out.println(num +"x"+ i + "=" + num*i);
			}
		
		}
	}

}
