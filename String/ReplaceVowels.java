/*Replace All Vowels with a Specific Character ?
Input: "hello", replacement = '*'
Output: "h*ll*"*/

import java.util.*;
public class ReplaceVowels
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		System.out.println("Enter the replacement character:");
		char replacement=sc.next().charAt(0);
		
		String result;
		
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
				{
					result=result+replacement;
				}
				else
				{
					result=result+ch;
				}
		}
		  System.out.println("Output: " + result);
	}
}