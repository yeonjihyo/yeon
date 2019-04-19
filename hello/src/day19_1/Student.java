package day19_1;

public class Student {

	//멤버변수선언
	
	private String name;
	private String uniName;
	private String id;
	private String major;
	private double average;
	
	
	
	//private이기때문에 getter,setter 필요
	//이때 학점은 double이기때문에 제한을 걸어줘야함 setAverage에서 세팅해준다
	
	public String getName() {
		return name;
	}
	public String getUniName() {
		return uniName;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAverage() {
		return average;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAverage(double average) {
		if(average < 0.0 || average> 4.5){
			return;
		}
			
		this.average = average;
	}
	
	
	//toString 
	@Override
	public String toString() {
		return "학생 [이름= " + name + ", 학교이름= " + uniName + ", 학번= " + id + ", 학과= " + major + ", 학점= "
				+ average + "]";
	}
	
	//생성자 
	public Student(){
		name="";
		uniName="";
		id="";
		major="";
		//average는 자료형이 double이라 0이기 떄문에 안해줘도됨
	}
	
	
	
	//복사생성자 
	public Student(Student s){
		/*name=s.name;
		uniName=s.uniName;
		id=s.id;
		major=s.major;*/
		this(s.name,s.uniName,s.id,s.major,s.average);
				
	}
	
	
	//생성자 오버로딩 
	public Student (String name, String uniName, String id, String major, double average){
		this.name=name;
		this.uniName=uniName;
		this.id=id;
		this.major=major;
		this.average=average;
				
	}
	
	
	
	
}
