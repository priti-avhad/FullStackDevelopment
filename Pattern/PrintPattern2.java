public class PrintPattern2
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}