/*Q5. Write a program to count the frequency of each character in a string using the 
	Character wrapper class and arrays.
	Input: "java"
	Output: j = 1, a = 2, v = 1*/
	
import java.util.*;
public class CharacterFrequency
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		
		int frequency[]=new int[256];
		
		// Calculate frequencies using the Character wrapper class
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
			if(Character.isLetter(c))
			{
				frequency[c]++;
			}
		}
		
		System.out.println("character frequencies");
		for(int i=0; i<frequency.length; i++)
		{
			if(frequency[i]>0)
			{
				System.out.println((char)i+"="+frequency[i]);
			}
		}
	}
}