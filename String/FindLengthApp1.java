import java.util.*;
public class FindLengthApp1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string from keyboard");
		String s=sc.nextLine();
		int index=0;
		try
		{
			for(;;index++)
				s.charAt(index);
		}
		catch (Exception ex)
		{
			
		}
		System.out.println("length of string is : "+index);
	}
}