
public class Ex12_Add {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0; i<args.length; ++i)
		{
			try 
			{
				int n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			catch(NumberFormatException e)
			{
				System.out.println("number �ͼ��� �߻�");
			}
		}
		System.out.println(sum);
	

	}

}
