import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("3���� ���� �Է��ϼ���>>>");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		if( (a1+a2<a3) || (a1+a3<a2) || (a2+a3<a1))
			System.out.println("�ﰢ���� �ȵ˴ϴ�!");
		else
			System.out.println("�ﰢ���� �˴ϴ�!");

	}

}
