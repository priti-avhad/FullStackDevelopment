import java.util.*;
public class NullPointerString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter a string");
		String str=null;
		System.out.println("length of String is"+str.length());
	}
	catch(Throwable ex)
	{
		System.out.println("Error is : "+ex);	
	}
	}
}