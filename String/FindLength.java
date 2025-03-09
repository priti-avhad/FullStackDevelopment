/*1. Write a JAVA program to find length of a string
ex: i/p: priti
o/p: 5*/

import java.util.*;
public class FindLength
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to find length");
		String s=sc.nextLine();
		int length=s.length();
		System.out.println("the length of string is :"+length);	
	}
}