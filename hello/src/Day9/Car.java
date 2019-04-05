package Day9;

public class Car {
	
	//1.클래스를만들면 멤버변수를 먼저 설정해야한다 => 필요한 부품 요소
	//2.생성자를 생성 => 멤버변수 초기화
	//3.멤버메소드를 생성 및 구현 => 필요한 기능
	
	
	//1.클래스를만들면 멤버변수를 먼저 설정해야한다 => 필요한 부품 요소
	private int speed;
	private boolean power;
	private char gear;
	private boolean frontLight;
	private boolean backLight;
	private int wiperSpeed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public char getGear() {
		return gear;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public boolean isFrontLight() {
		return frontLight;
	}
	public void setFrontLight(boolean frontLight) {
		this.frontLight = frontLight;
	}
	public boolean isBackLight() {
		return backLight;
	}
	public void setBackLight(boolean backLight) {
		this.backLight = backLight;
	}
	public int getWiperSpeed() {
		return wiperSpeed;
	}
	public void setWiperSpeed(int wiperSpeed) {
		this.wiperSpeed = wiperSpeed;
	}
	
	public Car(){
		this.speed = 0;
		this.power=false;
		this.gear='P';
		this.frontLight=false;
		this.backLight=false;
		this.wiperSpeed=0;
	}
	/*
	 * 속도정보 
	 * 시동
	 * 기어변속
	 * 전방등
	 * 후방등
	 * 와이퍼속도 	 
	 * */
	
	//2.생성자를 생성 => 멤버변수 초기화
	/*
	 * 속도 =>0,시동 off, 기어 파킹, 전방등후방등 off
	 * 와이퍼속도=0
	 * */
	//3.멤버메소드를 생성 및 구현 => 필요한 기능
	/* 
	 * 
	 *시동켜기 시동끄기
	 *엑셀온,브레이크온 
	 *전방등 온,오프
	 *후방등 온,오프
	 *와이퍼제어
	 *
	 * */
	public void turnOn(){
		this.power =true;
	}
	public void turnOff(){
		if (speed==0){
			this.power =false;
		}
	}
	public void acccar(){
		if (power && (gear == 'D'|| gear == 'd')){
			speed++;
		}
	}
	public void breakCar(){
		if (power && (gear == 'D'|| gear == 'd')){
			speed--;
		}
	}
	public void turnfrontLight(){
		frontLight =!frontLight;
	}
	public void turnbackLight(){
		backLight =!backLight;
	}
	
	public void printCar(){
		System.out.println("--------------------------");
		if (power)   System.out.println("시동이 켜져있습니다");
		else         System.out.println("시동이 꺼져있습니다.");
		System.out.println("속도 : "+speed);
		switch(gear){
		case'P' :     System.out.println("기어 : P" ); break;
		case'D' :     System.out.println("기어 : D" ); break;
		case'N' :     System.out.println("기어 : N" ); break;
		case'R' :     System.out.println("기어 : R" ); break;
		}
		if (frontLight) System.out.println("전방등 켜져있습니다");
		else           System.out.println("전방등 꺼져있습니다");
		if (backLight) System.out.println("전방등 켜져있습니다");
		else           System.out.println("전방등 꺼져있습니다");
		
		switch(wiperSpeed){
		case 0: System.out.println("와이퍼 : 정지"); break;
		case 1: System.out.println("dhkdlvj : 천천히"); break;
		case 2: System.out.println("dhkdlvj : 보통"); break;
		case 3: System.out.println("dhkdlvj : 빠름"); break;
		}
		System.out.println("--------------------------");
		
	}
	


}
