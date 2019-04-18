package day18;

public class EnumEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityStudent std1 = new UniversityStudent(Gender.MALE,Grade.ETC,Major.COMPUTER,"연도경",20190418);
		System.out.println(std1);
		std1.setUniversityName("그린");
		std1.setAverage(3.5);
		System.out.println(std1);

	}

}
