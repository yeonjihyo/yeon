package day16;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx3 {
//588p 예제 11-3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5); 
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);//
		
		v.trimToSize();//공백을 제거 
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6);//용량을 6개로 늘리겠다
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7); //사이즈를 7개로 바꿔라 나머지는 null값으로 //용량은 사이즈+5해서 12임
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();
		System.out.println("=== After clear() ===");
		print(v);

	}
	static void print (Vector v){
		System.out.println(v);
		System.out.println("size:" +v.size());
		System.out.println("capacity :" + v.capacity());
		}

}
