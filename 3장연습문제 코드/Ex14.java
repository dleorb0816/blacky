import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) 
	{
		String course [ ] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [ ] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("������ �Է��ϼ���>>>");
			String major = sc.next();
			
			if(major.equals("�׸�"))
			{
				System.out.println("��");
				break;
			}

//			boolean bSame=false;
			
			//int last_index=0;
			//��:��ǻ�� ����?
			int i=0;
			for(i=0; i<course.length;++i)
			{
//				if(course[i].equals(major))
				
				//last_index = i;
				
				if(major.equals(course[i]))
				{
					System.out.println(major + "������" + score[i]);
//					bSame = true;
					break;
				}		
			}
			
//			if(!bSame)//�迭�ȿ� �ִ� ������ �� �˻縦 �ߴµ�, ���� ���!
			if(i == score.length)
				System.out.println("�ش� ������ �����ϴ�");
			
		}

	}

}
