package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex1 {

	public static void main(String[] args) {
		boolean s1=false,s2 = false;
		int cnt = 0;//몇번만에 됐는지 확인하기 위한?
		while( !(s1 || s2)){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			/**/
			
			//System.out.println(PockerRule.pare(user));
			//s1 = PockerRule.straight(user) == 3;
			//s1 = PockerRule.flush(user);
			//s1 = PokerRule.straightFlush(user) == 3;
			//s1 = PokerRule.poker(user);
			s1 = PokerRule.top(user);
			System.out.println(s1);
			System.out.println(user);
			
			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) == 3;
			//s2 = PockerRule.flush(dealer);
			//s2 = PokerRule.straightFlush(dealer)==3;
			//s2 = PokerRule.poker(dealer);
			s2 = PokerRule.top(user);
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		}
		System.out.println(cnt);
	}
}









