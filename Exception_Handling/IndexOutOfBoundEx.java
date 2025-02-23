import java.util.*;
public class IndexOutOfBoundEx
{
	public static void main(String x[])
	{
		try
		{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		Object obj=al.get(2);
		System.out.println(obj);
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("Error is : "+ex);
		}
	}
}