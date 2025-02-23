import java.util.*;
public class OutOfMemory
{
	public static void main(String x[])
	{
		try
		{
			int a[]=new int[Integer.MAX_VALUE];
		}
		catch(OutOfMemoryError ex)
		{
			System.out.println(ex);
		}
	}
}