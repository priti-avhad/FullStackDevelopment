import java.util.*;
public class ArithmeticEx
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
		int a,b,c;
		System.out.println("Enter two values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is"+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}