import java.util.Scanner;

public class Ex07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǥ(x,y)�� �Է��ϼ���>>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//�簢�� (100,100) , (200,200)
		
		if((x>=100 && x<=200) && (y>=100 && y<=200))
			System.out.println("("+x+","+y+")"+"�簢�� �ȿ� �ֽ��ϴ�!");
		else
			System.out.println("("+x+","+y+")"+"�簢�� �ȿ� XXXXX!");
			

	}

}
