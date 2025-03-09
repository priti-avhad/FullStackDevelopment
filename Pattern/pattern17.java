/*
	A
	B C
	D E F
	G H I J 
	K L M N O

*/

public class pattern17
{
	public static void main(String x[])
	{
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print(ch++);
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