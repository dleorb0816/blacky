import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하세요>>");
		for(int i=0; i<10;++i)
			arr[i] = sc.nextInt();
		
		System.out.println("3의 배수는");
		
		for(int i=0; i<10;++i)
			if(arr[i]%3==0)
				System.out.print(arr[i]+"\t");
		
		
		sc.close();

	}

}
