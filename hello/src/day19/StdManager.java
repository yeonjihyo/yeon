package day19;

import java.util.*;

public class StdManager {
	//매니저는 학생 정보들을 관리하기 위한 저장공간이 필요함 
	//쉽게 정보들을 관리하기 위해 컬렉션프레임웍이 필요함 
	//그런데 학생 정보들은 중복되면 안되기 때문에 Set을 이용해야함
	//(List를 이용할 경우 중복처리를 해줘야하는 번거로움이 있기 때문에 Set을 이용)
	
	//학생정보는 기능을 통해 접근하기 때문에 외부에서 접근하면 안됨=>접근제한자를 private으로 한다.
	private HashSet<Std> list= new HashSet<Std>();
	
	//기능을 추가 
	
	//학생정보추가 
	/*
	  기능       : 학생정보가 주어지면 해당학생정보를 list에서 중복되지 않으면 추가하고 아니면 추가하지 않으며 추가했을 경우 성공을,
	                 추가하지 못하면 실패를 알려주는 기능
	   매개변수 : 학생정보 => Std s
	   리턴타입 : 성공 또는 실패 => boolean
	   메소드명 : insert
	*/
	public boolean insert(Std s){
		 // 매개변수 s를 그대로 넣으면 s가 list와 외부에서 같이 쓴다
		 // s를 복사생성자를 이용해서 s의 값과 동일한 값을 가지는 tmp객체를 하나 만든후 해당 tmp를 리스트에 추가한다. 
		 
		Std tmp= new Std(s);
		//add()라는 메소드는 list에 tmp와 일치하는 정보가 없으면 해당객체를 추가하고 true를 리턴하며 
		//tmp에 일치하는 정보가 있으면 추가하지 않고 false를 리턴한다.(Set의 특징)
		return list.add(tmp);
	}
	
	/*내가이해한거
	 * 학생정보추가 
	 * Std의 복사생성자 s를 불러와서 tmp에 넣는다고 선언한뒤 list에있는 학생정보가 tmp와 같으면 중복이 된다는 거니까
	 * 추가하지 않고 추가하지않았다고 알려주고  일치하는 정보가 없으면 추가하고 알려줘 */
	
	
	
	
	//학생정보 수정 
	/*    기능: 학생정보가 주어지면 list에서 학생정보와 일치하는 학생이 있으면 해당학생 정보를 반환하는 기능
	 * 매개변수: 학생정보 =>Std s
	 * 리턴타입: 학생정보 Std
	 * 메소드명: search
	 * */
	public Std search (Std s){
		Iterator<Std> it=list.iterator();
		while(it.hasNext()){
			Std tmp=(Std)it.next();//가져올 객체정보가 있는지 없는지
		//list에서 꺼낸 tmp와 s를 같은지를 equals를 이용하여 비교한후 같으면 꺼낸 tmp를 반환
			if (tmp.equals(s))
				return tmp;
		}
		//반복문이 종료될때까지 return이 안된것은 해당정보와 일치하는 객체가 list에 없는 경우이기 때문에 null값을 리턴
		return null;//null값을 기준으로 찾았는지 아닌지를 알수 있다 
	}
	
	/*내가이해한거
	 * Std클래스를Iterator를 통해 가져올객체의 정보가 있는지 없는지를 판별하겠다고 선언한뒤 
	 * list에서 꺼낸 tmp의 값이 s와 같은지를 equals를 통해 비교한뒤 같으면 꺼낸다.
	 * 만약 이 과정이 종료될때까지 return이 안되면 정보에 일치하는 학생이 list에 없다는거니까 null
	 * */
	
	
	//학생정보삭제
	/*    기능: 학생정보가 주어지면 list에서 해당학생의 정보를 삭제하는데
	 *         일치하는 학생정보가 없으면 실패를, 있으면 삭제를 해서 성공을 알려주는 기능
	 * 매개변수 : 학생정보 =>Std s
	 * 리턴타입 : 실패 또는 성공 =>boolean 
	 * 메소드명 : delete 
	 * */
	public boolean delete (Std s){
		Std tmp=search(s);
		//search()를 통해 검색했을때 일치하는 정보가 있으면 객체정보를 
		//없으면 null을 전달한다
		//remove()는 tmp라는 객체와 일치하는 정보가 있으면 
		//해당정보를 삭제한후 true의 값을 리턴하고 없으면 false값을 리턴한다
		return list.remove(tmp);
	}
	
	
	/*내가이해한거
	 * 학생정보s를 search를 통해 tmp에 저장하고 일치하는 정보가 있으면 삭제한뒤 true리턴하고 정보가 없으면 false 리턴  
	 * */
	
	/*수정기능추가
	 * 기능 : 학생정보가 주어지면 기존학생 정보를 수정하고 수정여부를 알려주는 기능
	 * 매개변수: 학생정보=> Std s
	 * 리턴타입: 수정여부 => boolean
	 * 메소드명: update
	 * */
	public boolean update(Std s){
		//set에서 수정을 하려면 기존에 있는 객체를 삭제후 수정된 객체정보를 추가해야한다.
		if (!delete(s)){
		return false;
		}
		return insert(s);
	}
	
	/*내가 이해한거
	 * 수정을 하려면 먼저 학생정보를 찾아서 삭제하지못했을떄 실패했다고 알려주고 삭제가 됐다면 삭제됏다고 추가해라 
	 * */
	
	//전체학생정보출력
	//기능:전체학생정보를 출력하는 기능
	//매개변수: 학생정보필요없다 => 전부를 출력하기때문에 
	//리턴타입: 없다 => void
	//메소드명: print
	
	public void print(){
		Iterator<Std> it=list.iterator();
		while(it.hasNext()){
			Std tmp=(Std)it.next();
			System.out.println(tmp);
		}
	}
	
	/*내가이해한거
	 * iterator 메소드를 통해 학생 클래스를 리스트에서 반환하는 it를 선언한다
	 * it에서 가져올객체정보가 있는지 없는지 tmp에 넣어보고 tmp를 출력해라
	 * */
	
	/*기능: 메뉴를 출력하는 기능 
	 * */
	public void printMenu(){
		System.out.println("------메뉴------");
		System.out.println("1.학생정보추가");
		System.out.println("2.학생정보수정");
		System.out.println("3.학생정보삭제");
		System.out.println("4.학생정보출력");
		System.out.println("5.종료");
		System.out.println("---------------");
		System.out.print("메뉴를 입력해주세요");
	}
	/*
	 * 기능 : Scanner가 주어지면 Scanner를 통해 학생학번을 입력받아 학생 객체로 돌려주는 기능
	 * 매개변수: Scanner
	 * 리턴타입: 학생객체=>Std
	 * 메소드명: inputId
	 * */
	public Std inputId (Scanner scan){
		System.out.println("------정보를 입력하세요------");
		System.out.println("학번: ");
		String id =scan.next().trim();//trim 공백없애줌
		Std tmp=new Std();
		tmp.setId(id);
		return tmp;
	}
	public Std inputStd(Scanner scan){
		Std tmp=inputId(scan);
		System.out.println("이름: ");
		String name=scan.next();
		System.out.println("학교이름: ");
		String sName=scan.next();
		System.out.println("전공: ");
		String major=scan.next();
		System.out.println("평점: ");
		double avr=scan.nextDouble();
		System.out.println("---------------");
		tmp.setName(name);
		tmp.setsName(sName);
		tmp.setMajor(major);
		tmp.setAvr(avr);
		return tmp;
		
				
	}
	
	
	
	

	

}
