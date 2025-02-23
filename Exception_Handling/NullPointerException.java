public class NullPointerException
{
	static int a[];
	public static void main(String x[])
	{
		try
		{
			a[0]=100;
			System.out.println(a[0]);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}