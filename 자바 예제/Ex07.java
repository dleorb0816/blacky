import java.util.Scanner;

public class Ex07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("좌표(x,y)를 입력하세요>>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//사각형 (100,100) , (200,200)
		
		if((x>=100 && x<=200) && (y>=100 && y<=200))
			System.out.println("("+x+","+y+")"+"사각형 안에 있습니다!");
		else
			System.out.println("("+x+","+y+")"+"사각형 안에 XXXXX!");
			

	}

}
