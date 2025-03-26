/*Q.5 Write a java program to find positive and negative number from array.*/

import java.util.*;
public class PosNegIntegerFind
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>=0)
			{
				System.out.println("positive integer : "+a[i]);
			}
			else
			{
				System.out.println("Negative integer : "+a[i]);
			}
		}
	}
}