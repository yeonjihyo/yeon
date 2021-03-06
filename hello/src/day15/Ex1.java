package day15;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 조건문
		 * 조건에따라 다른실행문을 작성할 수 있는가?
		 * ~하면 ~해라
		 * ~하면 =>조건식 ~해라=>실행문
		 * if문 switch문
		 * if(조건식){
		 * 실행문1;
		 * }else if(조건식2){
		 * 실행문2;
		 * }else{
		 * 실행문3;
		 * }
		 * switch(변수 또는 식){
		 * case 값` :실행문1; break;
		 * case 값2 :실행문2; break;
		 * default: 실행문3;
		 * }
		 * -사용되는 변수 또는 식의값이 제한적일때
		 * -break : switch문을 빠져나오는기능
		 * -case의 값으로 올수있는자료형 : 정수,문자,문자열
		 * -case의 값은 상수
		 * 
		 * 반복문
		 * 규칙성있게반복하는동작을 코드로 작성할 수 있는가?
		 * 규칙성,반복횟수
		 * for문 while문 do-while문
		 * for문
		 * for(초기화;조건식;증감연산){
		 * 실행문;
		 * }
		 * while문
		 * while(조건식){
		 * 실행문;
		 * }
		 * 
		 * int t=3;
		 * while(t-- >0){
		 * 
		 * }
		 * 
		 * -이중반복문 : 복잡하다 
		 * -밖에 있는 반복문이 1번 실행될때 안에 있는 반복문이 여러번 실행된다
		 * -continue(스킵): 만나면 for문의 증감연산 while문의 조건식으로 간다
		 * -break: 만나면 반복문을 1개 빠져나간다.
		 *		=>break가 포함된 if문을 감싸는 반복문을 빠져나감
		 *-반복문은 조건문과 많이 쓰인다.
		 * 
		 * 배열
		 * -배열을 이용하여 자료들을 잘 관리할 수 있는가?
		 * -정렬,최댓값,최소값,평균,총점
		 * -배열은 참조변수다
		 * 참조변수는 주소를 저장 일반변수는 값을 저장
		 * 참조변수는 값(주소)을 가진 변수의 주소를 저장한다. 
		 * -자료형 []배열이름;
		 * -자료형 배열이름[];
		 *
		 *  -자료형 []배열이름1,배열이름2;
		 *  -자료형 배열이름3[],배열이름4;
		 *   ,에 따라 달라짐. 배열 4는 배열이아님
		 *   
		 * -배열의선언
		 * 배열명 = new 자료형[크기];
		 * -배열의크기 : 배열이름.length 
		 * for (int i=0; i<배열명.length; i++){}
		 * for(int tmp:배열명){}
		 * 
		 * 클래스
		 * -정보를 편하게 관리하기 위해서 클래스를 생성
		 * -클래스 : 설계도
		 * -객체(인스턴스) : 제품
		 * -메소드 :기능
		 * 
		 * -멤버변수+멤버메소드
		 * 
		 * 메소드
		 * -하나의 특정기능을 동작시키는 코드의 집합
		 * -메소드 선언부와 구현부
		 * 접근제한자 (final) (static)리턴타입 메소드명(매개변수){
		 * 구현;
		 * }
		 * -void : 리턴타입,매개변수가 없을때 사용 가능하고 리턴타입은 생략불가 
		 * -메소드생성과정
		 * 1.기능을 상세히 정리하고
		 * 2.기능을 통해 리턴타입과 매개변수를 설정
		 * 3.메소드명 선정
		 * 4.메소드 선언부입력
		 * 5.메소드구현
		 * 		  
		 *-메소드 오버로딩
		 * 한 클래스내에 같은 이름의 메소드를 여러개 정의하는 것
		 * 1.매개변수의 갯수가 다른경우
		 * 2.매개변수의 갯수가 같고 자료형이 다른경우
		 * 
		 * 
		 * 접근제한자
		 * public > protected > default > private
		 * public 무제한
		 * protected 같은 패키지+자식+나
		 * default 같은 패키지+나
		 * private 나
		 * 일반적으로 멤버변수의 접근제한자는 private
		 * 일반적으로 멤버메소드의 접근제한자는 public
		 * 
		 * 클래스의 접근 제한자를 public으로 하려면 클래스명과 파일명이 동일해야 한다.
		 * 
		 * -생성자
		 * 객체를 생성할때 호출되어 멤버메소드를 초기화하는 기능
		 * 
		 * this 
		 * -내 클래스
		 * -매개변수의 이름이 멤버변수와 같아서 구분이 필요할때
		 * -메소드명이 길어서 자동완성을 이용
		 * 
		 * 변수의 초기화
		 * 객체멤버변수
		 * -기본값>명시적초기화>초기화블록>생성자
		 * 클래스멤버변수 :
		 * -기본값>명시적초기화>초기화블록
		 * 
		 * 상속 : 부모클래스에서 멤버변수와 메소드를 물려받는것
		 * -클래스의 재사용을 높여서 코드의 중복을 줄이는 것
		 *  -클래스에서 상속은 단일상속
		 *  -Object : 모든 클래스의 조상
		 *   		  Object클래스의 자식클래스들은 Object클래스의 멤버메소드를 사용할 수있다.
		 *  -관계: 포함(멤버변수로 다른클래스의 객체),상속
		 *  상속 : is a관계 ,a는b이다가 성립하면 b:부모 a:자식
		 *  포함 :has a 관계, a는 b를 포함하고 있다 a:클래스 b:멤버
		 * 	-상속을 받아도 부모클래스의 private멤버들은 사용할 수 없다
		 * 
		 * 오버라이딩
		 * -부모클래스에서 물려받은 메소드를 재정의하는것
		 * -오버라이딩은 부모클래스에 있는 메소드와 리턴타입,메소드명,매개변수가 정확히 일치해야한다.
		 * 
		 * 오버로딩 vs 오버라이딩
		 * 오버로딩
		 * 
		 * super 
		 * -부모를 나타내고
		 * -super() :부모클래스의 생성자
		 * 
		 * static 
		 * -클래스 멤버변수나 클래스맴버메소드를 생성할때 사용
		 * 클래스 멤버들은 클래스를 통해 사용한다
		 * =>객체를 생성하지 않고 사용한다.
		 * =>하지만 객체를 통해 사용할 수는 있다 
		 * 공유하는걸떠올리면됨
		 * 
		 * 다형성
		 * 매개변수의다형성
		 * product ,computer, audio예제
		 * 메소드 매개변수에 다양한 클래스의 객체가 오는데 이 객체들의 부모가 같다면 매개변수를 각각의
		 * 클래스로 하지 않고 부모클래스의 객체를 이용하는것
		 * 
		 * 
		 * 추상클래스
		 * 추상메소드
		 * -메소드의 구현부 없이 선언부만 있어서 구현을 자식클래스에게 맡기는 메소드
		 * 추상클래스
		 * -추상메소드가 1개이상있는 클래스
		 * 
		 * 인터페이스
		 * 추상메소드와 클래스멤버상수로만 이루어져 있는 것
			(객체를만들수없기떄문에 클래스멤버상수)
		 * +디폴트메소드
		 * 기능요약
		 * 인터페이스에서 상속 => 다중상속
		 * 인터페이스는 구현을 통해 클래스를 만들고, 만들어진 클래스를 통해 사용된다
		 * 
		 * 
		 * -디폴트메소드 :인터페이스에 새로운 기능을 추가하면 해당 인터페이스를 구현한
		 *			    모든 클래스에 메소드 오버라이딩을 해야하기 때문에 불필요한 문제가
		 *			    생길 수 있다.
		 *
		 * 예외처리
		 * -프로그램의 안정화를 위해
		 * -예외는 코드상에서 보완이가능
		 *  에러는 코드상에서 보완이 불가
		 *	try-catch
		 *	try{
		 *		//예외가발생할수있는코드
		 *}catch(예외클래스1){
		 *		//예외가 발생했을때 실행할 코드
		 *}catch(예외클래스2){
		 *		//예외가 발생했을때 실행할 코드
		 *}catch(Exception e){
		 *
		 *}finally {	//예외상관없이무조건실행되는거
		 *}
		 *
		 *
		 *throw=> 메소드
		 *-메소드에서 예외가 발생했을때 안에서 처리하지 않고 밖에서 처리하도록 하기 위해 사용
		 *-예외가 발생하면 throw new 예외객체(); 를 통해 예외를 던져준다
		 *-throw가 있는 메소드는 메소드 선언부에 throw를 통해 어떠한 예외가 발생할 수 있는지 명시해주어야한다.
		 *-다만 RuntimeException예외 클래스들은 명시하지 않아도 됨
		 *
		 * 
		 * 
		 * 
		 * toString()
		 * -문자열이 필요한 부분에 객체를 넘겨주면 해당 객체의 toString메소드가 자동으로 호출된다.
		 * 
		 * 
		 * String클래스
		 * 
		 * 래퍼클래스
		 * -일반자료형을 클래스로 만든것 
		 * -래퍼클래스는 각 자료형에 대한 값 +null
		 * -문자열을 다른 자료형으로 바꾸는 방법
		 * Integer.parseInt(문자열);
		 * Float,parseFloat(문자열);
		 * 
		 *
		 * */

	}

}
