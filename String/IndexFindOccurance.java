/*14.Write a JAVA program to find first occurrence of a character in a given string
Enter the string:
Hello World
Enter the character to find:
o
The first occurrence of the character 'o' is at index: 4
*/

import java.util.*;
public class IndexFindOccurance
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		System.out.println("Enter character to find");
		char targetchar=sc.next().charAt(0);
		
		int index=s.indexOf(targetchar);
		if(index!=-1)
		{
			System.out.println("the first occurance of the character is :"+targetchar+"is at index: "+index);
		}
		else
		{
			System.out.println("the character"+targetchar+"is not found in the string");
		}
	}
	
}