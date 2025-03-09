public class PrintPattern5
{
	public static void main(String x[])
	{
		int i,j; 
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=6; j++)
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