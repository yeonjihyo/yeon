package Day2;

import java.util.Scanner;

public class Geee2 {

	public static void main(String[] args) {
	/*int num =6;
		if(num%2==0 && num%3==0){
			System.out.println(num+"6�� ���");
		}*/
		
		//num�� 2�� ����̸� 2�� ������ ����ϰ�
		//num�� 3�� ����̸� 3�� ������ ����ϰ�
		//num�� 6�� ����̸� 6�� ������ ����ϰ�
		//num�� 2,3,6,�ǹ�����ƴϸ� 2,3,6�� ����� �ƴմϴ�
		//�������ϴ¿���
		//num = 6 => 6�� ����Դϴٸ� ����ؾ��Ѵ�
		
		//�ռ��ѹ�ĸ��� ��øif�����̿��ѹ��
		/*int num = 6;
		if(num % 2 == 0){
			if(num % 3 == 0){
				System.out.println(num+"��6�ǹ��");
			}else {
			System.out.println(num+"��2�ǹ��");
		}
		}else if (num % 3 == 0){
				System.out.println(num+"��3�ǹ��");	
		}else{
			System.out.println(num+"��2,3,6�ǹ�����ƴմϴ�.");
		}
		*/

		
		/*int num = 3;
		switch(num%2){
		case 0: //if(num % 2 == o)
			System.out.println("¦��");
			break;
			//..
		case 1: //����2�����̹Ƿ� default:���ص��� 
			System.out.println("Ȧ��");
			
			}	
			*/
		
		
		/*�޷��� �� �޸��� ������ �ϼ��� �ٸ��ϴ�
		 * �����ԷµǸ� �ش��ϴ� ������ �ϼ�������ϴ��ڵ带 switch case���� �̿��Ͽ� �ۼ��Ͻÿ�
		 * 31 : 1,3,5,7,8,10,12
		 * 30 : 4,6,9,11
		 * 28 : 2
		   
		 * int month = 3;
		switch(month){
		case 1 : 
			System.out.println("31");
		break;
		case 2 : 
			System.out.println("28");
		break;
		case 3 : 
			System.out.println("31");
		break;
		case 4 : 
			System.out.println("30");
		break;
		case 5 : 
			System.out.println("31");
		break;
		case 6 : 
			System.out.println("30");
		break;
		case 7 : 
			System.out.println("31");
		break;
		case 8 : 
			System.out.println("31");
		break;
		case 9 : 
			System.out.println("30");
		break;
		case 10 : 
			System.out.println("31");
		break;
		case 11 : 
			System.out.println("30");
		break;
		case 12 : 
			System.out.println("31");
		break;
		default:
			System.out.println("�߸��Է��߽��ϴ�");
		}
		default�� �������������� ���ٸ� ������ 
		if (month ==1 || month ==3 || ) if���̿��ϸ��̷������ϸ��*/
		
		//min~max ������ ������ �������� �����ϴ� �ڵ�
		/*int min = 1;
		int max = 10;
		int random = (int)(Math.random()*(max-min+1) + min);
		System.out.println(random);*/
		//���� ���� ���� ���߿��� ���������ϳ�����
		/*
		 * int min = 1;
		int max = 3;
		int com = (int)(Math.random()*(max-min+1) + min);
		int user = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("����(1),����(2),��(3)���ϳ����Է��ϼ���");
		user = scan.nextInt();
		switch (user-com) {
		case 0:
			System.out.println("���º��Դϴ�.");
			break;
		case -1: case2:
			System.out.println("��ǻ�ͽ��Դϴ�");
		case 1: case-2:  //default�� ��ü����
			System.out.println("����ڽ��Դϴ�");
		}
		//System.out.println(com);
		//152���������� ����
		
		*/
		
	
	}

}
