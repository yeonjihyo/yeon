package Day3;

import java.util.Scanner;

public class Aaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 5������ ���� ���ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��ϼ���
		/* int i=0;
		int sum=0;
		for(i=1, sum=0 ;i<=5;i++) {
			sum=sum+i;
		}
			System.out.println(sum);*/
		//1���� 10���� ¦���� ���� ���ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ�
			/*���1:1���� 10���� �ϳ��� �����ϸ鼭¦���̸���ϰ� Ȧ���̸鹫���Ѵ�
			 * ���2"1���� 10���� 2���������ϸ鼭 ���Ѵ�
			 * ���3: 1����5���� �ϳ��������ϸ鼭 �ش���� 2�����ش��Ѵ�*/
		
		/*���2
		int i=0;
		int sum=0;
		for (i=1, sum=0;i<=10;i++){
			if(i%2==0){
				sum+= i;
			
			}
		}
		System.out.println("1����10����¦����"+ sum);
		
		���2
		 * int i=0;
		int sum=0;
		for(i=2, sum=0;i<=10;i+=2){
			sum+=i;
		}
		
		System.out.println("1����10����¦����:"+ sum);
		
		
		���3
		int i=0;
		int sum=0;
		for(i=1, sum=0;i<=5;i++){
			sum+=i*2;
		}
		System.out.println("1����10����¦����:"+ sum);
		
		*/
		
		/*������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ�	
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1,cnt=0; i<=num; i++){
			if(num % i ==0){
				cnt++;
			}
		}
		if(cnt ==2){
			System.out.println(num+"�¼Ҽ�");
		}
		else{
			System.out.println(num+"�¼Ҽ����ƴ�");
		} */
		
		/*
		 �Ҽ��Ǻ�
		 i�� num�� ����̸�
		 2��4�Ǿ���̸�
		 num%i==0
		 */
		
		/*�μ��� �ִ������� ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		 * �ִ�����:�μ��ǰ�����߰���ū�����
		 * �����: �μ��Ǿ���߿����������ε��ִ¾��
		 * 8�Ǿ�� 1 2 4 8
		 * 12�Ǿ�� 1 2 3 4 6 12
		 * 8��12�ǰ���� 1 2 4
		 * 8��12�� �ִ����� 4 
		 * */
		
		/*
		 int num1=8, num2=12, gcd=1, i=1;
		for (gcd=1, i=1;i<=num1;i++){
			if(num1%i==0 && num2%i==0){
				gcd=i;
			}
		}
		System.out.println(num1+"��"+num2+"���ִ�����"+gcd);
		*/
		
		/* �μ��� ���μ����� �Ǻ��ϼ���
		 * ���μҶ� �μ��� �ִ�������1�εμ������ǰ��踦����
		 * 3��7�� ���μҰ���
		 * 4��6�����μҰ��谡�ƴ�
		 */
		/*
		int num1=3, num2=7, i=1, gcd=1;
		for(i=1, gcd=1;i<=num1;i++){
				if(num1%i==0 && num2%i==0){
					gcd=i;			
				}
		}
		//�ִ�������1�������鼭�μҰ���������ϰ�ƴϸ鼭�μҰ��谡�ƴ�
		if(gcd==1){
			System.out.println(num1+"��"+ num2 +"�� ���μ�");
		}else{
		System.out.println(num1+"��"+ num2 +"�� ���μҾƴ�");
		}
		
		
		*/
		
		
		/* 
		 *break��continue
		 break�� if���� �����ϸ� break���� ������ ���� �ݺ����� ��������
		 continue�� if���� �����ϸ� continue���� ������ �Ʒ� �ڵ带 �������� �ʴ´�.
		 
		 
		 
		 
		 �μ��� �ּҰ������ ���ϴ� �ڵ鸣 �ۼ��ϼ���
		 �ּҰ������ �μ��� ������� �������� �����
		 ������� �μ��� ����� �������� ������ ���
		 10�� ���: 10 20 30 40 50 60...
		 15�� ��� : 15 30 45 60 75 90
		 10�� 15�� ����� : 30 60 90 120
		 10�� 15�� �ּҰ���� : 30
		   
		  ��		 
		int num1=10, num2=15, i=1, lcm=1;
		for(i=1,lcm=1 ; i<= num1*num2 ;i++){
			//num�� 6�ǹ���̸� => num % 6 == 0
			//i�� num�ǹ���̸� => i % num1 == 0
			if(i % num1 == 0 && i % num2 == 0){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "��" + num2 + "�� �ּҰ���� : " +lcm);
		
		�������ѹ�� 
		
		
		int num1=10000, num2=20000, i=1, lcm=1;
		for(i=num1,lcm=1 ; i<= num1*num2 ;i+=num1){
			//num�� 6�ǹ���̸� => num % 6 == 0
			//i�� num�ǹ���̸� => i % num1 == 0
			if(i % num2 ==0 ){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "��" + num2 + "�� �ּҰ���� : " +lcm);
		
		���������ѹ��
		
		
		int num1=10000, num2=20000, i=1, lcm=1;
		int tmp;
		if(num2>num1){
			//�μ����ٲ۴�(23,24p����)
			tmp = num1;
			num1= num2;
			num2 = tmp;
		}
		for(i=num1,lcm=1 ; i<= num1*num2 ;i+=num1){
			//num�� 6�ǹ���̸� => num % 6 == 0
			//i�� num�ǹ���̸� => i % num1 == 0
			if(i % num2 ==0 ){
				lcm=i;
				break;
			
			}
		}
		
		System.out.println(num1 + "��" + num2 + "�� �ּҰ���� : " +lcm);
		
		
		*/
		
	
	}
}
