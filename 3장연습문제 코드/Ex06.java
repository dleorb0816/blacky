import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		final int []unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요>>>");
		int money = sc.nextInt();
		
		for(int i=0; i<unit.length; ++i)
		{
			int cnt = money/unit[i];	
			
			if(cnt > 0 )				
				System.out.println(unit[i]+"권 의 갯수는"+cnt);
			
			money = money % unit[i];
		}

	}

}
