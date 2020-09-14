import java.util.Scanner;

public class Ex03 
{
	public static void main(String[] args) 
	{
		final int 오만원 = 50000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요>>>");
		int money = sc.nextInt();
		
		int cnt = money / 오만원;
		money = money % 오만원;		
		if(cnt >0)
			System.out.println("오만원" + cnt + "장");
		
		cnt = money / 10000;
		money = money % 10000;		
		if(cnt >0)
			System.out.println("만원" + cnt + "장");
		
		cnt = money / 1000;
		money = money % 1000;		
		if(cnt >0)
			System.out.println("천원" + cnt + "장");
		
		cnt = money / 500;
		money = money % 500;		
		if(cnt >0)
			System.out.println("오백원" + cnt + "개");
		
		cnt = money / 100;
		money = money % 100;		
		if(cnt >0)
			System.out.println("백원" + cnt + "개");
		
		cnt = money / 50;
		money = money % 50;
		if(cnt >0)
			System.out.println("오십원" + cnt + "개");
		
		cnt = money / 10;
		money = money % 10;	
		if(cnt >0)
			System.out.println("십원" + cnt + "개");
		
		cnt = money / 1;
		money = money % 1;
		if(cnt >0)
			System.out.println("일원" + cnt + "개");
		
		sc.close();
	}
}
