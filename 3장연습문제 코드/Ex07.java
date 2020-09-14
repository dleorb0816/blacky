
public class Ex07 
{
	public static void main(String[] args) 
	{
		int n [] = new int[10];
		
		for(int i=0; i<n.length; ++i)//값집어넣기, 배열에
			n[i] = (int)(Math.random()*10 +1);
		
		for(int i=0; i<n.length; ++i)//값꺼내기, 배열에			
			System.out.print(n[i]+" ");
		
		int sum=0;
		for(int i=0; i<n.length; ++i)//합계 구하기
			sum = sum + n[i];
		
		System.out.println();
		System.out.println("합계는"+sum+"이고, 평균은"+(double)sum/n.length);
			
			

	}

}
