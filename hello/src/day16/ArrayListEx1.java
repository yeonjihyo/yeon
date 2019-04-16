package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 컬렉션 프레임워크 : 데이터 집합을 효율적으로 관리하기 위해 표준화 시킨 것 
		 * -종류는 콜렉션(list,set),map이 있다
		 * -콜렉션은 하나의 값을 이용
		 * -맵은 두개의 값을 이용 
		 * -list: 순서, 중복허용
		 * -set : 순서 보장하지 않음,중복불가
		 * map : key,value로 이루어짐 key는 중복불과 value는 중복가능
		 *            id와 pw로 생각하면됨
		 * -ArrayList : list인터페이스를 구현한 클래스
		 * -ArrayList의 객체를 생성할때 어떤 데이터 (자료형 또는 클래스)를 이용할건지 결정해주어야한다.            
		 * */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);// list.add(new Integer(10));//같은의미
		list.add(5);
		list.add(1);
		/*for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point ();
		char mode='y';
		Scanner scan=new Scanner(System.in);
		
		
		do{
			System.out.println("이동할 좌표(x,y)를 입력하세요 (예:1 2)");
			int x=scan.nextInt();
			int y=scan.nextInt();
			pt.move(x, y);
			System.out.println("이동한 현재 좌표 : "+pt);
			pList.add(new Point(pt));//익명객체
			System.out.println("더 하시겠습니까?(y or n): ");
			mode=scan.next().charAt(0);
		}while(mode!='n');
		
		for (int i=0;i<pList.size();i++){
			System.out.println(pList.get(i));
		}
		
	}

}


class Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(){}
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Point (Point p){
		this(p.x,p.y);
	}
	public void move(int x, int y){
		this.x=x;
		this.y=y;	
	}
	@Override
	public String toString() {
		return " (" + x + "," + y + ")";
	}
	@Override
	/* hashCode는 객체가 어느 그룹에 속해있는지 알려준느 메소드로 
	 * Point 클래스에서는 x,y의 값이 같다면 다른객체이더라도 
	 * 같은 그룹에 속하기 때문에 검색을 빠르게 할 수 있다.*/
	public int hashCode() { //hashCode :그룹을나눠서 좀더 쉽게 비교하는것 
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	/* equals는 두 객체가 같은 객체로 판별할 것인지를 결정하는 메소드 
	 * */
	@Override
	public boolean equals(Object obj) {
		//주소가 같은 경우면 당연히 본인이기 떄문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//클래스이름을 가져옴
			return false;
		//기본 equals는 여기까지라고 생각하면됨?
		Point other = (Point) obj;
		//Point 클레스에서 같은 객체는 x와 y가 같은 경우이다로 설정함
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}


