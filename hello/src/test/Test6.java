package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.5에서 생성한 Point클래스를 이용하여 점의 이동경로를 저장하는 코드를 작성하세요 
		ArrayList<Point> pointPath = new ArrayList<>();
		Point p=new Point(); //같은 패키지 내에서는 호출 가능 ???
		pointPath.add(new Point(p));
		p.move(4, 4);
		pointPath.add(new Point(p));
		p.move(10, 10);
		pointPath.add(new Point(p));
		
		Iterator<Point> it=pointPath.iterator();
		while(it.hasNext()){
			System.out.println(it.next());	
		}
		
		
	}

}
