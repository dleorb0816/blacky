package ex07;

import java.util.Scanner;

public class MonthSchedule 
{
	//1.멤버변수임
	Scanner sc;
	int lastDay;//예: 30 or 31 or 29
	Day dayArr[]; //Day 객체 배열, 몇개 만들지는 모름! 물론 30개 만들겠지만...
	
	//2.생성자? -> 30이라는 숫자? 배열의 갯수! -> Day 객체 배열
	public MonthSchedule(int lastDay) 
	{
		this.sc = new Scanner(System.in);
		this.lastDay = lastDay;
		this.dayArr = new Day[lastDay];
		
		for(int i=0; i<lastDay; ++i)	// "한꺼번"에 객체배열안에 들어갈 "객체"를 만듦
			dayArr[i] = new Day();//객체 만들기
	}	
	
	void run()
	{
		System.out.println("이번달 스케줄 관리프로그램");
		
		while(true)
		{
			System.out.print("할 일: (입력:1, 보기:2, 종료:3) >> ");
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
					System.out.println("잘못입력하셨습니다");
			}
		}
	}

	void input()
	{
		System.out.print("날짜(1~"+ lastDay +") >>");
		int inputDay = sc.nextInt();
		
		if(inputDay > 31)
		{
			System.out.println("1~31 사이의 값을 입력해주세요");
			return;
		}
		
		System.out.print("할일(빈칸없이입력)>>");
		String inputWork = sc.next();
//		inputDay--;//객체배열의 인덱스가  0부터 시작하기 때문에 1을 빼준다.
		
//		dayArr[--inputDay].work = inpuWork;//멤버변수가 private이라 접근 안됨 
		dayArr[--inputDay].set(inputWork);
	}
	
	void view()
	{
		System.out.print("날짜(1~"+ lastDay +") >>");
		int inputDay = sc.nextInt();
		
		if(inputDay > lastDay)
		{
			System.out.println(lastDay+"이내의 값을 입력해주세요!");
			return;
		}
		
		System.out.println(inputDay+"일의 할 일은 ");
		dayArr[--inputDay].show();
		
	}
	
	void finish()
	{
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
