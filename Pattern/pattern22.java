/*
1      2       3      4      5     6     7     8      9
       A       B     C     D     E     F    G
                 3     4      5     6     7
                        C     D    E
                                5


*/

public class pattern22
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{   int k=1;
			
			for(int j=1; j<=9; j++)
			{
				if(j>=i && j<=10-i)
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