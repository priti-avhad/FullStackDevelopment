import java.util.*;
public class NoSuchElementEx
{
	public static void main(String x[])
	{
		try
		{
		List al=new ArrayList();
		Iterator i=al.iterator();
		System.out.println(i.next());
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("Error is :"+ex);
		}
	}
}