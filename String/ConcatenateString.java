/*Write a JAVA program to concatenate two strings
I/P: priti AKash
O/P: pritiakash
*/

import java.util.*;
public class ConcatenateString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		
		String concatenatedString=s1.concat(s2);
		System.out.println("String after concatination is :" +concatenatedString);
	}
}