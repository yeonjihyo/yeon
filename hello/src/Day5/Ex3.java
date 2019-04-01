package Day5;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		/*변수의 유효범위
		 * 일반변수는 선언되면 해당변수를 감싸고 있는 괄호안에서 유효하다.
		 * 
		 *
		for(int i=0;i<10;i++){
			System.out.println(i);
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		}
		 */
		//배열검색
		/*int [] arr = new int[5];
		for (int i=0; i<arr.length; i++){
			 arr[i] = i;
		}
		int search = 5;*/
		//배열 0 1 2 3 4
		/*
		 배열에 있는 모든 값을 확인하여
		 배열의 값과 겁색값이 같으면 find를 true로 변경후 반복문을 종료
		 없으면 계속 진행
		 */
		//변수 search의 값이 배열 arr에 있는지 없는지 나타내는 변수
	/*	boolean find = false;
		for (int j=0; j<arr.length; j++){
			 if(arr[j] == search){
				 find = true;
				 break;
			 }
		}
		if(find){
			System.out.println("배열에는 " + search + "가 있습니다");
		}else{
			System.out.println("배열에는 " + search + "가 없습니다");
		}
		
		*/
		
		
		/*로또번호생성기
		 * 로또번호는 1~45사이의 랜덤한 수가 중복되지 않도록 7개 생성
		 * 1.로또배열을 생성하여 각 번지에 0~6을 수차적으로 저장
		 * 2.로또배열을 생성하여 각 번지에 1~45사이의 랜덤한 수를 저장
		 * 3.배열에 해당 값이 있는지 없는지 검색
		 * 4.로또 배열에 1~45사이의 중복되지 않은 랜덤한 수를 저장
		 * 
		 * 
		 * */
		/*
		 * 1. 랜덤한수를 생성
		 * 2 생성된수가 배열에 있는지없는지검색
		 * 3 없으면 생성된수를 배열에 저장, i를 증가
		 * 4있으면 아무일도 하지 않는다*/
		
	/*	int [] num;
		num = new int[7];
		int i=0;
		for(i=0;i<num.length;){
			//중복되면안되기떄문에i++을지워주고 아래 if문에서 i++을 써서 그안에서 중복되지않게 만든다?
			 int r=(int)(Math.random()*(7-1+1))+1;
			//num[r]=r
			//System.out.println(num[i]);
			boolean find = false;
			for (int j=0; j<num.length; j++){
				 if(num[j] == r){
					 find = true;
					 break;
				 }
			}
			if(!find){//find==false
				num[i] =r;
				i++;
			}
		}
		for (int k=0;k<num.length; k++){
				System.out.println(num[k]);
		}
	*/
		//199p참고-방식다름

		//a~z,A~Z, 0~9로 조합된 8자리의 임시 비밀번호 발급하는 예제 
		//a~z 26개 A~Z 26R개 0~9 10개
		//62개,0~61
		//0~9   : '0'~'9'
		//10~35 : 'a'~'z'
		//36~61 : 'A'~'Z'
		//랜덤한 수가 60 : 'Y'
		
		char [] pw = new char[8];
		for(int i =0;i<pw.length;i++){
			int r=(int)(Math.random()*(61-0+1));
			if(r<=9){
				//문자+정수=정수
				//문자=정수;  (불가능)
				//문자=(char)정수; (가능)
				pw[i] = (char)('0'+r);
			}else if(r<=35){
				pw [i] = (char)('a'+(r-10));
			}else{
				pw [i] = (char)('A'+(r-36));
			}
		}
			System.out.println(pw);
				
			
		//a b c d ...z
		int numA='a';
		int numB='b';
		//문자a에 대한 유니코드 정수값: 97
		System.out.println(numA);
		//문자b에 대한 유니코드 정수값 :98
		System.out.println(numB);
		
		numA='A';
		numB='B';
		//문자a에 대한 유니코드 정수값 : 65
		System.out.println(numA);
		//문자b에 대한 유니코드 정수값: 66
		System.out.println(numB);
		
		int num = 100; //'d'
		System.out.println((char)num);
		
		
		//97이 a라는것을이용하여 a~z까지 출력하는 예제
		for (int i=97;i<=97+25;i++){
			System.out.print((char)i);
		}
		System.out.println();
		
		//'a'부터 'z'까지 출력하는 예제
		for (int i='a';i<='z';i++){
			System.out.print((char)i);
		}
		System.out.println();
		for (int i=0;i<=25;i++){
			System.out.print((char)('a'+i));
		}
		//배열위치차이
		int[] arr1, arr2;
		int arr3[], arr4;
		arr1=new int[3]; //배열
		arr2=new int[3]; //배열
		arr3=new int[3]; //배열
		//arr4=new int[3]; //변수 arr4 : int
		int[]arr5;
		int arr[];
		//하나씩쓰면 []위치상관없음	
		
		
		
	}

}
