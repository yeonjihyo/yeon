package day16;

import java.util.ArrayList;
import java.util.Collections;
//책 587 예제 11-2
public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList (10); 
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//생성자오버로딩을 사용하기 위해서 :매개변수가 List인 경우
		ArrayList list2=new ArrayList(list1.subList(1, 4));//list2를 만드는데 list1의부분(일부)을가져온다 1번지부터4번지앞(4번지보다작은(끝을포함시키지않음))까지 가져온다
		print(list1,list2);
		
		Collections.sort(list1); //sort라는 메소드를 통해 정렬
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); //list2가list1에포함되어있는지
		list2.add("B");
		list2.add("C");//add=>insert라고 생각, 해당번지에 넣기전에 값이 있으면 밀고난뒤 추가
		list2.add(3,"A");//3번지에 A를 추가
		print(list1,list2);
		
		list2.set(3,"AA");///set=>업데이트라고 생각   :해당번지에 덮어 쓰기 , 3번지를 AA로 바꿔라
		print(list1,list2);
		
		//겹치지 않은 내용이 있어서 삭제가 되면 true , 삭제가 안되면 false
		//1을 기준으로 수정이 되었다는걸 알수 있게됨 리턴으로 삭제했는지안했는지알려줌
		System.out.println("list1.retainAll(list2): " +list1.retainAll(list2));//
		print(list1,list2);
		
		//조건이 맞으면 해당번지에있는 걸 제거해라 기능을 제거하려면 거꾸로가야함 
		//0번지부터 시작을 하면 remove()에 의해 삭제가 되면 확인해야 하는 내용이 있는 번지가 변경이 되어
		//확인하지 않은 원소가 생길수 있기 떄문에 거꾸로 확인해서 작업해야한다
		//책에 포스트잇 그림 참고 
		for(int i=list2.size()-1;i>=0;i--){
			if(list1.contains(list2.get(i)))
			list2.remove(i);
		}
		print(list1,list2);
		
	}
	
	
	static void print (ArrayList list1, ArrayList list2){
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
		}

}
