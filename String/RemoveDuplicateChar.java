/*5.	Remove Duplicate Characters from a String
Input: "programming"
Output: "progamin"*/

import java.util.*;
public class RemoveDuplicateChar
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		String result=" ";
		
		// Outer loop
		for(int i=0; i<input.length(); i++)
		{
			char currentChar=input.charAt(i);
			boolean flag=false;
			
			 // Inner loop
			 for(int j=0; j<result.length(); j++)
			 {
				 if(currentChar==result.charAt(j))
				 {
					 flag=true;
					 break;
				 }
			 }
			 
		 // If the character is not a duplicate, add it to the result
		 if(!flag)
		 {
			 result=result+currentChar;
		 }
		}
		System.out.println("output is :"+result);
	}
}