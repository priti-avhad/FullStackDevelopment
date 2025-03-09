public class PrintPattern6
{
	public static void main(String x[])
	{
		int i,j;
		for(i=6; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				if(i==1 || i==6 || j==1 || j==i)
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