/*Write a JAVA program to find reverse of a string.*/

import java.util.*;
public class ReverseStr
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String reverse=" ";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse string is"+reverse);
		
	}
}