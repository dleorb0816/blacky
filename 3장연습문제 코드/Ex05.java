import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� 10���� �Է��ϼ���>>");
		for(int i=0; i<10;++i)
			arr[i] = sc.nextInt();
		
		System.out.println("3�� �����");
		
		for(int i=0; i<10;++i)
			if(arr[i]%3==0)
				System.out.print(arr[i]+"\t");
		
		
		sc.close();

	}

}
