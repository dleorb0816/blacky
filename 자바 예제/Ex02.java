import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num < 10 || num > 99)
		{
			System.out.println("10~99���� �Է�!");
			sc.close();
			return;
		}
		
		int num_10;
		int num_01;
		
		num_10 = num / 10;
		num_01 = num % 10;
		
		if(num_10 == num_01)
			System.out.println("10�� 1�� ����");
		else
			System.out.println("10�� 1�� �ٸ���");
	}

}
