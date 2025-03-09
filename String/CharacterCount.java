/*17.Write a JAVA program to count occurrences of a character in given string.*/

import java.util.*;
public class CharacterCount
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter character to count");
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("the character count is"+count);
	}
}