/*
A				  A 
A B             B A 
A B C         C B A
A B C D     D C B A 
A B C D E E D C B A

*/

public class pattern25
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=10; j++)
			{
				if(i>=j || j>=11-i)
				{
					if(i>=j)
					{
						System.out.print(ch++);
					}
					else if(j>=11-i)
					{
						System.out.print(--ch);
					}
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}