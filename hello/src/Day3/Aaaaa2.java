package Day3;

public class Aaaaa2 {

	public static void main(String[] args) {
		
		
		// ������7���� ����ϴ� �ڵ带 �ۼ��ϼ���*/
		/*
		int i=1, num=7;
		int res = 0;
				for(i=1;i<=9;i++){
					res = num*i;
					System.out.println(num + " x "+i + " = " + res  );
				}
		
		2�ܺ��� 9�ܱ���
		
		int i=1, num=7;
					int res = 0;
					for (num=2; num<=9; num++){
					System.out.println(num + "��");
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
		���1
		for(i=1;i<=6;i++){
			System.out.println("*****");
			���2
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
		          *    i=1 ��=5 *=1
		         **    i=2 ��=4 *=2
		        ***    i=3 ��=3 *=3
		       ****    i=4 ��=2 *=4
		      *****    i=5 ��=1 *=5
		     ******    i=6 ��=0 *=6
	                  	��=6-i   		*/
		
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
		     *
		    ***
		   *****
		  *******
		 *********
		***********
		
		
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
		  ���������� �������������̿��� �ٸ�Ǯ��   
	     *              i=1 ��*=0
	    ** *			i=2 ��*=1
	   *** **			i=3 ��*=2
	  **** ***			i=4 ��*=3
	 ***** ****			i=5 ��*=4
	****** ***** 		i=6 ��*=5
							��*=i-1
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
		 ******       i=1 *=6 ��=0
		  *****       i=2 *=5 ��=1
		   ****       i=3 *=4 ��=2
		    ***       i=4 *=3 ��=3
		     **       i=5 *=2 ��=4
		      *       i=6 *=1 ��=5
		           *=7-i=6+1-i=num+1-i 
		           ��=i-1
		 
		 
		
		
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
		           *=7-i=6+1-i=num+1-i ��=
		 
		 */	
			
			
		}
	}

