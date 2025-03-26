import java.util.*;
public class PalindromeCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome")
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}