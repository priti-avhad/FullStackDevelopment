/*
* * * *
 *   *
  * *
   *
  * *
 *   *
* * * *
*/

public class pattern21
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			boolean flag=true;
			for(int j=1; j<=7; j++)
			{
				if((i==1 || i==7 || i==j || i+j==8) && flag)
				{
					System.out.print("*");
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}