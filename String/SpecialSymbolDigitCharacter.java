/*8. Write a JAVA program to find total number of alphabets, digits or special character in a string.
 I/P:  priti!@#$%^&*1234
 O/P:  total alphabets : 5
	   total digits : 4
	    total special characters : 8  */

import java.util.*;
public class SpecialSymbolDigitCharacter
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int alphabet=0;
		int digitcount=0;
		int specialcharcount=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char currentchar=s.charAt(i);
			if((currentchar>=65 && currentchar<=90) || (currentchar>=97 && currentchar<=122))
			{
				alphabet++;
			}
			else if(currentchar>=48 && currentchar<=57)
			{
				digitcount++;
			}
			else
			{
				specialcharcount++;
			}
		}
		
		System.out.println("total alphabets : "+alphabet);
		System.out.println("total digits : "+digitcount);
		System.out.println("total special characters : "+specialcharcount);
	}
}