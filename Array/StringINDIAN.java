/*. Write a java program to create a class name as StringApp to accept charchater array 
and implement the logic.
Input : - Indian
Search Value : - d
Output : - n i*/

import java.util.*;
class String1
{
	char[] charArray;
	public String1(char charArray[])
	{
		this.charArray=charArray;
	}
	
	public void findChar(char searchValue)
	{
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i]==searchValue)
			{
				if(i>0)
				{
					System.out.println(charArray[i-1]);
				}
				if(i<charArray.length-1)
				{
					System.out.println(charArray[i+1]);
				}
			}
		}
	}
}

public class StringINDIAN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the character array");
		int size=sc.nextInt();
		char ch[]=new char[size];
		System.out.println("Enter the characters int the array");
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("Enter the characters to search");
		char searchValue=sc.next().charAt(0);

		String1 sp=new String1(ch);
		sp.findChar(searchValue);
	}
}