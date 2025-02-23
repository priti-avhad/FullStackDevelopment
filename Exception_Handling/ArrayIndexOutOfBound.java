import java.util.*;
public class ArrayIndexOutOfBound
{
	public static void main(String x[])
	{
		try
		{
			int a[]=new int[]{10,20,30};
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}