import java.util.*;
public class NumberFormatException
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter a number");
		String s=sc.nextLine();
		int a=Integer.parseInt(s);
		System.out.println("A is :"+a);
	}
	catch(Throwable ex)
	{
		System.out.println("Error is : "+ex);
	}
	}
}