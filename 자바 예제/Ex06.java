import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>>");
		int a1 = sc.nextInt();
		
		if(a1 >0 && a1<=99)
		{
			int n10;
			int n01;
			
			n10 = a1 / 10;//���� �ڸ�
			n01 = a1 % 10;//���� �ڸ�
			
			int cnt=0;
			
			if( n10!=0 && n10%3==0)
				cnt++;
			
			if( n01!=0 && n01 % 3 == 0)
				cnt++;
			
			if(cnt==2)
				System.out.println("�ڼ�¦¦");
			else if(cnt ==1)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ� ����");
		}
		else
			System.out.println("1~99������ ���� �Է����ּ���!");

	}

}
