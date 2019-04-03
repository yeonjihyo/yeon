package Day6;

public class Ex7_ex6again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10, min = 1;//max가 7보다 작으면 배열 생성에 실패
		int [] arr= new int[7];
		int [] arr2 = new int [6];
		//int [] arr= null;//배열 생성에 실패
		if(createRandArr(min, max, arr)){
			printArr(arr);
		}else{
			System.out.println("배열 생성에 실패");
		}
		if(createRandArr(min, max, arr2)){
			printArr(arr2);
		}else{
			System.out.println("배열 생성에 실패");
		}
		//당첨등수를 출력하는 코드를 작성해보새요
		//1등 : 보너스번호를 제외한 번호 6개가 일치
		//2등 : 보너스번호를 포함한 번호 6개가 일치
		//3등 : 보너스번호를 제외한 번호 5개가 일치
		//4등 : 보너스번호를 제외한 번호 4개가 일치
		//5등 : 보너스번호를 제외한 번호 3개가 일치
		//꽝 : 2개이하
		int r= rank(arr,arr2);
		printRank(r);
	}
    
	
	
	
	/* 기능 : 최소값(min)과 최댓값(max)가 주어지면 최솟값과 최댓값 사이의 임의의 정수를
	 * 알려주는 메소드
	 * 매개변수 : 최솟값, 최댓값=>int min, int max
	 * 리턴타입 : 정수 => int
	 * 메소드명 : random 
	 * */
	public static int random(int min, int max){
		if(min>max){
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	/* 기능 : 배열에 검색숫자가 있는지 없는지 확인하는 메소드
	 * 매개변수 : 검색숫자,배열=>int[] arr, int num
	 * 리턴타입 : 있는지(true), 없는지(false)=>boolean
	 * 메소드명 : contain
	 * */
	public static boolean contain(int []arr, int num, int cnt){
		if(arr == null){
			return false;
		}
		//배열의 크기보다 더 많이 검색하려고 하는 경우
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i] == num){
				return true;
			}
		}
		return false;
	}
	/* 기능 : 최솟값과 최댓값, 배열이 주어지면 중복되지 않은 랜덤한 수(min~max)로 
	 *       배열을 채우는 메소드
	 * 매개변수 : 최솟값, 최댓값, 배열 =>int min, int max, int []arr
	 * 리턴타입 : boolean(배열을 채웠는지 못채웠는 여부)
	 * 메소드명 : createRandArr
	 */
	public static boolean createRandArr(int min, int max, int []arr){
		// 매개변수로 넘어온 배열이 생성되어 있지 않을 때
		if(arr == null)				{	return false;		}
		// 생성할 수 있는 숫자의 갯수보다 배열의 크기가 클때
		//중복되는 상황이 발생할 수 밖에 없을때 
		if(max-min+1 < arr.length)	{	return false;		}
		int cnt = 0; //배열에 저장된 랜덤한 숫자의 갯수
		//배열의 갯수만큼 저장되면 반복문을 종료
		while(cnt < arr.length){
			int r = random(min,max);
			//arr에 r이 없으면
			if(!contain(arr, r, cnt)){
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;
	}
	/* 기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메소드
	 * 매개변수 : 배열 =>int []arr
	 * 리턴타입 : 없다 =>void
	 * 메소드명 : printArr
	 */
	public static void printArr(int []arr){
		System.out.print("[ ");
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.print("]\n");
	}
	public static int contain2(int []arr, int num, int cnt){
		if(arr == null){
			return -1;
		}
		//배열의 크기보다 더 많이 검색하려고 하는 경우
		if(cnt > arr.length){
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i] == num){
				return i;
			}
		}
		return -1;
	}
	public static boolean createRandArr2(int min, int max, int []arr){
		if(arr == null)				{	return false;		}
		if(max-min+1 < arr.length)	{	return false;		}
		int cnt = 0;
		while(cnt < arr.length){
			int r = random(min,max);
			//arr에 r이 없으면
			if(contain2(arr, r, cnt)<0){
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;
	}
	/* 기능 : 두 배열이 주어지면 두배열에 같은 원소가 몇개 있는지 알려주는 메소드
	 * 매개변수 :두 배열 => int []arr1, int []arr2
	 * 리턴타입 : 갯수=> int
	 * 메소드명 compareArr
	 * */
	
	public static int compareArr(int []arr1, int []arr2){
		int cnt=0; //두 배열의 원소중 일치하는 갯수
		int size = 0; //두 배열중 작은 배열의 길이를 저장
		if (arr1.length > arr2.length){
			size = arr2.length;
		}else{
			size = arr1.length;
		}
		//두 배열에서 일치하는 원소의 갯수를 구하는 과정
		for(int i=0;i<size;i++){
			if(contain(arr2,arr1[i],size)){
				cnt++;
			}
		}
		return cnt;
	}
		/* 기능 : 당첨배열과 자동생성배열이 주어지면 몇등인지 알려주는 메소드 (단 꽝은 -1)
		 * 매개변수 :두 배열 => int []lotto, int []auto
		 * 리턴타입 : 등수=> int 
		 * 메소드명 rank
		 * */
		public static int rank(int []lotto, int []auto){
			int cnt = compareArr(lotto, auto);
			switch(cnt){
			case 6 : return 1;
			case 5 : 
				switch(contain2(auto,lotto[lotto.length-1],auto.length)){
				case -1 :
					return 3;
				default:
					return 2 ;
				}
			case 4 : return 4;
			case 3 : return 5;
			default:return -1;
			}
		}
		public static void printRank(int r){
			if (r == -1){
				System.out.println("꽝");
			}else{
				System.out.println(r + "등");
			}
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
	 * 0403일 이어서
	 * 1.random :(최소값과 최대값)사이의 (랜덤한수)를 생성해서 알려주는 메소드
	 * 2.contain (숫자가 배열의 cnt갯수에서)에 (있는지없는지)알려주는 메소드
	 * 3.createRandArr : 배열에 최소값과 최대값 사이의 랜덤한 수로 채우고
	 * 					 (성공여부)를 알려주는 메소드
	 * 매개변수 : int min, int max,int[]arr
	 * 리턴타입 : boolean
	 * 
	 * 
	 * 
	 * */


}
