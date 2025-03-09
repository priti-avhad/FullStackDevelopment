/*

1
12
123
1234
12345

*/
public class pattern34
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int k=1;
			for(int j=1; j<=5; j++)
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