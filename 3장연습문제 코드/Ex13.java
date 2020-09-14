
public class Ex13 {

	public static void main(String[] args) 
	{
		for(int i=1;i<100;++i)
		{
			int n10 = i/10;
			int n01 = i%10;
			
			int cnt=0;
			
			if(n10==3 || n10==6 || n10==9)
				cnt++;
			
			if(n01==3 || n01==6 || n01==9)
				cnt++;
			
			if(cnt==1)
				System.out.println(i+" ¹Ú¼öÂ¦");
			else if(cnt ==2)
				System.out.println(i+" ¹Ú¼öÂ¦Â¦");
			
		}

	}

}
