package day20;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdManager sMng=new StdManager();
		//학생한명정보를만들고 학생한명의정보에 과목을 추가하고평점을확인
	/*	Std std=new Std("홍길동","2019100","서울대","com",0.0);
		System.out.println(std);
		std.insertSubject(new Grade("A+","세종대왕","한글",3));
		System.out.println(std);
		std.insertSubject(new Grade("B","이순신","해상학",2));
		System.out.println(std);*/
		
	
		
		
	/*	
	 * 테스트 
	 * sMng.insert(new Std("홍길동", "20190419","한국대","컴퓨터",0.0));
		sMng.insert(new Std("임꺽정", "20190419","한국대","컴퓨터",0.0));//학번이 겹쳐서 안나오는게 맞음 
		sMng.insert(new Std("유관순", "20190420","한국대","컴퓨터",0.0));
		sMng.delete(new Std("유관순", "20190420","한국대","컴퓨터",0.0));
		sMng.update(new Std("이순신", "20190419","한국대","컴퓨터",0.0));
		sMng.print();*/
		
		
		int menu=0;
		Scanner scan = new Scanner (System.in);
		do{
			//메뉴출력
			sMng.printMenu();
			//메뉴선택
			menu=scan.nextInt();
			Std std;//한명의학생을 저장하기위해
			Std result;//입력받은애를 통한 결과?
			int subMenu;
			switch(menu){
			case 1: 
				std=sMng.inputStd(scan);
				if(sMng.insert(std))
					System.out.println("학생정보를 추가했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2: 
				/*
				 * 기존 : 학생정보를 입력받고 학생정보를 추가 
				 * 변경 : 2번 선택시 학생정보 또는 과목등록을 할 수 있게 한다
				 * */
				//메뉴출력 
				System.out.println("2-1.학생정보수정");
				System.out.println("2-2.학생수강과목 등록");
				System.out.println("서브메뉴를 선택하세요 (1 or 2) : ");
				//메뉴선택
				subMenu=scan.nextInt();
				
				//선택된 메뉴에 따라 해당기능동작
				if(subMenu==1){
				    std=sMng.inputStd(scan);
					if(sMng.update(std))
						System.out.println("학생정보를 수정했습니다.");
					else
						System.out.println("없는 학번입니다.");
				}else if (subMenu==2){
					//과목추가하는 기능 작성
					//학생정보검색해서학져생객체가옴
					std=sMng.inputId(scan);
					result=sMng.search(std);
					
					//해당학생정보가 없으면 해당기능종료
					if(result==null){
						System.out.println("없는 학번입니다.");
						break;
					}
					
					//추가할과목정보를입력하여 입력받은 과목을 통해 과목객체생성
					//==>새로운 메소드 구현
					Grade grade=sMng.inputSubject(scan);
					
					//학생 객체에 과목객체를 추가
					result.insertSubject(grade);
					
					//학생정보 수정
					sMng.update(result);
	
				}
				break;
			case 3: 
				std=sMng.inputId(scan);
				if(sMng.delete(std))
					System.out.println("해당학생정보를 삭제했습니다");
				else
					System.out.println("없는 학번입니다");
				break;
			case 4: 
				//서브메뉴출력
				//1.전체학생출력
				//2.학생수강과목출력
				System.out.println("4-1 학생정보 전체출력 ");
				System.out.println("4-2 학생수강과목전체출력");
				System.out.println("서브메뉴를 선택하세요 (1 or 2) : ");
				//서브메뉴선택=>서브메뉴입력
				subMenu=scan.nextInt();
				
				//조건문을 통해 서브메뉴가 1이면 전체학생출력 서브메뉴가 2이면
				//학생정보입력을 받아 객체로 만들고 /=>stdMananger.inputId()
				//만들어진 객체와 일치하는 학생의 정보를 가져온다 stdManager.search()
				if(subMenu==1){
					sMng.print();
				}else if (subMenu==2){
					std=sMng.inputId(scan);
					result=sMng.search(std);//학번으로만든객체가 있는지없는지
					if(result==null){
						System.out.println("해당학생학번이 없습니다.");
					}else if(!result.printSubject()){//과목정보가 없으면
						System.out.println("수강한 강의가 없습니다.");
					}
				}
				//해당학생객체의 수강과목을 출력하고 => std.printSubject()메소드추가 //없으면 아무것도 안함
				break;
				
			case 5: break;
			default:
				System.out.println("---------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("---------------------");
			}
		}while(menu !=5);
		System.out.println("프로그램을 종료합니다.");
		scan.close();

		
	}
}
