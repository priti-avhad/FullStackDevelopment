/*	  
	  1       2     3      4     5    6     7
          1      2      3      4     5    6
          1      2      3      4     5
          1      2      3      4
          1      2      3  
          1      2    
          1
          1      2
          1      2      3  
          1      2      3      4
          1      2      3      4     5
          1      2      3      4     5    6
          1       2     3      4     5    6     7
*/

public class pattern23
{
	public static void main(String x[])
	{
		for(int i=1; i<=14; i++)
		{
			int k=1;
			for(int j=1; j<=7; j++)
			{
				if((i<=7 && j<=8-i) ||(i>7 && j<=i-7))
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
