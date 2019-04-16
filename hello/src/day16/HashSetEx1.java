package day16;

import java.util.HashSet;
import java.util.Set;

//632p 예제 11-20
public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr={"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set=new HashSet(); //         
		/*Set :인터페이스
		인터페이스는 객체를 만들수 없다 .
		인터페이스는생성자가 없다
		Set 인터페이스를 구현한 클래스(HashSet)를 이용하여 
		Set 인터페이스의 객체를 생성할 수 있다
		*/
		for (int i=0;i<objArr.length;i++){
			set.add(objArr[i]);
		}
		System.out.println(set); //앞에 1은 String의 1이고 두번째1은 Integer라 클래스가 다르기떄문에 1이 2개
		
	}

}
