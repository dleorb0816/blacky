import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ� �ҹ���(a~z)�� �Է��ϼ���>>");
//		int n = sc.nextInt();
		String str = sc.next();
		
		if(str.length() != 1)
		{
			System.out.println("1���ڸ� �Է��ϼ���!");
			sc.close();
			return;
		}		
		
		char c = str.charAt(0);
		
		if(c < 'a' || c > 'z')
		{
			System.out.println("���ĺ� �ҹ��ڰ� �ƴմϴ�");
			sc.close();
			return;
		}
		
		for(char i=c; i>='a'; --i)
		{
			for(char j='a'; j<=i; j++)
			{
				//System.out.print("*");
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
