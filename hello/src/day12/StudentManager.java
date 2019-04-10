package day12;

public class StudentManager {
	//학생들 정보를 담을 배열
	private Student std[]; //학생정보를 관리하기 위해 여러개를 담을 정보를 배열로 하겠다라는 뜻
	private int count;		//현재 저장된 학생수 
	private final int MIN_STUDENT_COUNT=300;
	public StudentManager(){
		//배열은 스스로만들어야하는 참조변수기때문에 생성해야
		std= new Student[MIN_STUDENT_COUNT];

	}
	public StudentManager(int studentCnt){
		if (studentCnt>=MIN_STUDENT_COUNT){
		std= new Student[studentCnt];
		}else{
		std= new Student[MIN_STUDENT_COUNT];	
		}
	}
	/*학생정보 추가
	 *기능 : 학생정보를 배열에 추가
	 *매개변수 : 학생정보 =>Student s 
	 *리턴타입 : void
	 *메소드명 : insert
	 * */
	public void insert(Student s){
		//std[??] : Student 클래스의 객체는 초기에 선언만 되어 있음
		//insert기능에서 객체정보를 추가하려면 new를 통해 객체를 생성한 후 
		//매개변수의 값을 복사해야함
		std[count++]=new Student(s);//복사생성자를 불러옴
		//count번지에 학생을 추가?? 
		//std[count++]=new Student(s);
		//count++; 이 걸 생략하고 위에처럼 더 간단하게 쓸 수 있다
	}
	 
	
	/*학생정보 출력
	기능: 학생정보 전체 출력
	매개변수 : 없다 내가저장한 데이터가있는데굳이외부에서알려달라할필요가없음
	리턴타입 : 없다 void 출력하라고했지 알려달라고하지않았으니까
	메소드명 : print
	*/
	public void print(){
		for (int i=0;i<count;i++){
			System.out.println(std[i]);
		}
	}
	/*학생정보를 수정 또는 삭제하기 위해 학생정보가 있는지를 알아야하기 때문에
	//학생정보 검색 ==> 학생정보수정하려면 어떤학생을 수정할지 검색해봐야하니까
	기능 : 학생정보 검색해서 없으면 -1을 있으면 배열에 위치한 번지를 알려주는 기능
	매개변수 : 학년, 반, 번호 => int grade, int classNum , int num
	리턴타입 : -1또는 번지를 알려줘야하니까 =>int
	메소드명 :search
	*/
	//애초에 하려던거 아니고 추가했기 떄문에 내부에서만 쓸거라 private로 해도됨?
	private int search (int grade, int classNum , int num){
		for(int i=0;i<count;i++){//저장된학생수만큼해야하니까 count를 쓴다
			if(std[i].getGrade()== grade && std[i].getClassNum()==classNum && std[i].getNum()==num){
				return i;
			}
		}
		return -1; 
	}
	/*학생정보 수정
	기능 : 학생정보를 배열에서 수정
	매개변수 : 학생정보 => Student s
	리턴타입 : 없다 => void
	메소드명 : modify
	*/
	public void modify (Student s){
		//검색했을때 해당정보가 있는 번지
		int searchIndex 
		    = search(s.getGrade(),s.getClassNum(),s.getNum()); 
		if (searchIndex !=-1){
			std[searchIndex]=new Student(s);
			
		}
	}
	
	
	/*학생정보 삭제
	
	*기능 : 배열에서 학생정보 삭제
	*매개변수 : 학생정보 => Student s 또는 학년반번호 따로따로주는방법 
	*리턴타입 : void
	*메소드명 : delete
	*/
	
	public void delete(Student s){
		int searchIndex 
	    = search(s.getGrade(),s.getClassNum(),s.getNum()); 
	if (searchIndex !=-1){
		//배열을밀기
		for (int i= searchIndex;i<count-1;i++){
			std[i] =std [i+1];//std [i+1]에서 std [i]를 덮어쓴다는 의미
		}
		std[count-1]=null;
		//현재저장된개수를하나감소
		count--;
		
	}
	
	}
	
	
}
