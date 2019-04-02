package Day6;

public class Ex6 {

	public static void main(String[] args) {
		int max=45, min=1;//max가 7보다 작으면 배열생성에 실패
		//System.out.println(random(min,max)); //첫번째임의의정수를알려주는메소드를할때 
		int r=random(min,max);
		int [] arr = new int[7];
		int [] arr2 =new int[6];
		//int [] arr = null; //배열생성에실패
		/*System.out.println(r);
		System.out.println(contain(arr,r,arr.length)); */
		if(createRandArr(min, max, arr)){
			printArr(arr);
		}else{
			System.out.println("배열생성에실패");
		}
		
		if(createRandArr(min, max, arr2)){
			printArr(arr2);
		}else{
			System.out.println("배열생성에실패");
		}
		//메소드의 매개변수는 인자(인수)의 값를 복사하여 생성한다.
		//일반변수를 매개변수로 하느냐 참조변수를 매개변수로 하느냐에 따라 원본이 바뀔 수 있다.
		//일반변수를 매개변수로 하면 원본이 안바뀐다.
		//참조변수를 매개변수로 하면 원본이 바뀔 수 있다.
		//참조변수란 변수에 주소를 저장하는 변수 182p 5-2표
	}
	/*
	 * 기능 : 최소값(min)과 최대값(max)가 주어지면 최소값과 최대값 사이의 임의의 정수를 알려주는 메소드
	 * 매개변수 : 최소값 최대값 int min,  int max
	 * 리턴타입 : 정수 int
	 * 메소드명 : random
	 * */

	public static int random(int min, int max){
			/*
			 * 실수로 최소값과 최대값을 바꿨을떄 
			 * if(min>max){
				int tmp=min;
				min=max;
				max=tmp;
			}*/
		return (int)(Math.random()*(max-min+1)+min);
	}
	/*
	 * 기능 : 배열에 검색숫자가 있는지 없는지 확인하는 메소드
	 * 매개변수 : 검색숫자,배열 => int[] arr, int num
	 * 리턴타입 : 있는지없는지 => boolean
	 * 메소드명 : contain
	 * */
	public static boolean contain(int[] arr, int num, int cnt){//내가원하는갯수만큼검색하기위해 int cnt를 넣어
		if(arr==null){
			return false;
		}
		//배열의 크기보다 더 많이 검색하려는 경우
		if(cnt>arr.length){
			cnt=arr.length;//예외상황발생할수있으니 안전하게 
		}
		for(int i=0;i<cnt;i++){
			if(arr[i] == num){
				return true;
			}
		}
		return false;
	}
	/*
	 * 기능 : 최소값과 최대값, 배열이 주어지면 중복되지 않은 랜덤한 수(min~mmax)로
	 *      배열을 채우는 메소드
	 * 매개변수 : 최소값 최대값 배열  => int min, int max, int []arr
	 * 리턴타입 : boolean(배열을 채웠는지 못채웠는지 여부)
	 * 메소드명 :createRandArr
	 * 
	 * */
	public static boolean createRandArr(int min, int max, int []arr){
		if (arr == null){
			return false;
		}
		if(max-min+1 < arr.length){
			return false;
		}
		int cnt = 0;
		while(cnt<arr.length){
			int r = random(min,max);
			//arr에 r이 업으면
			if(!contain(arr,r,cnt)){
				arr[cnt] = r;
				cnt++;
				
			}
		}
		return true;
	}
	/*
	 * 기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메소드
	 * 매개변수 : 배열 =>int []arr
	 * 리턴타입 : 없다 void
	 * 메소드명 : printArr
	 * */

	public static void  printArr(int []arr){
		System.out.print("[");
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println("]");
	}


/*
 * 과정 
 * 배열을 생성
 * 1 랜덤한수 1~45
 * 2 중복되지않고
 * 7개짜리 6개짜리
 * 
 * 
 * 1 랜덤한수를 생성하는 메소드 :random
 * 2(중복되자않게하기위해서)
 * 배열에 검색하려는 수가 있는지 없는지 확인하는 메소드 :contain
 * 3배열을 생성(1,2를 만족하는 )하는 메소드 createRandArr
 * 
 * random : 임의의 정수를 만드는 공식이 복잡해서 간단하게 메소드로 만듬
 * 매개변수 : 최소값 최대값 => int min , int max 
 * 리턴타입 : 임의의 정수 => int
 * public static int random(int min , int max){
 * 		int r = (int)(Math.random()*(max-min+1)+min)
 * 		return r;
 *   리턴밑에는 코드를 넣으면 안됨 if랑있을떄는된다?
 * }
 * 
 * contain =검색수가 배열에 있는지 없는지 확인하는 ㅁ ㅔ소드
 * 매개변수 :배열,검색수=>int []arr, int num
 * 리턴타입 :boolean(있는지없는지확인할때)
 *  public static boolean contain(int []arr, int num){
		   for(int tmp:arr){   =>향상된for문
		   	if(tmp == num){
		   			return true;
		   	}
		   }
		   return false;
    }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */


}
	
