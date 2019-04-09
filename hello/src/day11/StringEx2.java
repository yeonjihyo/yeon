package day11;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		//문자열을 입력하세요.:112233445511
		//교체될 문자열을 입력하세요 : 11
		//교체할 문자열을 입력하세요 : 00
		//교체결과 : 002233445500
		
		
		Scanner scan = new Scanner (System.in);
		String str=new String();
		String searchStr="";
		String replaceStr="";
		System.out.print("문자열을 입력하세요.: ");
		str=scan.nextLine();
		System.out.print("교체될 문자열을 입력하세요.: ");
		searchStr=scan.nextLine();
		System.out.print("교체할 문자열을 입력하세요.: ");
		replaceStr=scan.nextLine();
		
		String newStr="";
		newStr=str.replaceAll(searchStr, replaceStr);
		if (newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체된 문자열: "+ newStr);
		}
		
	}

}
