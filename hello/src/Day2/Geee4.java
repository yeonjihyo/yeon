package Day2;

import java.util.Scanner;

public class Geee4 {

	public static void main(String[] args) {
		
		/*��������7��������ϴ��ڵ带�ݺ������̿��Ͽ��ۼ��ϼ���
		int i=0;
		int num = 7;
		for(i=1; i<=9 ; i++ ){
			System.out.println("7x " + i +" = " +num*i);
	}*/
			
		
		//������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��ϼ���
		//�Ҽ�:����� 1���ڱ��ڽ��μ�, �����2���μ�
		//���: �ڽź��� �۰ų� ���� ���߿��� ������ �������� 0�μ�
		//4�� ��� 1 2 4
		//�Է¹������� :num
		//����ǰ��� : cnt
		//�ݺ������� ����� ���� : i
		//�ݺ�Ƚ�� : i�� 1���� num���� �۰ų� ������ ����1�� �����Ѵ�
		//���๮
		//i�� num�� ����̸� ����� ������ �ϳ�����
		//�ݺ��������ľ���ǰ�����2���̸� �Ҽ�������
		//2�����ƴϸ�Ҽ����ƴ��̶�����
		
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		//�ݺ�Ƚ�� : i�� 1���� num���� �۰ų� ���������� 1�� �����Ѵ�
		for(i=1,cnt=0; i<=num; i++){
			//i�� num�� ����̸� ����� ������ �ϳ�����
			//num�� i�� ���������� �������� 0�� ���� =>i�� num�� ���
			if(num % i ==0){
				//if(i�� num�� ���)
				cnt++;//cnt +=1;//cnt=cnt+1//++cnt;
			}
		}
		//����� ������ 2���̸� �Ҽ���� ���
		if(cnt ==2){
			System.out.println(num+"�¼Ҽ�");
		}
	
		//2���� �ƴϸ� �Ҽ��� �ƴ��̶�����
		else{
			System.out.println(num+"�¼Ҽ����ƴ�");
		}
	
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
		}
	
	
	
	
	
	
	
	
	

	}

}
