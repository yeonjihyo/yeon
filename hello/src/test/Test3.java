package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.정수 7이 소수인지 아닌지 판별하는 코드를 작성하세요
		/*
		int num=7;
		int cnt=0;
		for(int i=0;i<=num;i++){
			if(i%num==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println(num+"는 소수입니다");
		}else{
			System.out.println(num+"는 소수가 아닙니다");
		}
	
		*/
		int num = 7;
		int i;
		//소수는 약수가 1과 자기자신만 있는 수이다.
		//따라서 약수가 1과 자기자신을 제외하면 0개이다.
		for(i=2; i<num; i++){
			if(num%i==0){
				break;
			}
		}
		if(i!=num){
			System.out.println(num+"는 소수가 아님");
		}else{
			System.out.println(num+"는 소수");
		}
			

	}

}
