/*12. Write a JAVA program to check whether a string is palindrome or not*/

import java.util.*;
public class PalindromeCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String reverse="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}