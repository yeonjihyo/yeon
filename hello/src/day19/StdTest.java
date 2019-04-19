package day19;

import java.util.Scanner;

public class StdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdManager sMng=new StdManager();
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
			switch(menu){
			case 1: 
				Std s=sMng.inputStd(scan);
				if(sMng.insert(s))
					System.out.println("학생정보를 추가했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2: 
				Std s2=sMng.inputStd(scan);
				if(sMng.update(s2))
					System.out.println("학생정보를 수정했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 3: 
				Std s3=sMng.inputId(scan);
				if(sMng.delete(s3))
					System.out.println("해당학생정보를 삭제했습니다");
				else
					System.out.println("없는 학번입니다");
				break;
			case 4: 
				sMng.print();
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
