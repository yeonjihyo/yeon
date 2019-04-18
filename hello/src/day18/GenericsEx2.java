package day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GenericsEx2 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		Box <Integer> b = new Box<>();
		b.add(10);
		b.add(20);
		System.out.println(b);
		System.out.println(b.size());

	}

}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item){ list.add(item);}
		T get (int i){ return list.get(i);}
		ArrayList<T> getList(){ return list;}
		int size (){return list.size();}
		public String toString (){return list.toString();}
		
		
	
}