package test2;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 상속 
부모 클래스에게 멤버 변수와 메소드를 물려받는것
단 private으로 된 변수와 메소드는 상속을 받아도 직접접근할 수 없다.

상속받은 자식 클래스는 접근할 수 있으나 외부에서 접근하는 것을 막는 접근제한자 protected를 이용하면 된다

private : 나 (일반적으로 멤버변수) 
dafault :나+패키지
protected : 나+자식+패키지(일반적으로 멤버변수) 
public : 누구나 (일반적으로 멤버메소드와 생성자(필수)) 

오버라이딩
-부모클래스의 메소드를 재정의하는것 

오버로딩
- 동일한 이름의 메소드가 여러개 있는것
-매개변수의 갯수가 다름
-매개변수의 갯수가 같지만 자료형이 다른 경우 

부모클래스의 메소드나 생성자에 접근하기 위한 super



상속과 인터페이스
상속은 부모가 1명
인터페이스는 여러개 구현할 수 있다.

하나의 프로그램을 프로세서라고한다
여러개의 쓰레드가 있을 수 있다
 쓰레드를 쓰는이유 : 동시에 여러일을 처리하고 싶을때 
 
 
 
 */
