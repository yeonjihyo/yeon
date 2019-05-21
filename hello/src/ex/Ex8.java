package ex;

import java.util.HashSet;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner 와 컬렉션프레임워크를 이용하여 중복되지 않는 6개의 정수를 입력받는 코드를 작성하세요*/
		/* 1.반복문과 Scanner를 이용하여 무한으로 정수를 입력받는 예제 작성
		 * 2. 입력받은 정수를 컬렉션프레임워크중 하나를 이용하여 저장하는 예제 작성
		 * 3. 해당 컬렉션 프레임워크의 크기가 6개가 되면 중지하는 예제 작성*/
		
		HashSet<Integer> set=new HashSet<Integer>(); 
		
		Scanner scan =new Scanner(System.in);
		/*for (;;){
			int num=scan.nextInt();
		}
		*/
		while (set.size()<6){
			int num=scan.nextInt();
			set.add(num);
		}
		System.out.println(set);
		//scan.close();

	}

}
