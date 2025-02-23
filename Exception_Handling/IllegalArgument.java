import java.util.*;
public class IllegalArgument
{
	public static void main(String x[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int size;
			System.out.println("Enter size of array");
			size=sc.nextInt();
			if(size<0)
			{
				throw new IllegalArgumentException("invalid argument pass to array should not negative");
			}
			int a[]=new int[size];
			System.out.println("Length of the array is"+a.length);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("Error is"+ex.getMessage());
		}
	}
}