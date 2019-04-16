package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx1 {
	
	//
	//
	//
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		Queue q = new LinkedList(); 
		/*Queue :인터페이스
		인터페이스는 객체를 만들수 없다 .
		인터페이스는생성자가 없다
		Queue 인터페이스를 구현한 클래스(LinkedList)를 이용하여 
		Queue 인터페이스의 객체를 생성할 수 있다 
		*/
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()){ //비어있지않으면 실행하고 아니면 반복문을 종료
			System.out.println(st.pop()); 
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}

	}

}
