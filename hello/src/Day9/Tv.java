package Day9;


//같은패키지안에서 동일한 이름을 가지는 클래스를 선언할수없다. 안된다는예시는 ClassEx1에 있음 
public class Tv {
	//일반멤버변수 , 객체멤버변수 => 객체가 필요
	private int channel;
	private int volumn;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUMN = 100;
	
	
	public static final String BRAND="삼성";
	//static은 클래스 멤버변수
	
	
	
	//일반멤버메소드, 객체멤버메소드
	public void channelUp(){
		if (channel< MAX_CHANNEL)
			channel++;
		}
	public void channelDown(){
		if (channel>1)
			channel--;
		}
	public void setchannel(int ch){
		if(ch==0){
			channel=1;
		}else if(ch>MAX_CHANNEL){
			channel =MAX_CHANNEL;
		}else{
			channel=ch;
		}
		channel =ch;
	}
	public void volumnUp(){
		if(MAX_VOLUMN > volumn){
			volumn++;
		}
	}
	public void volumnDown(){
		if(volumn>0){
			volumn--;
		}
	}
	public void printVolumn(){
		System.out.println("현재소리크기 : " + volumn);
	}
	public void printChannel(){
		System.out.println("현재채널번호 : " + channel);
	}
	//객체멤버메소드에는 클래스멤버변수 또는 클래스멤버메소드를 사용할수 있다
	//sysout(BRAND)
	
	public static void printBrand(){
		System.out.println("Tv브랜드: BRAND");
		//클래스멤버메소드에는 클래스 멤버변수는 사용가능하지만
		//객체멤버변수는 사용할수 없다
		//sysout(channel);
	
	
	}
	//멤버메소드는 원하는 시점에서 호출이 가능하지만
	//생성자는 객체를 생성할때에만 호출한다	
    //객체멤버변수를 초기화
	//생성자가 아예 없을때 기본생성자가 컴파일러에 의해 자동으로 추가된다
	//기본새성자없이 다른 생성자를 만들고 기본생성자를 호출하면 에러가 난다 
	public Tv(){
		this(1,10);
		
		channel=1;
		volumn = 10;
		
	}
	public Tv(int chnnel, int volumn){
		setchannel(channel);
		if (volumn> MAX_VOLUMN){
			this.volumn= MAX_VOLUMN;
					
		}else{
			this.volumn=volumn;
			//this.는 이 클래스가가지는 멤버변수와 멤버메소드가 뜸
		}
		
	}
	//복사생성자
	public Tv(Tv stv){
		this(stv.channel, stv.volumn);
		/*channel = stv.channel;
		volumn = stv.volumn;*/
	}
}
