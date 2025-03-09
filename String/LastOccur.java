/*15.Write a JAVA program to find last occurrence of a character in a given string.*/

import java.util.*;
public class LastOccur
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		System.out.println("Enter the character to find");
		char ch=sc.next().charAt(0);
		
		int index=s.lastIndexOf(ch);
		if(index!=-1)
		{
			System.out.println("the last index is"+index);
		}
		else
		{
			System.out.println("the character is not found");
		}
	}
}