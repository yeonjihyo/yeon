package day18;

import java.util.HashSet;
import java.util.Iterator;

import day12.Student;

public class StudentManager {
	HashSet<Student> set = new HashSet();
	
	/*
	 * set은 중복을 허용하지 않아서 중복이 되는지 아닌지 확인을 equals를 통해 하기 때문에 Student에 hashCode와 equals를 추가해준뒤
	 * 매니저에 set.add를 이용해서 학생정보를 추가한다. 이때  학년반번호를 쓰면 정보를 추가하고 난뒤 새로운 학년반번호가 앞서 추가한 학년반번호와 같을떄 추가하지말고 나오고 같지않으면 추가해라
	 * */
	
	//학생정보추가 addStd
	/* 기능 Student클래스에서 학년반번호를 가져와 학생의 정보를 추가
	 * 매개변수 Student s 학년반번호 
	 * 리턴타입 boolean 이미있는번호와 새로추가할 번호가 같은지 확인하기위해
	 * */
	public boolean addStd(Student s){
		int oldSize = set.size();
		set.add(s);
		int newSize = set.size();
		
		if(oldSize == newSize){
			return false;
		}
		return true;
	}
	
	//학생정보출력 print
	public void print(){
		System.out.println(set);
	}
	
	//학생정보수정 editStd
	/* 기능 Student클래스의 학년반번호를 가져와서 수정할학생을 찾고 정보를 수정
	 * 매개변수 Student s 학년반번호
	 * 리턴타입 void
	 * */
	public void editStd(Student s){
		Iterator<Student> it=set.iterator();
		  while(it.hasNext()){
			  Student set=(Student)it.next();
			  
		  }
	//Iterator라는 클래스를 이용해서 가져올 객체정보가 있는지 없는지 확인한다.
		  //학년반번호를 끄집어내서 비교해보고 있으면 가져와라	
		  
	}
	 
	
	//학생정보삭제 deleteStd
	
	
}
	
