package Day8;

public class Ex7_overloadingEx1 {

	public static void main(String[] args) {
		
		
		 printMultiTables();
		 printMultiTables(1,9);
	}
	

		public static void printMultiTable(int num){
			int i=0;
			int dan=0;
			for(i=1;i<=9;i++){
				dan=num*i;
				System.out.println(num+"*"+i+"="+dan);
			}
			
		}
		
		public static void printMultiTables (int start, int end){

			int i=0;
			for (i=start;i<=end;i++){
				printMultiTable(i);
			}

		}
		
		/*
		 * 기능 : 구구단 전체(2단~9단)이 출력되는 기능
		 * 매개변수: 구구단전체 (2단~9단) 
		 * 리턴타입: void
		 * 메소드명: printMultiTables
		 * */
		public static void  printMultiTables(){
			int i=0;
			printMultiTables(2,9);
			/*
			 * for(i=2;i<=9;i++){
				printMultiTable(i);
			}*/
		}
		
		
		
		
		
		
		
}


