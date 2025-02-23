import java.util.*;
public class NoClassDefFoundError
{
	public static void main(String x[])
	{
		try
		{
			Class.forName("asdfar");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Error is "+ex);
		}
		catch(Throwable ex)
		{
			System.out.println("Error is"+ex);
		}
	}
	
}