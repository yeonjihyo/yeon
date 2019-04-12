package day14;
/*상속 : 물려받는것
클래스의 상속 : 부모의 멤버변수와 멤버메소드를 물려받는것

상속?
클래스를 재사용하여 코드의 중복을 제거
편하게 사용하기 위해서 



사람(Person)
=>이름 ,나이 ,생일,성별,주소,국적


대학교 학생을 관리하는 프로그램 
=> UniversityStudent (일반 대학교를 다니는 학생)
석사 
학사
박사*/
public class Person {

	
	//=>이름 ,나이 ,생일,성별,주소,국적
	private String name;
	private int age;
	private String birthDay;
	private String gender;
	private String address;
	private String nationality;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age>=0)
		this.age = age;
	}
	public void setBirthDay(String birthDay) {
		if(birthDay == null || birthDay.length()!=8)
			return; // yyyymmdd가 8자리가 아니면 처리할이유가 없다라는뜻?
		//yyyymmdd
		//substring : 부분문자열로 4번지와 5번지를 추출 
		String sMonth=birthDay.substring(4,6); 
		//Integer : 정수형 클래스 다 정도로 기억 int형변수를 클래스로만들었다
		//month는 null이라는 초기값을 가질수있다
		//문자열 12를 정수 12로 변경
		Integer month=Integer.parseInt(sMonth);
		if(month>=1 && month<=12 )
			this.birthDay=birthDay;
		
		this.birthDay = birthDay;
	}
	public void setGender(String gender) {
		//throw 예외처리를 추가해준다면 
		if(gender == null)
			try {
				throw new Exception("객체가 null값입니다.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				this.gender="남자";
			}
		if(gender !=null && ( gender.equals("남자") || gender.equals("여자")))
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Person(){
		/*name="";  address=""; nationality="";
		age=1; 
		setGender("남자");
		setBirthDay("20000101");
		아래과정을 통해 아래와 같이 간단하게 줄여짐 */ 
		this("","","","남자","20000101",1);
	}
	public Person(Person p){ //복사생성자
		this(p.name,p.address,p.nationality, p.gender,p.birthDay,p.age);
	}
	
	public Person(String name, String address,String nationality, String gender, String birthDay, int age){
		this.name=name; this.address=address;
		this.nationality=nationality; this.age=age;
		
		setGender(gender);
		setBirthDay(birthDay);
		
	}
}
