package Day5;

public class Ex6 {

	public static void main(String[] args) {
		// 버블정렬 : 단순하고 효율이 가장 안좋다.
		int [] arr= new int[]{1,3,5,7,9,2,4,6,8};
		//반복횟수 : 배열의크기-1
		//한명할떄마다 한명씩 확정되기떄문에 마지막은 할 필요가 없으니까
		for (int i=0;i<arr.length-1;i++){
			//i=0부터시작하느냐 1부터시작하느냐에 따라 =(같다)를빼야
			for(int j=0; j<arr.length-1 ; j++){
				if(arr[j] < arr[j+1]){
					//숫자가큰애를 뒤로보내고싶을때>
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
	}

}
