/*
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
*/

public class pattern16
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int k=0;
			for(int j=1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print(1+k++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}