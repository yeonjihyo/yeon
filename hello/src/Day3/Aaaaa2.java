package Day3;

public class Aaaaa2 {

	public static void main(String[] args) {
		
		
		// 구구단7단을 출력하는 코드를 작성하세요*/
		/* 3*33/
		int i=1, num=7;
		int res = 0;
				for(i=1;i<=9;i++){
					res = num*i;
					System.out.println(num + " x "+i + " = " + res  );
				}
		
		2단부터 9단까지
		
		int i=1, num=7;
					int res = 0;
					for (num=2; num<=9; num++){
					System.out.println(num + "단");
							for(i=1;i<=9;i++){
								res = num * i;
								System.out.println(num + " x "+i + " = " + res );
					}
							}
					*/
	
		
		/* *****
		   *****
		   *****
		   *****
		   *****
		   *****
		 
	
		
		int i=0, j=0;
		방법1
		for(i=1;i<=6;i++){
			System.out.println("*****");
			방법2
		int i=0, j=0;
		for(i=1;i<=8;i++){
			for(j=1;j<=8;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
		
		}
	*/
	
		
		
		/*
		 *      i=1 *=1
		 **     i=2 *=2
		 ***    i=3 *=3
		 ****   i=4 *=4
		 *****  i=5 *=5
		 ****** i=6 *=6
		 *           *=i
		 */
		
		
		
		
		
	/*	int i=0, j=0 ;
		for(i = 1; i<=6 ; i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
		*/
		
		
		/*
		          *    i=1 공=5 *=1
		         **    i=2 공=4 *=2
		        ***    i=3 공=3 *=3
		       ****    i=4 공=2 *=4
		      *****    i=5 공=1 *=5
		     ******    i=6 공=0 *=6
	                  	공=6-i   		*/
		
		/*int i=0, j=0;
		for(i=1;i<=6;i++){
			for( j=1 ; j<=6-i ; j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println( );
		}*/
		
		int i=0, j=0;
				for(i=1;i<=6;i++){
					for(j=1;j<=6-i;j++){
						System.out.print(" ");
					}
					for(j=1;j<=i;j++){
						System.out.print("*");
					}
					System.out.println( );
				}
		
		
		
		
		
		
	        /* 
		     *          i=1  공=5  *=1
		    ***         i=2  공=4  *=3
		   *****        i=3  공=3  *=5
		  *******       i=4  공=2  *=7
		 *********      i=5  공=1  *=9
		***********     i=6  공=0  *=11
							공=6-i  *=2*i-1
		
		*/
		
	/*	
		
	int i=0, j=0;
	for(i=1;i<=6 ;i++){
		for( j=1 ; j<=6-i ; j++){
			System.out.print(" ");
		}
		for(j=1;j<=2*i-1;j++){
			System.out.print("*");
		}
		System.out.println( );
		

	}
	
	*/
	
		 /*    
		  위에문제고 위위문제답을이용한 다른풀이   
	     *              i=1 추*=0
	    ** *			i=2 추*=1
	   *** **			i=3 추*=2
	  **** ***			i=4 추*=3
	 ***** ****			i=5 추*=4
	****** ***** 		i=6 추*=5
							추*=i-1
	*
	
		int i=0, j=0;
		for(i=1;i<=6;i++){
			for( j=1 ; j<=6-i ; j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			for(j=1;j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
		*/
		
		/*
		 ****** i=1 *=6
		 *****  i=2 *=5
		 ****   i=3 *=4
		 ***    i=4 *=3
		 **     i=5 *=2
		 *      i=6 *=1
		           *=7-i=6+1-i=num+1-i
		 */
		
		/*
		int i=0, j=0, num=6;
		for(i=1;i<=num;i++){
			for(j=1;j<=num+1-i;j++){
				System.out.print("*");
		    }
			System.out.println( );
		}
		*/
		
		
		
		/*
		 ******       i=1 *=6 공=0
		  *****       i=2 *=5 공=1
		   ****       i=3 *=4 공=2
		    ***       i=4 *=3 공=3
		     **       i=5 *=2 공=4
		      *       i=6 *=1 공=5
		           *=7-i=6+1-i=num+1-i 
		           공=i-1
		 
		 
		
		
		int i=0, j=0, num=6;
		for(i=1;i<=num;i++){
			for(j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(j=1;j<=num+1-i;j++){
				System.out.print("*");
		    }
			System.out.println(" ");
		}
		
		*/
		
		
		/*	
		
		 ***********       i=1 *=6
		  *********    i=2 *=5
		   *******    i=3 *=4
		    *****      i=4 *=3
		     ***       i=5 *=2
		      *       i=6 *=1
		           *=7-i=6+1-i=num+1-i 공=
		 
		 */	
			
			
		}
	}

