package ex07;

import java.util.Scanner;

public class MonthSchedule 
{
	//1.���������
	Scanner sc;
	int lastDay;//��: 30 or 31 or 29
	Day dayArr[]; //Day ��ü �迭, � �������� ��! ���� 30�� ���������...
	
	//2.������? -> 30�̶�� ����? �迭�� ����! -> Day ��ü �迭
	public MonthSchedule(int lastDay) 
	{
		this.sc = new Scanner(System.in);
		this.lastDay = lastDay;
		this.dayArr = new Day[lastDay];
		
		for(int i=0; i<lastDay; ++i)	// "�Ѳ���"�� ��ü�迭�ȿ� �� "��ü"�� ����
			dayArr[i] = new Day();//��ü �����
	}	
	
	void run()
	{
		System.out.println("�̹��� ������ �������α׷�");
		
		while(true)
		{
			System.out.print("�� ��: (�Է�:1, ����:2, ����:3) >> ");
			int choise = sc.nextInt();
			
			switch(choise)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
//					break;
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		}
	}

	void input()
	{
		System.out.print("��¥(1~"+ lastDay +") >>");
		int inputDay = sc.nextInt();
		
		if(inputDay > 31)
		{
			System.out.println("1~31 ������ ���� �Է����ּ���");
			return;
		}
		
		System.out.print("����(��ĭ�����Է�)>>");
		String inputWork = sc.next();
//		inputDay--;//��ü�迭�� �ε�����  0���� �����ϱ� ������ 1�� ���ش�.
		
//		dayArr[--inputDay].work = inpuWork;//��������� private�̶� ���� �ȵ� 
		dayArr[--inputDay].set(inputWork);
	}
	
	void view()
	{
		System.out.print("��¥(1~"+ lastDay +") >>");
		int inputDay = sc.nextInt();
		
		if(inputDay > lastDay)
		{
			System.out.println(lastDay+"�̳��� ���� �Է����ּ���!");
			return;
		}
		
		System.out.println(inputDay+"���� �� ���� ");
		dayArr[--inputDay].show();
		
	}
	
	void finish()
	{
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
