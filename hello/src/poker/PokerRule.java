package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 숫자가 동일한 경우 스페이스>다이아>하트>세잎 순이다
다음카드는 마지막에 받은 카드를 기준으로 다시 순서를 정한다
포커규칙
탑 : 아래중 하나라도 만족하는 경우가 없는 경우
원페어 : 숫자가 같은 카드가 2장이고 한세트인경우
투페어 : 숫자가 같은 카드가 2장이고 두세트이상인경우
트리플 : 숫자가 같은 카드가 3장이고 한세트인 경우
스트레이트 : 연속된 숫자가 5장이상인 경우 예)1~5
백스트레이트 : 1부터 시작하여 5까지 스트레이트 
마운틴 : 10에서 시작하여 1까지 스트레이트
플러쉬 : 같은모양의 카드가 5장이상인경우ㅜ
풀하우스 : 트리플_원페어, 트리플2개
포커 : 숫자가 같은 카드가 4장인 경우 
스트레이트 플러쉬 : 모양이 같은 5장의 카드가 숫자가 연속적인 경우
 * */

public class PokerRule {
	private static int sameCnt(ArrayList<Card> list, int count){ 
		int sCnt = 0; //페어의 갯수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 갯수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == count){  
				sCnt++;
			}
		}
		return sCnt/count; 
		/*내가이해한거 
		 * 내가 이해한거 
		 * sCnt =>해당하는애들기준으로2개씩있는것의 갯수
	 *    리스트의 i번지의 숫자와 리스트의 j번지의 숫자가 같으면 같은숫자를 가진 갯수를 증가시킨다
	 *    다비교한뒤 같은숫자를가진2장(쌍)의 카드 갯수를 증가시킨다.
		  sameCnt (list,2)=>투페어를 찾는다고 했을때
			1 1 2 2 3 4 5
			0번지에있는1과 1번지에 있는 1이 같으니 sCnt는 1 증가
			1번지에있는1이 0번지에 있는 1과 같으니 sCnt는 2로 증가
			2번지에있는2가 3번지에 있는 2와 같으니 sCnt는 3으로 증가
			3번지에있는 2가 2번지에 있는 2와 같으니 sCnt는 4로 증가 
			투페어를 찾는거니까  중복된 값을 제거하기 위해 2로 나눈다 .*/
	}

	
	/* 기능 : 페어를 찾는 메소드
	 * 매개변수 : 카드 리스트
	 * 리턴타입 : 0 : 페어없음, 1 : 원페어, 2 : 투페어(페어가 2개이상) */
	public static int triple(ArrayList<Card> list){
		return sameCnt(list,3);
	}
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
	}
	public static boolean poker(ArrayList<Card>list){
		if(sameCnt(list,4) == 1){
			return true;
		}
		return false;
	}

	/*내가 이해한거 
	 * triple과 pare는 세쌍과 두쌍인게 여러개일 수 있어서 =>나중에 다른 룰?에서 갯수를 체크해서 적용할 수  있기 때문에 
	 * poker는 4개가 같은거기 때문에 1개만 가능하니까 boolean을 써서 비교한다.*/
	
	/*
	       스트레이트 : 연속된 숫자가 5장이상인 경우 예)1~5
		백스트레이트 : 1부터 시작하여 5까지 스트레이트 
		마운틴 : 10에서 시작하여 1까지 스트레이트 */
	// 0:스트레이트 아님, 1 : 스트레이트, 2 : 백스트레이트, 3:마운틴
	public static int straight(ArrayList<Card>list){
		//카드 리스트를 정렬 
		/*sort는 integer타입만 정렬함 
		 * 카드는 integer타입이 아니기 때문에 comparator을 통해 정렬해줘야한다 */
		Collections.sort(list, new Comparator<Card>(){//정렬
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getNum()  - c2.getNum();//정렬할때 누가더 큰지 비교하고 정렬하려고?
			}
		});
		boolean flag = false; //1이 있는지 체크하는 변수
		boolean isStraight = false; 
		for(int i=0; i<list.size()-3; i++){//size()-3 : 스트레이트는 5장이 연속으로 나오는 경우라 -2를 해야하는데 마운틴때문에  k다음에 1이오는 상황 떄문에 -3을 해야한다.
			int straightCnt = 1;
			int std = list.get(i).getNum(); //스트레이트가 시작되는 숫자
			if(std == 1){
				flag = true;
			}
				
			for(int j=i+1; j<list.size(); j++){//j+1은  j를 기준으로 이전꺼는 보지 않으려고 
				if(std+straightCnt == list.get(j).getNum()){  
					straightCnt++;
				}else if(std+straightCnt-1 
						== list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			
			//마운틴의 경우, 10,j,q,k
			if(straightCnt == 4 && std == 10 && flag){
				return 3;
			}
			if(straightCnt >= 5 && std == 1 ) return 2; //백스트레이트
			if(straightCnt >= 5 ) isStraight = true; 
		}//for문의끝
		if(isStraight){
			return 1;
		}
		return 0;
	}
	

	public static String flush(ArrayList<Card> list){
		int sCnt = 0;//스페이스 갯수
		int cCnt = 0;//클로버 갯수
		int hCnt = 0;//하트 갯수
		int dCnt = 0;//다이아 갯수
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getShape().equals("S")) sCnt++;
			else if(list.get(i).getShape().equals("H")) hCnt++;
			else if(list.get(i).getShape().equals("D")) dCnt++;
			else if(list.get(i).getShape().equals("C")) cCnt++;
		}
		if(sCnt >= 5) return "S";
		if(cCnt >= 5) return "C";
		if(dCnt >= 5) return "D";
		if(hCnt >= 5) return "H";
		return null;
	}
	
	
	public static boolean fullHouse(ArrayList<Card>list){
		if(pare(list)>=1 && triple(list) == 1)
			return true;
		if(triple(list) == 2)
			return true;
		return false;
	}
	
	
	
	/*  0 : 아님
	 *  1 : 스티플
	 *  2 : 백스티플
	 *  3 : 마운틴
	 */
	public static int straightFlush(ArrayList<Card>list){
		String s=flush(list);
		ArrayList<Card> tmp = new ArrayList<>();
		//카드리스트가 플러시가 아니면 스티플를 더이상 비교할 필요가 없다.
		if(s == null)
			return 0;
		//카드 리스트를 복사 => 플러시가 아닌 카드들을 제거해야하기 때문에
		tmp.addAll(list);
		//플러시가 아닌 카드들을 제거
		//시작 : 0 마지막 : 6 증감연산자 : ++
		//시작 : 6 마지막 : 0 증감연산자 : --
		for(int i=tmp.size()-1; i>=0; i--){
			if(!tmp.get(i).getShape().equals(s)){
				tmp.remove(i);
			}
		}
		return straight(tmp);
	}
	public static boolean top(ArrayList<Card>list){
		//원페어,투페어,트리플,풀하우스,포커체크
		if (sameCnt(list,1) !=7) return false; //중복되지 않는 카드가 있는지확인,1을햇다는건 중복된 숫자가 없다는 것이기때문에
			//스트레이트 체크
		if (straight(list) !=0) return false;
		//플러시체크
		if (flush(list) != null)return false;
	
		return true;
	}

}
