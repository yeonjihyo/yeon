package day18;

public class UniversityStudent {
	
	/*대학생클래스를 생성하고 
	 * 멤버로 학년에는 열거형으로 학년을 설정한다(1학년~5학년)
	 * :FRESHMAN, SOPHOMORE, JUNIOR, SENIOR,ETC
	 * 성별도 열거형으로 설정(남성,여성)
	 * : MALE, FEMALE
	 * 학과도 열거형으로
	 * : COMPUTER,MECA,MACHINE,CHEMISTRY
	 * 학번,평점,학교이름은 자유롭게
	 * */
	
	private Gender gender;
	private Major major;
	private Grade grade;
	private String name;
	private Integer id;
	private String UniversityName;
	private double average;
	
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityName() {
		return UniversityName;
	}
	public double getAverage() {
		return average;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	public UniversityStudent() {
		gender=Gender.MALE;
		grade=Grade.FRESHMAN;
		major =Major.NONE;
	}
	public UniversityStudent(Gender gender, Grade grade, Major major, String name, Integer id) {
		this.gender=gender;
		this.grade=grade;
		this.major =major;
		this.name=name;
		this.id=id;	
	}
	@Override
	public String toString() {
		return "대학생 [성별=" + gender + ", 학과=" + major + ", 학년=" + grade + ", 이름=" + name
				+ ", 학번=" + id + ", 대학이름=" + UniversityName + ", 평점=" + average + "]";
	}
	
}




	

	