/* 4. Write a JAVA program to compare two strings
I/P : priti priti
O/P: string is same

I/P : priti sakshi
O/P: string is not same */

import java.util.*;
public class CompareStringEqualOrNot
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=sc.nextLine();
		
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		
		int result=s1.compareTo(s2);
		
		if(result==0)
		{
			System.out.println("String id equal");
		}
		else
		{
			System.out.println("String is not equal");
		}
		
		
	}
}