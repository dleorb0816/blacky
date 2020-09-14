import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>>");
		int size = sc.nextInt();
		
		if(size<=0 || size>100)
		{
			System.out.println("1~100까지의 수를 입력하세요!");
			sc.close();
			return;
		}
			
		int arr[] = new int[size];
		
		//같은수를 체크해서 넣으면 안된다!
		for(int i=0;i<arr.length;++i)
		{
			int num = (int)(Math.random()*100 +1);
			//배열의 원소에 동일값 있는지 확인!
			
//			boolean bSame=false;
//			for(int j=0; j<i;++j)
//			{
//				if(arr[j] == num)//현재입력값 num이, 배열의 원소와 같은 값이 있으면
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
			if(arr[j] == num)//현재입력값 num이, 배열의 원소와 같은 값이 있으면
				return true;								
//			else
//				return false;
		}
		return false;
	}

}
