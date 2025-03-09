public class pattern26
{
	public static void main(String x[])
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i>=2-i)
				{
					System.out.print("*");
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