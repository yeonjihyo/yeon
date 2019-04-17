package day17;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hSet = new HashSet<String>();
	
		 Iterator<String> it=hSet.iterator();
		  while(it.hasNext()){
		  //자식 =(자식)부모
		  String obj=(String)it.next();
		  }
		  
		  
	}

}
