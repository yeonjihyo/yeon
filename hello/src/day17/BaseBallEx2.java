package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaseBallEx2 {

	public static void main(String[] args) {
		/*
		 * 1.com의 번호를 생성 => List => 앞에 사용했던 randomArr()이용
		 * 2.반복문 {
		 * 3. 숫자를 3개입력받아 List에 저장
		 * 4.스트라이크갯수계산 =>새로운메소드추가
		 * 5.볼 갯수 계산=>countList()를 계산후 4에서 구한 스트라이크 갯수를 빼면 볼의 갯수가 된다
		 * 6.출력 
		 * 
		 * */
		
		List <Integer> com = LottoEx1.randomArr(1, 9, 3); //로또에서 가져옴
		System.out.println(com);
		List <Integer> user = new LinkedList<Integer> (); 
		
		int strike=0;
		int ball=0;
		Scanner scan=new Scanner(System.in);
		while (strike <3){
			user.clear(); //처음에 124 하고 두번째에 234 하면 추가가 되는거니까 한번 비우고 시작하라는 의미
			//매번 입력받은 값들을 리스트에 그냥 추가하면 3개가 넘어가기 떄문에 입력받기 전에 리스트를 비워줘야 한다.
			
			int num1, num2, num3;
			num1=scan.nextInt();
			num2=scan.nextInt();
			num3=scan.nextInt();
			user.add(num1);
		    user.add(num2);
			user.add(num3);
			//두번째 만든 메소드 는  int부터 지우고 
			//user=inputNum(scan);
			strike =getStrike(com, user);
			ball=LottoEx1.countList(com, user)-strike;
			
			if (strike !=0)
				System.out.println(strike+"S");
			if (ball !=0)
				System.out.println(ball+"B");
			if (strike ==0 && ball ==0)
				System.out.print("30");
			System.out.println();
			//아래에 메소드 추가한거를 출력하려면 위에 if문부터 지우고
			//print(strike,ball);
		}
		System.out.println("정답입니다.!!");
		System.out.println("프로그램을 종료합니다");
		scan.close();	

		
		
		 
	
		
		}
	/*기능 : 스트라이크의 개수를 계산하는 메소드 
	 * 매개변수 List <Integer> com , List <Integer> user
	 * 리턴타입 개수 => int
	 * 메소드명 
	 * */
	public static int getStrike (List <Integer> com , List <Integer> user){
		int count=0;
		for (int i=0; i<com.size(); i++){
			//List.get()은 객체를 반환하기 떄문에 com.get(i)==user.get(i)
			//로 작성하면 두 객체의 주소가 같은지를 확인하기 때문에 우리가 원하는 
			//값이 같은지를 확인하지 않는다 . 그래서 equals를 통해 값이 같은지를 확인해야 한다.
			if(com.get(i).equals(user.get(i)))
				count++;
		}
		return count;
	}
	//추가로 메서드 만든다면
	/*public static void print (int strike, int ball){
		if (strike !=0)
			System.out.println(strike+"S");
		if (ball !=0)
			System.out.println(ball+"B");
		if (strike ==0 && ball ==0)
			System.out.print("30");
		System.out.println();
	}*/
	
	
	//두번째 메소드 숫자입력받는 ?메소드
	public static List<Integer> inputNums(Scanner scan){
		/*Set<Integer> set = new HashSet<Integer>();
		while (set.size()<3){
			int num=scan.nextInt();
			set.add(num);
		}
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new LinkedList<Integer>();
		while(it.hasNext()){
			list.add(it.next());
		}*/
		
		List<Integer> list = new LinkedList<Integer>();
		while (list.size()<3){
			int num=scan.nextInt();
			list.add(num);
		}
		return list;
		
	}
	
}

	
	

