/*14.Write a JAVA program to find first occurrence of a character in a given string.*/

import java.util.*;
public class FirstOccurance
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		System.out.println("Enter character to find");
		char ch=sc.next().charAt(0);
		
		int index=s.indexOf(ch);
		if(index!=-1)
		{
			System.out.println("first occurance of character is"+index);
		}
		else
		{
			System.out.println("the character is not found in string");
		}
	}
}