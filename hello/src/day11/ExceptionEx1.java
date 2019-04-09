package day11;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 예외처리하기 416p
 * try{
 *  	예외 상황이 발생할 수 있는 코드;
 * }catch(예외클래스 객체이름){//객체가여기서만들어지기때문에 이름이 상관없음 
 * 
 * }
 * 일반적으로예외처리가안된상태에서 예외가 발생하면 
 * 프로그램이 중단되는데 예외처리를 하면 예외가 발생해도 프로그램을 중단하지 않고
 * 다음코드를 실행할 수 있다.
 * */
		
		int num1=1, num2=0;
		double res;
		int arr[]=new int[10];
		try{
			//예외 상황이 발생할 수 있는 코드
			//ArrayIndexOutOfBoundsException가 발생할 수 있다.
			//arr[10]=0;
			//ArithmeticException이 발생할 수 있다
			res=num1/num2;
			System.out.println(res);
		}
		//try문에서 ArithmeticException이 발생하면
		//아래 catch문을 실행하고 다음 코드를 실행해라.
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.getStackTrace();
			System.out.println("연산 예외 발생!!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 예외 발생!!");
		}catch(Exception e){//else라고 생각하면됨 
			System.out.println("예외 발생!!");
		}finally{
		System.out.println("프로그램 종료!!");
	}
		//toString
		Shape ss= new Shape();
		System.out.println(ss);
	}
	
	

}
