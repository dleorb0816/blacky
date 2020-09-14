import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요>>>");
		int a1 = sc.nextInt();
		
		if(a1 >0 && a1<=99)
		{
			int n10;
			int n01;
			
			n10 = a1 / 10;//십의 자리
			n01 = a1 % 10;//일의 자리
			
			int cnt=0;
			
			if( n10!=0 && n10%3==0)
				cnt++;
			
			if( n01!=0 && n01 % 3 == 0)
				cnt++;
			
			if(cnt==2)
				System.out.println("박수짝짝");
			else if(cnt ==1)
				System.out.println("박수짝");
			else
				System.out.println("박수 없음");
		}
		else
			System.out.println("1~99사이의 수를 입력해주세요!");

	}

}
