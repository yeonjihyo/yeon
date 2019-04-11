package day12;

public class ClassEx1 {
	public static int MAX_STUDENT_COUNT=300;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 한 학교에서 학생 전체를 관리하기 위한 프로그램을 만드세요
		 * 학생의 이름 학년 반 번호 국어 영어 수학성적등을 관리
		 * 관리프로그램은 
		 * 학생의정보추가 
		 * 학생의정보수정 
		 * 학생의정보삭제 
		 * 학생의정보를출력
		 * 하는 기능을 가짐
		 * */
			
		/*
		 * 1,학생정보를 어떻게 관리할것인가
		 * 학생클래스:멤버변수에집중
		 * 2.프로그램기능은 어떻게 구현할 것인가?
		 * 프로그램매니저클래스 :멤버메소드에 집중
		 * */
	/*	
	 * 테스트한거임 
	 * Student std=new Student();
		Student std2=new Student("홍길동",1,1,1,100,100,100);
		Student std3=new Student(std2);
		std2.setName("임꺽정");
		System.out.println(std2.getName());
		System.out.println(std);
*/	
	
	StudentManager stdMng= new StudentManager(MAX_STUDENT_COUNT);
	/* new Student("홍길동",1,1,1,100,90,80) :객체를 생성했는데 이름이 없다 =익명객체  */
	stdMng.insert(new Student("홍길동",1,1,1,100,90,80));
	stdMng.insert(new Student("임꺽정",1,1,1,100,90,80));
	stdMng.print();
	stdMng.modify(new Student("유관순",1,1,1,100,100,100));
	System.out.println("--------------------------");
	stdMng.print();
	stdMng.delete(new Student("",1,1,1,0,0,0));
	System.out.println("--------------------------");
	stdMng.print();
	}
	
	public static void printMenu(){
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선책하세요 : ");
	}
}


