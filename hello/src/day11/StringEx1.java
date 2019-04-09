package day11;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str1="Hello", str2="Hello";
		boolean cmp=str1 == str2;
		System.out.println(cmp);
		cmp=str1 != (str2="Hello "); 
		System.out.println(cmp);
		cmp=str1 !=(str2="Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));
		*/
		
		
		//문자열을 입력하세요 : Hello world
		//찾을 문자열을 입력하세요 : He
		//Hello world에는 He가 있습니다.
		
		Scanner scan = new Scanner (System.in);
		String str="";
		System.out.print("문자열을 입력하세요.: ");
		str=scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요.: ");
		String search = scan.nextLine();
		/*if (str.contains(search)){
			System.out.println(str + "에는"+ search+"가 있습니다.");
		}else{
			System.out.println(str + "에는"+ search+"가 없습니다.");
		}*/
		if (str.indexOf(search)>=0){
			System.out.println(str + "에는"+ search+"가 있습니다.");
		}else{
			System.out.println(str + "에는"+ search+"가 없습니다.");
		}
		scan.close();
				
	}

}
