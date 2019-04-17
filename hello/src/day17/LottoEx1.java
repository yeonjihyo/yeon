package day17;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoEx1 {
	
	
	public static void main(String[] args) {
		//1.  번호들을 생성
		//1.1  로또 당첨번호를 생성7
		//1.2  로또 자동번호를 생성 6
		//2.  당첨번호와 자동번호를 비교해서 등수
		//2.1  당첨번호와 자동번호를 배교해서 일치하는 갯수확인
		//2.2  보너스 일치여부 확인
		//2.3  등수출력
		int min=1, max=45;
		List<Integer> lotto = randomArr(min, max, 7);
		List<Integer> list = randomArr(min, max, 6);
		System.out.println(lotto);
		System.out.println(list);
		
		System.out.println(countList(lotto, list));
		
		printRank(lotto, list);
	}
	
	/*
	 * 기능 : min,max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를 count갯수만큼 생성하여 리스트로 반환하는 메소드
	 * 매개변수 : int min , int max, int count  
	 * 리턴타입 : List
	 * 메소드명 : 
	 * */
	public static List<Integer> randomArr(int min, int max, int count){
		//생성할 수 있는 숫자의 범위보다 만들어야 하는 갯수가 더 크면 
		//중복될 수 밖에 없기 떄문에 무한루프에 빠지는 경우가 생기는 것을 막기 위한 코드
		if (max-min+1<count)
			return null;
		//1~3인데 중복되지 않아야 하는 숫자가 4인경우 4번쨰는 중복될수 밖에 없기 떄문에 
		//이럴경우 무한루프에 빠지기때문에 그걸 막기 위해 추가해준다.
		
		
		Set<Integer> set=new HashSet(); 
		while(set.size()<count){  //원하는 갯수만큼 만들기 위해( =은 뺴야함 set.size가 0부터 시작하기 떄문에 ) 
			//min~max사이의 랜덤한 수를 생성하여 num에 저장
			int num=(int)(Math.random()*(max-min+1))+min;
			//랜덤한 num을 set에 추가 
			set.add(new Integer(num));
		}
		//Set인터페이스로 저장되어 있는 데이터들을 List데이터들로변환
		//여기서Set을 리스트로 바꾸는 이유는 Set에는 원하는 번지에 직접 접근할 수 있는 메소드가 없기 때문에 List로 변환하여 
		//List에 있는 get()을 이용해 직접 접근하게 하기 위해 변환시킴
		//Set을 이용해서도 가능하긴 하지만 조금 복잡하기 때문에 그냥 List로 바꾸었다.
		List<Integer> list = new LinkedList<Integer>(set);
		return list;
	}
	
	/*
	 * 기능 : 로또 당첨번호들과 번호들이 주어지면 보너스 번호를 제외하고 일치하는 갯수가 몇개인지 알려주는 메소드
	 * 매개변수 : 당첨번호들 => List<Integer> lotto
	 * 			번호들  =>List<Integer> list
	 * 리턴타입 : 갯수 => int
	 * 메소드명 : countList
	 * */
	public static int countList (List<Integer> lotto, List<Integer> list){

		//첫번째 매개변수가 당첨번호가 되어야하는데 당첨번호가 아닌 
		//번호가 오면 -1을 리턴후 종료시킨다.
		if (lotto.size()<list.size())
			return -1;
		int count=0;//몇개 일치하는지
		
		//	lotto(당첨번호)에서 원소(번호)를 하나 꺼내서 꺼낸 원소가 list에 있는지 없는지 
		//확인하여 있으면 count를 증가, 없으면 아무것도 안함
		//<list.size() 당첨번호에서 보너스 번호를 제외하기 위해서 조건식에 lotto.size()가 아닌 list.size()를 넣어줌 
		for(int i=0;i<list.size();i++){
			if(list.contains(lotto.get(i))){// lotto.get(i)는 로또에서 원소하나를 끄집어낸다는 뜻
				count++;
			}
		}
		return count;
	}
	
	public static void printRank(List<Integer> lotto, List<Integer> list){
		//보너스 번호를 제외한 일치하는 개수
		int count =countList(lotto, list);
		int rank=0;
		//보너스번호
		int bonusNum =lotto.get(lotto.size()-1); // lotto.size()-1 =>로또의 마지막번지를 뜻함
		//보너스 번호와 일치하는 번호가 있는지 없는지 
		boolean checkBonus = list.contains(bonusNum);
		switch (count){
		case 6:	rank=1; break;
		case 5:	rank=checkBonus?2:3; break; //?2:3 =>보너스번호가 일치하면 2를 불일치하면 3을 가져와서 저장한다. 
		//조건선택연산자 : 조건식?참:거짓
		case 4:	rank=4; break;
		case 3:	rank=5; break;
		default : rank=-1;
		}
		if (rank>0)
			System.out.println(rank + "등 담첨");
		else
			System.out.println("꽝");
	}
}


