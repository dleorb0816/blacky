import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 수를 입력하세요>>>");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		if( (a1+a2<a3) || (a1+a3<a2) || (a2+a3<a1))
			System.out.println("삼각형이 안됩니다!");
		else
			System.out.println("삼각형이 됩니다!");

	}

}
