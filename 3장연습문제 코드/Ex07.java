
public class Ex07 
{
	public static void main(String[] args) 
	{
		int n [] = new int[10];
		
		for(int i=0; i<n.length; ++i)//������ֱ�, �迭��
			n[i] = (int)(Math.random()*10 +1);
		
		for(int i=0; i<n.length; ++i)//��������, �迭��			
			System.out.print(n[i]+" ");
		
		int sum=0;
		for(int i=0; i<n.length; ++i)//�հ� ���ϱ�
			sum = sum + n[i];
		
		System.out.println();
		System.out.println("�հ��"+sum+"�̰�, �����"+(double)sum/n.length);
			
			

	}

}
