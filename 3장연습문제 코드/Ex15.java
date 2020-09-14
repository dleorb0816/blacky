import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		while(true)
		do
		{
			System.out.print("두 수를 입력하시오>>>");
			try 
			{
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.println(n + "x" + m+ "=" + (n*m));
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("실수를 입력하면 아니되옵니다!");
				sc.nextLine();
				continue;
			}
		}while(true);
	}

}
