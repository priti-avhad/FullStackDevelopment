/*Q.3 Write a java program to take 5 elements and display only odd elements from the array.*/

import java.util.*;
public class FindOddEleInArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Find the odd elements");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}