package day13;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 배열의 모든 값을 출력하는 코드를 작성하세요
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		int i=0;
		/*for (i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();*/
		
		//향상된 for문
		//1.배열이나 컬렉션프레임워크일때 사용 
		//2.배열의 값을 확인할때 사용
		//3.배열의 값을 수정할때는 사용하지 않음
		//4.모든 배열을 확인하면서 번지를 신경안쓸때
		
		for(int tmp : arr){ 
			System.out.print(tmp+" ");
		}
		System.out.println();
		//아래식은 위의 향상된 For문과 같음 
		for (i=0;i<arr.length;i++){
			int tmp=arr[i];
			System.out.print(tmp+" ");
		}
		System.out.println();

		
		//위의 배열에서 짝수번지에 있는 값을 출력하세요
		
		for (i=0;i<arr.length;i++){
			if (i%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		/*for (i=0;i<arr.length;i+=2){
			int tmp=arr[i];
			System.out.print(tmp+" ");
		}
		System.out.println();
				*/
		//위의 배열에서 가장 큰수를 출력하세요
		int max=arr[0]; //최대값최소값은 배열의 0번지에있는값을 넣음 어짜피 배열을 다확인하고 비교하기때문에 
		for (int tmp : arr){
			if(max<tmp){
				max =tmp;
			}
		}
		System.out.println("배열의 최댓값 : " + max);
		
	
	}

}
