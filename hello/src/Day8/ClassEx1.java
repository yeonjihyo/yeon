package Day8;
/*
 * 348p
 *public 접근제한자 
 *클래스 public을 붙일수 있는경우는 단하나다.(메소드에는 계속 쓸수있음)
 *클래스명과 파일명이 일치하는 경우에만 public을 붙일 수 있다.
 *
 *접근제한자 -dafault
 *접근제한자 dafault는 dafault라는 키워드를 쓴것이아니라 클래스나 메소드에 접근제한자를 명시하지 않은 경우를 dafault라고한다
 *dafault는 같은 패키지 안에서맍 접근가능하다.
 *
 *접근제한자 private
 *일반적으로 멤버 메소드나 멤버 변수에 붙이고 
 *자신(해당멤버 메소드를 포함하는 클래스)을 제외한 다른 클래스에서 사용할 수 없다. 
 *
 * */

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t =null; //참조변수 초기화는 null
		t= new Tv (); //Tv라는 생성자를 호출해서 객체를 생성 참조변수임=>주소를저장
		t.printvolumn();
		t.volumnDown();
		t.printvolumn();
		//t.//public은안됨 private이므로
		//객체이름. 으로 이용해야함
	}

}
class Tv{
	//public을 붙일수없음.파일명과일치하지않기떄문에
	
	//일반적으로 멤버 변수는 접근제한자를 private로 설정하여 
	//멤버변수를 직접 수정할 수 없게 하고
	//멤버메소드를 통해 수정하도록 한다.
	//멤버 변수 :  부품 , 요소
	private int channel;
	private int volumn;
	private final int MAX_CHANNEL =100;
	private final int MAX_VOLUMN =100;
	//해당클래스의해당메소드만 접근이가능
	//private이 접근제한자이기떄문에tv클래스에서는 사용할수있지만 밖에서는 불가능하다
	
	
	//멤버 메소드 : 기능
	//일반적으로 멤버 메소드는 접근제한자를 public으로 많이 한다.
	//볼륨업=> 기능 :멤버변수 volumn의 크기를 하나 증가하는 메소드
	     // 매개변수 : 없다 void (써도되고안써도됨)     //크기를 하나증가하기떄문에 내가알아서올리면되니까 없다 
         // 리턴타입 : 없다 void      //10에서 11로올린걸알려주지않아도되니까
	     // 메소드명 : volumn
	//볼륨다운 위에랑 같이
	public void volumnUp(){
		if(MAX_VOLUMN > volumn)
		volumn++;
	}
	public void volumnDown(){
		if(volumn>0){
			volumn--;
		} 
	}
	public void printvolumn(){
		
		 System.out.println(volumn);
	}
	
	
	//채널업
	//채널다운
	//채널변경
	public void channelUp(){
		if(channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel > 0)
			channel--;
	}
	public void setChannel(int ch){
		channel = ch;
	}
		
		 
	//채널변경
	
}


