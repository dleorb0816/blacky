import java.util.Scanner;

public class Ex03 
{
	public static void main(String[] args) 
	{
		final int ������ = 50000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���>>>");
		int money = sc.nextInt();
		
		int cnt = money / ������;
		money = money % ������;		
		if(cnt >0)
			System.out.println("������" + cnt + "��");
		
		cnt = money / 10000;
		money = money % 10000;		
		if(cnt >0)
			System.out.println("����" + cnt + "��");
		
		cnt = money / 1000;
		money = money % 1000;		
		if(cnt >0)
			System.out.println("õ��" + cnt + "��");
		
		cnt = money / 500;
		money = money % 500;		
		if(cnt >0)
			System.out.println("�����" + cnt + "��");
		
		cnt = money / 100;
		money = money % 100;		
		if(cnt >0)
			System.out.println("���" + cnt + "��");
		
		cnt = money / 50;
		money = money % 50;
		if(cnt >0)
			System.out.println("���ʿ�" + cnt + "��");
		
		cnt = money / 10;
		money = money % 10;	
		if(cnt >0)
			System.out.println("�ʿ�" + cnt + "��");
		
		cnt = money / 1;
		money = money % 1;
		if(cnt >0)
			System.out.println("�Ͽ�" + cnt + "��");
		
		sc.close();
	}
}
