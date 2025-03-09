/*13.Write a JAVA program to reverse order of words in a given string.*/

import java.util.*;
public class OrderReverse
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		//split string into words
		String words[]=s.split("");
		
		//reverse order of string
		String reverseSentence="";
		for(int i=words.length-1; i>=0; i--)
		{
			reverseSentence+=words[i];
			if(i>0)
			{
				reverseSentence+="";
				
			}
		}
		System.out.println("reverse order of words");
		System.out.println(reverseSentence);
	}
}