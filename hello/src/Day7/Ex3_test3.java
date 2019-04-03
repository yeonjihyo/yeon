package Day7;

import java.util.Scanner;

public class Ex3_test3 {

	public static void main(String[] args) {
		//50이하의 소수를 출력하는 코드를 작성하세요
		int num=3;
		int i,cnt;
		for(num=1; num<=50;num++){
			for(i=1,cnt=0;i<=num;i++){
				if(num%i==0){
					cnt++;
				}
			}
			if(cnt==2){
				System.out.print(num + " ");
				}
		}
		
		
	}
}