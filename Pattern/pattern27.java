/*

*****
*   *
*****

*/
public class pattern27
{
	public static void main(String x[])
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1|| j==1 || j==5 || i==3)
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