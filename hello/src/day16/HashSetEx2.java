package day16;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx2 {
//632p 예제 11-21
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet(); //중복된 값을 가지지않는 set을 이용한다
		while(set.size()<6){
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		
		List list = new LinkedList(set); 
		Collections.sort(list); //정렬
		System.out.println(list);

	}

}
