public class StackOverflow
{
	public static void main(String x[])
	{
		show();
	}
	
	public static void show()
	{
		try
		{
			show();
		}
		catch(Throwable ex)
		{
			System.out.println("Error is :"+ex);
		}
	}
	
}