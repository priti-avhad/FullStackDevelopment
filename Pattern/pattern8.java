public class pattern8
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			int k=1;
			for(int j=1; j<=6; j++)
			{
				if(i>=j)
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