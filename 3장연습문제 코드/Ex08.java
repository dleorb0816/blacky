import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>>");
		int size = sc.nextInt();
		
		if(size<=0 || size>100)
		{
			System.out.println("1~100������ ���� �Է��ϼ���!");
			sc.close();
			return;
		}
			
		int arr[] = new int[size];
		
		//�������� üũ�ؼ� ������ �ȵȴ�!
		for(int i=0;i<arr.length;++i)
		{
			int num = (int)(Math.random()*100 +1);
			//�迭�� ���ҿ� ���ϰ� �ִ��� Ȯ��!
			
//			boolean bSame=false;
//			for(int j=0; j<i;++j)
//			{
//				if(arr[j] == num)//�����Է°� num��, �迭�� ���ҿ� ���� ���� ������
//				{
//					bSame = true;
//					break;
//				}
//			}
			
//			if(bSame == true)
//			if(bSame)
			if(check(arr, i, num))
			{
				i--;
				continue;
			}
			
			arr[i] = num;
		}
		
		for(int i=0; i<arr.length;++i)
		{
			if(i==0)
				System.out.print(arr[i] + " ");
			else
			{
				if(i%10 == 0)
					System.out.print("\n");
					
				System.out.print(arr[i] + " ");	
			}
		}
		
		sc.close();
		
	}
	
	public static boolean check(int arr[], int i,int num)
	{
//		boolean bSame=false;
		for(int j=0; j<i;++j)
		{
			if(arr[j] == num)//�����Է°� num��, �迭�� ���ҿ� ���� ���� ������
				return true;								
//			else
//				return false;
		}
		return false;
	}

}
