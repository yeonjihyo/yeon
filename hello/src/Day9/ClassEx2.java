package Day9;

import Day8.Ex2_methodEx1;
import Day8.Ex4_methodEx3;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s=new String[3];
		ClassEx1.main(s);
		/*int res = 클래스명.클래스멤버메소드 
				언제든불러올수있음 
				*/
		Ex4_methodEx3.printMultiTable(3);
		//System.out.println(res);
		//void이기 때문에 이렇게 불러옴
		
		int res=Ex2_methodEx1.sum(2,3);
		System.out.println(res);
		
		
		
		
		
	}
	
}
