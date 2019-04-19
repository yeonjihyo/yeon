package day19_1;

import java.util.HashSet;

public class StudentManager {
	
	//기능들을 추가히기 위해 중복이 허용되지 않는 set를 이용
	HashSet<Student> list = new HashSet<Student>();
	
	//학생정보추가 
	/*
	 * 기능     : 학생정보가 주어졌을때 list에서 중복되지 않으면 추가하고 성공했는지 아닌지 알려주는 메소드
	 * 매개변수: 학생정보 => Student s
	 * 리턴타입: 성공여부 => boolean
	 * 메소드명: addStd
	 * */
	public boolean addStd (Student s){
		Student s1=new Student(s);
		return list.add(s1);
	}
	//복사생성자의 s를 s1이라는 객체로 생성하고 학생정보와 list의 학생정보가 중복되지 않으면(없으면) 추가 해라
	
	//전체학생정보출력
	/*
	 * 기능     : 모든학생의 정보가 주어졌을때 출력해라
	 * 매개변수: 모든 => 매개변수 없다 => 몇명이 아닌 모든학생을 다 출력할거니까 
	 * 리턴타입: void =>없다 
	 * 메소드명: print
	 * */
	public void print(){
		System.out.println(list);
	}

}
