import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		while(true)
		do
		{
			System.out.print("�� ���� �Է��Ͻÿ�>>>");
			try 
			{
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m+ "=" + (n*m));
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("�Ǽ��� �Է��ϸ� �ƴϵǿɴϴ�!");
				sc.nextLine();
				continue;
			}
		}while(true);
	}

}
