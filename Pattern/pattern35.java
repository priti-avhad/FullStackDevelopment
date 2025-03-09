public class pattern35
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int k=1;
			for(int j=1; j<=5; j++)
			{
				if(j<=6-i)
				{
					System.out.print(k++);
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